package com.esv.tripplanner.core_api.repositories

import androidx.lifecycle.LiveData
import com.esv.tripplanner.core_api.data.entities.PointOfInterest
import com.esv.tripplanner.core_api.data.entities.PointOfInterestVisitPlan
import com.esv.tripplanner.core_api.data.entities.Trip
import com.esv.tripplanner.core_api.data.entities.relation_classes.TripPoiVisitPlanJoinRelation
import com.esv.tripplanner.core_api.data.entities.relation_classes.TripRouteRelation
import com.esv.tripplanner.core_api.data.entities.relation_classes.TripVisitPlansAndPoiRelation
import com.esv.tripplanner.core_api.data.entities.relation_classes.TripVisitPlansRelation

interface ITripRepository {

    suspend fun createEmptyTrip(emptyTripName: String): Long
    suspend fun getTripById(tripId: Int): Trip
    suspend fun updateTrip(trip: Trip)

    suspend fun deleteAllEmptyTrips()

    suspend fun savePointOfInterest(poi: PointOfInterest)

    suspend fun savePointOfInterestVisitPlan(poiVisitPlan: PointOfInterestVisitPlan): Long
    suspend fun addVisitPlanToTrip(tripId: Int, poiVisitPlan: PointOfInterestVisitPlan): Long


    suspend fun addOptimalRoute(
        tripId: Int, poiVisitPlan: List<PointOfInterestVisitPlan>
    )

    suspend fun addVisitPlanToTripOptimalRoute(
        tripId: Int, poiVisitPlan: PointOfInterestVisitPlan,
        order: Int
    ): Long

    suspend fun loadTripWithAllRelatedEntities(tripId: Int): TripVisitPlansAndPoiRelation

    fun getVisitPlansForTripJoin(tripId: Int): LiveData<List<TripPoiVisitPlanJoinRelation>>

    fun getVisitPlansForTrip(tripId: Int): LiveData<List<TripVisitPlansRelation>>

    fun getTripRoute(tripId: Int): LiveData<List<TripRouteRelation>>

    fun getTrips(): LiveData<List<TripVisitPlansRelation>>

    suspend fun getPointOfInterestById(id: Int): PointOfInterest?;

    fun getPointOfInterest(): LiveData<List<PointOfInterest>>
}