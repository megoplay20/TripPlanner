package com.esv.tripplanner.entities.relation_classes

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.esv.tripplanner.entities.PointOfInterestVisitPlan
import com.esv.tripplanner.entities.Trip
import com.esv.tripplanner.entities.TripRouteJoin

data class TripRouteRelation(
    @Embedded val trip: Trip,
    @Relation(parentColumn = "id",
        entityColumn = "id",
        associateBy = Junction(value = TripRouteJoin::class,
            parentColumn = "tripId",
            entityColumn = "poiVisitPlanId"))
    val route: List<PointOfInterestVisitPlan>
){

}