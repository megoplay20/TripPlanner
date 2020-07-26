package com.esv.tripplanner.core_impl.data.repositories

import androidx.lifecycle.LiveData
import androidx.room.RoomDatabase
import androidx.room.withTransaction
import com.esv.tripplanner.core_api.data.dao.PointOfInterestDao
import com.esv.tripplanner.core_api.data.dao.TripDao
import com.esv.tripplanner.core_api.data.dao.VisitPlansDao
import com.esv.tripplanner.core_api.data.entities.PointOfInterest
import com.esv.tripplanner.core_api.data.entities.PointOfInterestVisitPlan
import com.esv.tripplanner.core_api.data.entities.Trip
import com.esv.tripplanner.core_api.data.entities.TripPointOfInterestVisitPlanJoin
import com.esv.tripplanner.core_api.data.entities.relation_classes.TripPoiVisitPlanJoinRelation
import com.esv.tripplanner.core_api.data.entities.relation_classes.TripVisitPlansRelation

class TripDatabaseRepository(private val database: RoomDatabase, private val tripDao: com.esv.tripplanner.core_api.data.dao.TripDao,
                             private val poiDao: com.esv.tripplanner.core_api.data.dao.PointOfInterestDao,
                             private  val poiVisitPlanDao: com.esv.tripplanner.core_api.data.dao.VisitPlansDao
) : com.esv.tripplanner.core_api.repositories.ITripRepository {

    override suspend fun createEmptyTrip(emptyTripName: String): Long {
        return tripDao.save(Trip(emptyTripName, ""))
    }

    override suspend fun getTripById(tripId: Int): Trip {
        return tripDao.loadTrip(tripId)[0];
    }

    override suspend fun savePointOfInterest(poi: PointOfInterest) {
        return poiDao.save(poi)
    }

    override suspend fun savePointOfInterestVisitPlan(poiVisitPlan: PointOfInterestVisitPlan):Long {
        return poiVisitPlanDao.save(poiVisitPlan)
    }

    override suspend fun addVisitPlanToTrip(tripId: Int, poiVisitPlan: PointOfInterestVisitPlan): Long {
        return database.withTransaction {
            val poiVisitPlanId = poiVisitPlanDao.save(poiVisitPlan)
            tripDao.save(TripPointOfInterestVisitPlanJoin(tripId, poiVisitPlanId.toInt()))
            return@withTransaction poiVisitPlanId
        }
    }

    override fun getVisitPlansForTripJoin(tripId: Int): LiveData<List<TripPoiVisitPlanJoinRelation>> {
        return tripDao.loadTripPoiVisitPlanJoin(tripId)
    }

    override fun getVisitPlansForTrip(tripId: Int): LiveData<List<TripVisitPlansRelation>> {
        return tripDao.loadTripWithVisitPlanRelation(tripId)
    }

    override fun getTrips(): LiveData<List<TripVisitPlansRelation>> {
        return tripDao.loadTripWithVisitPlanRelation()
    }

    override fun getPointOfInterest(): LiveData<List<PointOfInterest>> {
        return poiDao.loadPointOfInterest()
    }

    override suspend fun getPointOfInterestById(id: Int): PointOfInterest? {
        poiDao.loadPointOfInterest(id).let {
            return if(it.isNotEmpty()){
                it.first()
            }else{
                null
            }
        }
    }
}