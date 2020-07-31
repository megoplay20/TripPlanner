package com.esv.tripplanner.followroute.viewModels

import android.app.Application
import androidx.databinding.Bindable
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.esv.tripplanner.core_api.data.entities.Trip
import com.esv.tripplanner.core_api.data.entities.relation_classes.TripRouteRelation
import com.esv.tripplanner.core_api.data.entities.relation_classes.TripVisitPlansRelation
import com.esv.tripplanner.core_api.helpers.AndroidObservableViewModel
import com.esv.tripplanner.core_api.helpers.IDateProcessor
import kotlinx.coroutines.launch
import java.util.*
import kotlin.properties.Delegates

class FollowRouteViewModel(
    app: Application,
    private val repository: com.esv.tripplanner.core_api.repositories.ITripRepository
):
    AndroidObservableViewModel(app) {


    lateinit var tripRouteRelation: LiveData<List<TripRouteRelation>>
    var tripId by Delegates.notNull<Int>()

    fun init(tripId: Int){
        this.tripId= tripId
        tripRouteRelation = repository.getTripRoute(tripId);
    }

}