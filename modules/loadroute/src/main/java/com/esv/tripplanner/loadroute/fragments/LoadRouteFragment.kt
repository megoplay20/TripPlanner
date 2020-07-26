package com.esv.tripplanner.loadroute.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.esv.tripplanner.core_api.di.AppWithFacade
import com.esv.tripplanner.core_api.ui.InjectableFragment
import com.esv.tripplanner.core_api.viewModelFactories.CustomViewModelProviderFactory
import com.esv.tripplanner.loadroute.R
import com.esv.tripplanner.loadroute.adapters.TripItemsAdapter
import com.esv.tripplanner.loadroute.di.LoadRouteComponent
import com.esv.tripplanner.loadroute.viewModels.LoadRouteViewModel
import kotlinx.android.synthetic.main.load_route_fragment.*
import kotlinx.android.synthetic.main.load_route_fragment.view.*
import javax.inject.Inject


class LoadRouteFragment : InjectableFragment() {

    @Inject
    lateinit var navComponent: com.esv.tripplanner.core_api.navigation.INavigatorComponentsProvider

    @Inject
    lateinit var repository: com.esv.tripplanner.core_api.repositories.ITripRepository

    private lateinit var viewModel: LoadRouteViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        viewModel = ViewModelProvider(
            requireActivity(),
            CustomViewModelProviderFactory(
            ) {
                LoadRouteViewModel(
                    requireActivity().application,
                    repository
                )
            }
        ).get(LoadRouteViewModel::class.java)

        return layoutInflater.inflate(R.layout.load_route_fragment, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        trips.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)

        val dividerItemDecoration = DividerItemDecoration(
            trips.getContext(),
            RecyclerView.VERTICAL
        )
        trips.addItemDecoration(dividerItemDecoration)
        val adapter =
            TripItemsAdapter(
                requireActivity().application,
                arrayListOf(),
                navComponent.provideNavigator()
            )
        trips.trips.adapter = adapter

        viewModel.trips.observe(viewLifecycleOwner, Observer {
            it?.let {
                if (it.isNotEmpty())
                    adapter.setTrips(it)
            }
        })

        super.onViewCreated(view, savedInstanceState)
    }

    override fun performInjection() {
        LoadRouteComponent.createComponent((requireActivity().application as AppWithFacade)
            .getProvidersFacade())
            .inject(this)
    }
}