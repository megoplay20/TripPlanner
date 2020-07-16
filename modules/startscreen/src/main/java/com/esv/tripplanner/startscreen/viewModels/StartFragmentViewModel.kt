package com.esv.tripplanner.startscreen.viewModels

import android.app.Application
import androidx.lifecycle.viewModelScope
import com.esv.tripplanner.core_api.helpers.AndroidObservableViewModel
import com.esv.tripplanner.core_api.repositories.ITripRepository
import com.esv.tripplanner.core_api.navigation.INavigationProvider
import com.esv.tripplanner.startscreen.R
import kotlinx.coroutines.launch

class StartFragmentViewModel(
    app: Application,
    private val repository: com.esv.tripplanner.core_api.repositories.ITripRepository,
    private val navigator: com.esv.tripplanner.core_api.navigation.INavigationProvider?
): AndroidObservableViewModel(app){



    fun navigateToStartNewRoute(){
        viewModelScope.launch{
            val newTripId =
                repository.createEmptyTrip(app.getString(R.string.newEmptyTripTitile))
            navigator?.startNewRouteAction(newTripId.toInt());
        }
    }

    fun navigateToLoadExistingRoute(){

    }
}