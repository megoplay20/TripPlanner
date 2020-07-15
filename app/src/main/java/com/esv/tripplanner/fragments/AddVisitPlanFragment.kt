package com.esv.tripplanner.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.esv.tripplanner.R
import com.esv.tripplanner.adapters.NothingSelectedSpinnerAdapter
import com.esv.tripplanner.adapters.PointOfInterestSpinnerAdapter
import com.esv.tripplanner.application.TripPlannerApplication
import com.esv.tripplanner.databinding.AddOrEditPointOfInterestVisitPlansBinding
import com.esv.tripplanner.entities.PointOfInterestVisitPlan
import com.esv.tripplanner.core.data.repositories.ITripRepository
import com.esv.tripplanner.core.di.AppWithFacade
import com.esv.tripplanner.core.helpers.ITypeCaster
import com.esv.tripplanner.di.AddVisitPlanComponent
import com.esv.tripplanner.di.StartComponent
import com.esv.tripplanner.viewModels.PointOfInterestVisitPlansViewModel
import com.esv.tripplanner.viewModels.viewModelFactories.RepositoryAwareViewModel
import javax.inject.Inject

class AddVisitPlanFragment: InjectableFragment() {

    @Inject
    lateinit var typeCaster: ITypeCaster

    @Inject
    lateinit var repository: ITripRepository

    private lateinit var viewModel: PointOfInterestVisitPlansViewModel
    private var tripId = -1

    private lateinit var binding:AddOrEditPointOfInterestVisitPlansBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.add_or_edit_point_of_interest_visit_plans,
            container,
            false
        );

        arguments?.let {
            val args = AddVisitPlanFragmentArgs.fromBundle(it)
            tripId = args.tripId
        }

        viewModel = ViewModelProvider(
            requireActivity(),
            RepositoryAwareViewModel(
                this.requireActivity().application, repository
            )
        ).get(PointOfInterestVisitPlansViewModel::class.java)

        viewModel.initVisitPlansViewModel(tripId,
            PointOfInterestVisitPlan(-1, 0.5, false),
            typeCaster)

        binding.viewModel = viewModel
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = PointOfInterestSpinnerAdapter(requireActivity().application,  R.layout.point_of_interest_layout, arrayListOf(),typeCaster,repository)

        val nothingAdapter = NothingSelectedSpinnerAdapter(adapter, R.layout.nothing_selected_spinner_layout, requireContext())

        binding.placeSelector.adapter = nothingAdapter

        viewModel.pointOfInterestList.observe(viewLifecycleOwner, Observer {
            it?.let {
                    adapter.setPoints(mutableListOf(*it.toTypedArray()))
            }
        })

        viewModel.navigateAction.observe(this.viewLifecycleOwner, Observer { event ->
            event.getContentIfNotHandled()?.let { navDirection ->
                try {
                    Navigation.findNavController(view).navigate(navDirection)
                } catch (e: IllegalArgumentException) {
                    e.printStackTrace();
                }
            }

        });

        viewModel.backAction.observe(viewLifecycleOwner, Observer { event->
            event.getContentIfNotHandled()?.let {
                Navigation.findNavController(view).popBackStack()
            }
        })


    }

    override fun performInjection() {
        AddVisitPlanComponent.createComponent((requireActivity().application as AppWithFacade)
            .getProvidersFacade())
            .inject(this);
    }
}