package com.esv.tripplanner.repositories

import androidx.lifecycle.LiveData
import com.esv.tripplanner.dao.VisitPlansDao
import com.esv.tripplanner.entities.Location
import com.esv.tripplanner.entities.PointOfInterest
import com.esv.tripplanner.entities.PointOfInterestVisitPlan
import com.esv.tripplanner.entities.TimeSpan

class TripDatabaseRepository(private val pointOfInterestPlacesDao: VisitPlansDao) : ITripRepository {

    val visitPlaces: LiveData<List<PointOfInterestVisitPlan>> = pointOfInterestPlacesDao.loadPointOfInterestVisitPlan()

    override fun getVisitPlacesData(): LiveData<List<PointOfInterestVisitPlan>> {
        return  visitPlaces
    }

    override fun getPointOfInterestById(id: Int): PointOfInterest {
        return PointOfInterest("","", Location(0.0,0.0), TimeSpan());
    }
}