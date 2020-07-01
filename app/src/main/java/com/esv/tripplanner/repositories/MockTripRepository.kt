package com.esv.tripplanner.repositories

import androidx.lifecycle.LiveData
import com.esv.tripplanner.entities.Location
import com.esv.tripplanner.entities.PointOfInterest
import com.esv.tripplanner.entities.PointOfInterestVisitPlan
import com.esv.tripplanner.entities.TimeSpan

class MockTripRepository: ITripRepository {
    override fun getVisitPlacesData(): LiveData<List<PointOfInterestVisitPlan>> {
        TODO("Not yet implemented")
    }

    override fun getPointOfInterestById(id: Int): PointOfInterest {
        return PointOfInterest("PoiName", "PoiDescr", Location(60.0, 55.9), TimeSpan())
    }
}