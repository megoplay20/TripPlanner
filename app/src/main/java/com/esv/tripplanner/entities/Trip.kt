package com.esv.tripplanner.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "trip")
data class Trip(
     val name: String, val description: String, var isRouteGenerated: Boolean = false, @PrimaryKey(autoGenerate = true)
val id: Int = -1
) {

    var dateSaved: Date = Date()

}