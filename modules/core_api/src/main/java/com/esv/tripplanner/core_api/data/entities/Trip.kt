package com.esv.tripplanner.core_api.data.entities

import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "trip")
data class Trip(
    var name: String,
    var description: String,
    var isRouteGenerated: Boolean = false
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
    var dateSaved: Date = Date()
}