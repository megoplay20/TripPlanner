package com.esv.tripplanner.repositories

import androidx.lifecycle.LiveData
import com.esv.tripplanner.entities.PointOfInterest
import com.esv.tripplanner.entities.PointOfInterestVisitPlan
import com.esv.tripplanner.entities.Trip
import com.esv.tripplanner.entities.relation_classes.TripPoiVisitPlanJoinRelation
import com.esv.tripplanner.entities.relation_classes.TripVisitPlansRelation

interface ITripRepository {

    suspend fun createEmptyTrip(emptyTripName: String): Long
    suspend fun getTripById(tripId:Int): Trip
    suspend fun savePointOfInterest(poi:PointOfInterest)

    suspend fun savePointOfInterestVisitPlan(poiVisitPlan:PointOfInterestVisitPlan): Long
    suspend fun addVisitPlanToTrip(tripId:Int , poiVisitPlan:PointOfInterestVisitPlan): Long

    fun getVisitPlansForTripJoin(tripId:Int): LiveData<List<TripPoiVisitPlanJoinRelation>>

    fun getVisitPlansForTrip(tripId:Int): LiveData<List<TripVisitPlansRelation>>

    suspend fun getPointOfInterestById(id: Int): PointOfInterest?;

    fun getPointOfInterest(): LiveData<List<PointOfInterest>>
}