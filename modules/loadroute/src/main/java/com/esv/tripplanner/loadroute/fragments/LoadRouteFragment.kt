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
import com.esv.tripplanner.core_api.data.entities.PointOfInterestVisitPlan
import com.esv.tripplanner.core_api.data.entities.Trip
import com.esv.tripplanner.core_api.data.entities.relation_classes.TripVisitPlansRelation
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
import kotlin.random.Random


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
            context,
            RecyclerView.VERTICAL
        )
        trips.addItemDecoration(dividerItemDecoration)


        // add dummy test data
        val adapter =
            TripItemsAdapter(
                requireActivity().application,
                getDummyData(),
                navComponent.provideNavigator()
            )
        trips.trips.adapter = adapter

        super.onViewCreated(view, savedInstanceState)
    }

    override fun performInjection() {
        LoadRouteComponent.createComponent(
            (requireActivity().application as AppWithFacade)
                .getProvidersFacade()
        )
            .inject(this)
    }


    private fun getDummyData():MutableList<TripVisitPlansRelation>{
        val items: MutableList<TripVisitPlansRelation> = mutableListOf()
        items.add(getDummyTripRelation(5))
        items.add(getDummyTripRelation(15))
        items.add(getDummyTripRelation(50))
        items.add(getDummyTripRelation(150))
        items.add(getDummyTripRelation(250))
        return items
    }

    private fun getDummyTripRelation(poiCount: Int): TripVisitPlansRelation{
        val dummyTrip = Trip("My trip_${Random(0).nextInt()}", "", Math.random() > 0.3)
        return  TripVisitPlansRelation(dummyTrip, getRandomPoiVisitPlan(poiCount))
    }

    private fun getRandomPoiVisitPlan(count: Int): List<PointOfInterestVisitPlan> {
        val items: MutableList<PointOfInterestVisitPlan> = mutableListOf()
        for (i in 0 until count) {
            items.add(PointOfInterestVisitPlan(i, Math.random(), Math.random() > 0.3))
        }
        return items
    }

}