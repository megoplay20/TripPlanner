package com.esv.tripplanner.newroute.viewModels

import com.esv.tripplanner.newroute.BR
import android.app.Application
import androidx.databinding.Bindable
import androidx.lifecycle.viewModelScope
import com.esv.tripplanner.core_api.di.IPlanRouteActions
import com.esv.tripplanner.core_api.helpers.AndroidObservableViewModel
import com.esv.tripplanner.core_api.navigation.INavigationProvider
import com.esv.tripplanner.core_api.repositories.ITripRepository
import com.esv.tripplanner.shared_ui.viewModels.LoaderViewModel
import kotlinx.coroutines.launch
import kotlin.properties.Delegates

class RouteGeneratorViewModel(
    app: Application,
    private val repository: ITripRepository,
    private val nav: INavigationProvider,
    val routePlanner: IPlanRouteActions
) : AndroidObservableViewModel(app) {

    var loaderViewModel: LoaderViewModel = LoaderViewModel()

    init {
        loaderViewModel.alphaChannel = 0.8f
    }

    var tripId by Delegates.notNull<Int>()

    @get:Bindable
    var isRouteGenerated: Boolean = false
        set(value) {
            if (value != field) {
                field = value
                viewModelScope.launch{
                    val trip = repository.getTripById(tripId)
                        trip.let {
                            it.isRouteGenerated = field
                            repository.updateTrip(trip = it)
                        }
                }
                notifyPropertyChanged(BR.routeGenerated)
            }
        }

    fun init(tripId: Int) {
        this.tripId = tripId
        viewModelScope.launch {
            isRouteGenerated = repository.getTripById(tripId).isRouteGenerated
            notifyPropertyChanged(BR.routeGenerated)
        }
    }

    fun regenerateRoute() {
        //delete old route info

        generateRoute()
    }

    fun generateRoute() {
        loaderViewModel.executeLongOperation {
                val optimalRoute = routePlanner.findOptimalRoute(this.tripId )
                repository.addOptimalRoute(optimalRoute.getTripId(), optimalRoute.getPlacesOfVisitOrdered())
                isRouteGenerated = true
        }
    }

    fun followRoute() {
        nav.followRoute(tripId)
    }
}