package com.esv.tripplanner.newroute.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.esv.tripplanner.core_api.di.AppWithFacade
import com.esv.tripplanner.core_api.di.IPlanRouteActions
import com.esv.tripplanner.core_api.helpers.IDateProcessor
import com.esv.tripplanner.core_api.helpers.ITypeCaster
import com.esv.tripplanner.newroute.R
import com.esv.tripplanner.newroute.adapters.PoiVisitPlaceAdapter
import com.esv.tripplanner.newroute.databinding.NewRouteFragmentBinding
import com.esv.tripplanner.newroute.di.NewRouteComponent
import com.esv.tripplanner.newroute.viewModels.NewRouteViewModel
import com.esv.tripplanner.newroute.viewModels.RouteGeneratorViewModel
import javax.inject.Inject

class NewRouteFragment : com.esv.tripplanner.core_api.ui.InjectableFragment() {

    @Inject
    lateinit var typeCaster: ITypeCaster

    @Inject
    lateinit var dateProcessor: IDateProcessor

    @Inject
    lateinit var repository: com.esv.tripplanner.core_api.repositories.ITripRepository

    @Inject
    lateinit var navComponent: com.esv.tripplanner.core_api.navigation.INavigatorComponentsProvider

    @Inject
    lateinit var routePlanner: IPlanRouteActions



    private lateinit var viewModel: NewRouteViewModel
    private lateinit var binding: NewRouteFragmentBinding

    private var tripId = -1

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        tripId = navComponent.provideArguments().getTripIdFromArgs(arguments)

        viewModel = ViewModelProvider(
            requireActivity(),
            com.esv.tripplanner.core_api.viewModelFactories.CustomViewModelProviderFactory(
            ) {
                NewRouteViewModel(
                    requireActivity().application,
                    repository,
                    dateProcessor,
                    navComponent.provideNavigator(),
                    RouteGeneratorViewModel(requireActivity().application, repository, navComponent.provideNavigator(),routePlanner)
                )
            }
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
                repository,
                navComponent.provideNavigator()
            )
        binding.placesList.adapter = adapter
        viewModel.tripVisitPlacesRelations.observe(viewLifecycleOwner, Observer {
            it?.let {
                if (it.isNotEmpty())
                    adapter.setPlaces(it.first().pointOfInterestVisitPlanList)
            }
        })

    }

    override fun performInjection() {
        val app = (requireActivity().application as AppWithFacade)
        NewRouteComponent.createComponent(app.getProvidersFacade(), app.getNetwork())
            .inject(this)
    }
}