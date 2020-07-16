package com.esv.tripplanner.startscreen.viewModels

import android.app.Application
import androidx.lifecycle.viewModelScope
import com.esv.tripplanner.core.helpers.AndroidObservableViewModel
import com.esv.tripplanner.core.data.repositories.ITripRepository
import com.esv.tripplanner.core.navigation.INavigationProvider
import com.esv.tripplanner.startscreen.R
import kotlinx.coroutines.launch

class StartFragmentViewModel(
    app: Application,
    private val repository: ITripRepository,
    private val navigator: INavigationProvider?
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