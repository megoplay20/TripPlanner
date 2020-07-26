package com.esv.tripplanner.loadroute.viewModels

import android.app.Application
import androidx.lifecycle.LiveData
import com.esv.tripplanner.core_api.data.entities.relation_classes.TripVisitPlansRelation
import com.esv.tripplanner.core_api.helpers.AndroidObservableViewModel
import com.esv.tripplanner.core_api.repositories.ITripRepository

class LoadRouteViewModel(
    app: Application,
    repository: ITripRepository
):AndroidObservableViewModel(app) {

    var trips: LiveData<List<TripVisitPlansRelation>> = repository.getTrips()

}