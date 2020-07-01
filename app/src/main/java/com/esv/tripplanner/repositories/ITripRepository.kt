package com.esv.tripplanner.repositories

import com.esv.tripplanner.entities.PointOfInterest

interface ITripRepository {

    fun getPointOfInterestById(id: Int): PointOfInterest;

}