package com.esv.tripplanner.core_api.data.entities.relation_classes

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.esv.tripplanner.core_api.data.entities.PointOfInterestVisitPlan
import com.esv.tripplanner.core_api.data.entities.TripPointOfInterestVisitPlanJoin

data class TripPoiVisitPlanJoinRelation(
    @Embedded val tripJoin: TripPointOfInterestVisitPlanJoin,
    @Relation(parentColumn = "tripId",
        entity= PointOfInterestVisitPlan::class,
        entityColumn = "id",
        associateBy = Junction(
            value = TripPointOfInterestVisitPlanJoin::class,
            parentColumn = "tripId",
            entityColumn = "poiVisitPlanId"
        )
    )
    val pointOfInterestVisitPlanList: List<PointOfInterestVisitPlan>
){

}