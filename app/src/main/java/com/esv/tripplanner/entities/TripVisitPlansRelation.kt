package com.esv.tripplanner.entities

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation

data class TripVisitPlansRelation(
    @Embedded val trip:Trip,
    @Relation(parentColumn = "id",
        entityColumn = "id",
        associateBy = Junction(value = TripPointOfInterestVisitPlanJoin::class,
            parentColumn = "tripId",
            entityColumn = "poiVisitPlanId"))
    val pointOfInterestVisitPlanList: List<PointOfInterestVisitPlan>
){

}