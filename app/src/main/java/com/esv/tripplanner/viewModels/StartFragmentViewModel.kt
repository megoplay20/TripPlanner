package com.esv.tripplanner.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.navigation.NavController
import androidx.navigation.NavDirections
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.esv.tripplanner.fragments.StartFragmentDirections
import com.esv.tripplanner.helpers.Event
import com.esv.tripplanner.helpers.ObservableViewModel

class StartFragmentViewModel: ObservableViewModel(){
    private val _navigateAction: MutableLiveData<Event<NavDirections>> = MutableLiveData();
    val navigateAction: LiveData<Event<NavDirections>> get() = _navigateAction

    fun navigateToStartNewRoute(){
            this._navigateAction.value = Event(StartFragmentDirections.startNewRouteAction())
    }

    fun navigateToLoadExistingRoute(){
        this._navigateAction.value = Event(StartFragmentDirections.loadRouteAction())
    }
}