package com.esv.tripplanner.loadroute.viewModels

import android.app.Application
import androidx.databinding.Bindable
import com.esv.tripplanner.core_api.data.entities.relation_classes.TripVisitPlansRelation
import com.esv.tripplanner.core_api.helpers.AndroidObservableViewModel
import java.util.*

class TripItemViewModel(app: Application, val trip: TripVisitPlansRelation) : AndroidObservableViewModel(app) {


    @get:Bindable
    var tripItemCount:Int = 0

    @get:Bindable
    var  tripTimeHrs: Double = 0.0

    @get:Bindable
    var  tripName: String = ""

    @get:Bindable
    var  isTripPlanned: Boolean = false

    @get:Bindable
    var  isTripOutdated: Boolean = false

    init {
        tripItemCount = trip.pointOfInterestVisitPlanList.size
        tripName = trip.trip.name
        isTripPlanned = trip.trip.isRouteGenerated
        isTripOutdated = trip.trip.dateSaved < Date()
        tripTimeHrs = trip.pointOfInterestVisitPlanList.map { it.visitTimeHrs ?: 0.0 }.sum()
    }

}