package com.esv.tripplanner.viewModels

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavDirections
import com.esv.tripplanner.R
import com.esv.tripplanner.fragments.StartFragmentDirections
import com.esv.tripplanner.helpers.AndroidObservableViewModel
import com.esv.tripplanner.helpers.Event
import com.esv.tripplanner.repositories.ITripRepository
import kotlinx.coroutines.launch

class StartFragmentViewModel(
    app: Application,
    private val repository: ITripRepository
): AndroidObservableViewModel(app){
    private val _navigateAction: MutableLiveData<Event<NavDirections>> = MutableLiveData();
    val navigateAction: LiveData<Event<NavDirections>> get() = _navigateAction

    fun navigateToStartNewRoute(){
        viewModelScope.launch{
            val newTripId =
                repository.createEmptyTrip(app.getString(R.string.newEmptyTripTitile))
            _navigateAction.value = Event(StartFragmentDirections.startNewRouteAction(newTripId.toInt()))
        }
    }

    fun navigateToLoadExistingRoute(){
        this._navigateAction.value = Event(StartFragmentDirections.loadRouteAction())
    }
}