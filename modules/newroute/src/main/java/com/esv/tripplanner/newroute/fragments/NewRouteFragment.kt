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
import com.esv.tripplanner.core.data.repositories.ITripRepository
import com.esv.tripplanner.core.di.AppWithFacade
import com.esv.tripplanner.core.helpers.IDateProcessor
import com.esv.tripplanner.core.helpers.ITypeCaster
import com.esv.tripplanner.core.navigation.INavigatorComponentsProvider
import com.esv.tripplanner.core.ui.InjectableFragment
import com.esv.tripplanner.core.viewModelFactories.CustomViewModelProviderFactory
import com.esv.tripplanner.newroute.R
import com.esv.tripplanner.newroute.adapters.PoiVisitPlaceAdapter
import com.esv.tripplanner.newroute.databinding.NewRouteFragmentBinding
import com.esv.tripplanner.newroute.di.NewRouteComponent
import com.esv.tripplanner.newroute.viewModels.NewRouteViewModel
import javax.inject.Inject

class NewRouteFragment : InjectableFragment() {

    @Inject
    lateinit var typeCaster: ITypeCaster

    @Inject
    lateinit var dateProcessor: IDateProcessor

    @Inject
    lateinit var repository: ITripRepository

    @Inject
    lateinit var navComponent: INavigatorComponentsProvider


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
            CustomViewModelProviderFactory(
            ){NewRouteViewModel(requireActivity().application, repository, dateProcessor, navComponent.provideNavigator())}
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
        NewRouteComponent.createComponent((requireActivity().application as AppWithFacade)
            .getProvidersFacade())
            .inject(this)
    }
}