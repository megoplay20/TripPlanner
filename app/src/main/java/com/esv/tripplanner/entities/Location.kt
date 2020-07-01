package com.esv.tripplanner.entities

data class Location(var latitude: Double, var longitude: Double){

    override fun toString(): String {
        return "$latitude, $longitude"
    }
}