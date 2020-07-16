package com.esv.tripplanner.core_api.data.entities

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import com.esv.tripplanner.core_api.data.entities.PointOfInterestVisitPlan
import com.esv.tripplanner.core_api.data.entities.Trip


@Entity(
    primaryKeys = ["tripId", "poiVisitPlanId"],
    indices = [Index("tripId"), Index("poiVisitPlanId")],
    foreignKeys = [(ForeignKey(
        entity = PointOfInterestVisitPlan::class,
        parentColumns = arrayOf("id"),
        childColumns = arrayOf("poiVisitPlanId"),
        onDelete = ForeignKey.CASCADE
    )),
        (ForeignKey(
            entity = Trip::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("tripId"),
            onDelete = ForeignKey.CASCADE
        ))
    ]
)
data class TripRouteJoin(val tripId: Int, val poiVisitPlanId: Int, val order:Int) {


}