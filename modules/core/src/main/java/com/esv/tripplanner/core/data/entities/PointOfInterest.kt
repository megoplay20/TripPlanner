package com.esv.tripplanner.entities

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.esv.tripplanner.core.helpers.TimeSpan

@Entity(tableName = "point_of_interest")
data class PointOfInterest(
    var name: String,
    var description: String,
    @Embedded
    val location: Location,
    @Embedded
    val workingHours: TimeSpan
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}