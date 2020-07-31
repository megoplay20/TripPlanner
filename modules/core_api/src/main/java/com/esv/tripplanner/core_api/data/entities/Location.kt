package com.esv.tripplanner.core_api.data.entities

data class Location(var latitude: Double, var longitude: Double){

    override fun toString(): String {
        return "$latitude, $longitude"
    }
}