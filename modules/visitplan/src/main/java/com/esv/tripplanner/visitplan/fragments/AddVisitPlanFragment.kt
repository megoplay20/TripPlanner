package com.esv.tripplanner.visitplan.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.esv.tripplanner.entities.PointOfInterestVisitPlan
import com.esv.tripplanner.core.data.repositories.ITripRepository
import com.esv.tripplanner.core.di.AppWithFacade
import com.esv.tripplanner.core.helpers.ITypeCaster
import com.esv.tripplanner.core.navigation.INavigatorComponentsProvider
import com.esv.tripplanner.core.ui.InjectableFragment
import com.esv.tripplanner.shared_ui.viewModels.PointOfInterestVisitPlansViewModel
import com.esv.tripplanner.core.viewModelFactories.CustomViewModelProviderFactory
import com.esv.tripplanner.visitplan.R
import com.esv.tripplanner.visitplan.adapters.NothingSelectedSpinnerAdapter
import com.esv.tripplanner.visitplan.adapters.PointOfInterestSpinnerAdapter
import com.esv.tripplanner.visitplan.databinding.AddOrEditPointOfInterestVisitPlansBinding
import javax.inject.Inject

class AddVisitPlanFragment: InjectableFragment() {

    @Inject
    lateinit var typeCaster: ITypeCaster

    @Inject
    lateinit var repository: ITripRepository

    @Inject
    lateinit var navComponent: INavigatorComponentsProvider

    private lateinit var viewModel: PointOfInterestVisitPlansViewModel
    private var tripId = -1

    private lateinit var binding: AddOrEditPointOfInterestVisitPlansBinding

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

        tripId = navComponent.provideArguments().getTripIdFromAddVisitPlanArgs(arguments)

        viewModel = ViewModelProvider(
            requireActivity(),
            CustomViewModelProviderFactory(){
                PointOfInterestVisitPlansViewModel(
                    this.requireActivity().application,
                    repository,
                    navComponent.provideNavigator()
                )
            }
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
        val adapter = PointOfInterestSpinnerAdapter(requireActivity().application,
            R.layout.point_of_interest_layout, arrayListOf(),
            typeCaster,repository, navComponent.provideNavigator())

        val nothingAdapter = NothingSelectedSpinnerAdapter(adapter, R.layout.nothing_selected_spinner_layout, requireContext())

        binding.placeSelector.adapter = nothingAdapter

        viewModel.pointOfInterestList.observe(viewLifecycleOwner, Observer {
            it?.let {
                    adapter.setPoints(mutableListOf(*it.toTypedArray()))
            }
        })



    }

    override fun performInjection() {
        com.esv.tripplanner.visitplan.di.AddVisitPlanComponent.createComponent((requireActivity().application as AppWithFacade)
            .getProvidersFacade())
            .inject(this);
    }
}