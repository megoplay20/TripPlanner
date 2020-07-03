package com.esv.tripplanner.viewModels

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavController
import androidx.navigation.NavDirections
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.esv.tripplanner.R
import com.esv.tripplanner.database.TripDatabase
import com.esv.tripplanner.fragments.StartFragmentDirections
import com.esv.tripplanner.helpers.AndroidObservableViewModel
import com.esv.tripplanner.helpers.Event
import com.esv.tripplanner.helpers.ObservableViewModel
import com.esv.tripplanner.repositories.ITripRepository
import com.esv.tripplanner.repositories.TripDatabaseRepository
import com.esv.tripplanner.repositories.TripRepositoryFactory
import kotlinx.coroutines.launch

class StartFragmentViewModel(app:Application): AndroidObservableViewModel(app){
    private val _navigateAction: MutableLiveData<Event<NavDirections>> = MutableLiveData();
    val navigateAction: LiveData<Event<NavDirections>> get() = _navigateAction
    private var repository: ITripRepository

    init{
        val database = TripDatabase.getDatabase(app.applicationContext)
        repository = TripRepositoryFactory.getDatabaseRepositoryInstance(database)
    }

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