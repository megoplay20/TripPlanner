package com.esv.tripplanner.core_api.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.CASCADE
import androidx.room.PrimaryKey
import com.esv.tripplanner.core_api.data.entities.PointOfInterest

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