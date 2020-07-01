package com.esv.tripplanner.repositories

import androidx.lifecycle.LiveData
import com.esv.tripplanner.entities.PointOfInterest
import com.esv.tripplanner.entities.PointOfInterestVisitPlan

interface ITripRepository {

    fun getVisitPlacesData(): LiveData<List<PointOfInterestVisitPlan>>
    fun getPointOfInterestById(id: Int): PointOfInterest;

}