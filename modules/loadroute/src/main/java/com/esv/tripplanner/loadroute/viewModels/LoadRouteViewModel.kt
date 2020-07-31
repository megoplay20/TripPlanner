package com.esv.tripplanner.loadroute.viewModels

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.esv.tripplanner.core_api.data.entities.relation_classes.TripVisitPlansRelation
import com.esv.tripplanner.core_api.helpers.AndroidObservableViewModel
import com.esv.tripplanner.core_api.repositories.ITripRepository
import kotlinx.coroutines.launch

class LoadRouteViewModel(
    app: Application,
    private val repository: ITripRepository
):AndroidObservableViewModel(app) {


    fun deleteAllEmptyCreatedTrips(){
        viewModelScope.launch {
            repository.deleteAllEmptyTrips()
        }
    }


    var trips: LiveData<List<TripVisitPlansRelation>> = repository.getTrips()

}