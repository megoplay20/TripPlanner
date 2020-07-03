package com.esv.tripplanner.entities

import androidx.room.*
import androidx.room.ForeignKey.CASCADE

@Entity(
    tableName = "point_of_interest_visit_plan",
    foreignKeys = [(ForeignKey(
        entity = PointOfInterest::class,
        parentColumns = arrayOf("id"),
        childColumns = arrayOf("pointOfInterestId"),
        onDelete = CASCADE
    ))]
)
data class PointOfInterestVisitPlan(
    @ColumnInfo(index = true)
    var pointOfInterestId: Int,
    var visitTimeHrs: Double?,
    var isStartPoint: Boolean = false
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}