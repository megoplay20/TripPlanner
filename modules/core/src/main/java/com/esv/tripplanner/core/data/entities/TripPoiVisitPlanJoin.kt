package com.esv.tripplanner.entities

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index


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
data class TripPointOfInterestVisitPlanJoin(val tripId: Int, val poiVisitPlanId: Int) {


}