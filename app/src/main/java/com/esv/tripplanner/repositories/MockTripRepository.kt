package com.esv.tripplanner.repositories

import com.esv.tripplanner.entities.Location
import com.esv.tripplanner.entities.PointOfInterest
import com.esv.tripplanner.entities.TimeSpan

class MockTripRepository: ITripRepository {
    override fun getPointOfInterestById(id: Int): PointOfInterest {
        return PointOfInterest("PoiName", "PoiDescr", Location(60.0, 55.9), TimeSpan())
    }
}