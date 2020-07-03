package com.esv.tripplanner.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.esv.tripplanner.entities.*
import com.esv.tripplanner.entities.relation_classes.TripPoiVisitPlanJoinRelation
import com.esv.tripplanner.entities.relation_classes.TripRouteRelation
import com.esv.tripplanner.entities.relation_classes.TripVisitPlansAndPoiRelation
import com.esv.tripplanner.entities.relation_classes.TripVisitPlansRelation

@Dao
interface TripDao{

    @Query("SELECT * FROM trip")
    fun loadTrips():List<Trip>


    @Query("SELECT * FROM trip  WHERE id = :tripId")
    suspend fun loadTrip(tripId:Int):List<Trip>

    @Transaction
    @Query("SELECT * FROM trip WHERE id = :tripId")
    fun loadTripWithRelations(tripId:Int):List<TripVisitPlansAndPoiRelation>


    @Transaction
    @Query("SELECT * FROM trip WHERE id = :tripId")
    fun loadTripWithVisitPlanRelationNoLiveData(tripId:Int): List<TripVisitPlansRelation>

    @Transaction
    @Query("SELECT * FROM trip WHERE id = :tripId")
    fun loadTripWithVisitPlanRelation(tripId:Int): LiveData<List<TripVisitPlansRelation>>

    @Transaction
    @Query("SELECT * FROM trippointofinterestvisitplanjoin WHERE tripId = :tripId")
    fun loadTripPoiVisitPlanJoin(tripId:Int): LiveData<List<TripPoiVisitPlanJoinRelation>>

    @Transaction
    @Query("SELECT * FROM trip WHERE id = :tripId")
    suspend fun loadTripWithRouteRelation(tripId:Int):List<TripRouteRelation>

    @Insert
    suspend fun save(trip: Trip): Long

    @Update
    suspend fun update(trip: Trip)

    @Insert
    suspend fun save(tripPoiVisitPlanJoin: TripPointOfInterestVisitPlanJoin)

    @Insert
    suspend fun save(tripRouteJoin: TripRouteJoin)
}