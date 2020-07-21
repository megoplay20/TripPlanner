package com.esv.tripplanner.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.esv.tripplanner.R
import com.esv.tripplanner.adapters.PoiVisitPlaceAdapter
import com.esv.tripplanner.application.TripPlannerApplication
import com.esv.tripplanner.databinding.NewRouteFragmentBinding
import com.esv.tripplanner.repositories.ITripRepository
import com.esv.tripplanner.utils.IDateProcessor
import com.esv.tripplanner.utils.ITypeCaster
import com.esv.tripplanner.viewModels.NewRouteViewModel
import com.esv.tripplanner.viewModels.viewModelFactories.NewRouteViewModelFactory
import javax.inject.Inject

class NewRouteFragment : InjectableFragment() {

    @Inject
    lateinit var typeCaster: ITypeCaster

    @Inject
    lateinit var dateProcessor: IDateProcessor

    @Inject
    lateinit var repository: ITripRepository


    private lateinit var viewModel: NewRouteViewModel
    private lateinit var binding: NewRouteFragmentBinding

    private var tripId = -1

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        arguments?.let {
            val args = NewRouteFragmentArgs.fromBundle(it)
            tripId = args.tripId
        }

        viewModel = ViewModelProvider(
            requireActivity(),
            NewRouteViewModelFactory(
                this.requireActivity().application, repository, dateProcessor
            )
        ).get(NewRouteViewModel::class.java)

        viewModel.init(tripId)

        binding = DataBindingUtil.inflate<NewRouteFragmentBinding>(
            inflater,
            R.layout.new_route_fragment,
            container,
            false
        );

        binding.viewModel = viewModel
        // Inflate the layout for this fragment
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.placesList.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)

        val adapter =
            PoiVisitPlaceAdapter(
                tripId,
                requireActivity().application,
                arrayListOf(),
                typeCaster,
                repository
            )
        binding.placesList.adapter = adapter
        viewModel.tripVisitPlacesRelations.observe(viewLifecycleOwner, Observer {
            it?.let {
                if (it.isNotEmpty())
                    adapter.setPlaces(it.first().pointOfInterestVisitPlanList)
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


    }

    override fun performInjection() {
        TripPlannerApplication.tripPlannerAppInstance.appComponent.inject(this)
    }
}