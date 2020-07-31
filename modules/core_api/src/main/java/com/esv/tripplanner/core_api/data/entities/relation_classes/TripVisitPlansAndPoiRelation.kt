package com.esv.tripplanner.core_api.data.entities.relation_classes

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.esv.tripplanner.core_api.data.entities.PointOfInterestVisitPlan
import com.esv.tripplanner.core_api.data.entities.Trip
import com.esv.tripplanner.core_api.data.entities.TripPointOfInterestVisitPlanJoin
import com.esv.tripplanner.core_api.data.entities.TripRouteJoin

data class TripVisitPlansAndPoiRelation(
    @Embedded val trip: Trip,
    @Relation(parentColumn = "id",
        entityColumn = "id",
        associateBy = Junction(value = TripPointOfInterestVisitPlanJoin::class,
            parentColumn = "tripId",
            entityColumn = "poiVisitPlanId"))
    val pointOfInterestVisitPlanList: List<PointOfInterestVisitPlan>,

    @Relation(parentColumn = "id",
        entityColumn = "id",
        associateBy = Junction(value = TripRouteJoin::class,
            parentColumn = "tripId",
            entityColumn = "poiVisitPlanId"))
    val route: List<PointOfInterestVisitPlan>
){

}