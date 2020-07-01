package com.esv.tripplanner.dao

import androidx.room.*
import com.esv.tripplanner.entities.*

@Dao
interface TripDao{

    @Query("SELECT * FROM trip")
    suspend fun loadTrips():List<Trip>;

    @Transaction
    @Query("SELECT * FROM trip WHERE id = :tripId")
    suspend fun loadTripWithRelations(tripId:Int):List<TripVisitPlansAndPoiRelation>;

    @Transaction
    @Query("SELECT * FROM trip WHERE id = :tripId")
    suspend fun loadTripWithVisitPlanRelation(tripId:Int):List<TripVisitPlansRelation>;

    @Transaction
    @Query("SELECT * FROM trip WHERE id = :tripId")
    suspend fun loadTripWithRouteRelation(tripId:Int):List<TripRouteRelation>;

    @Insert
    suspend fun save(trip: Trip);

    @Update
    suspend fun update(trip: Trip);

    @Insert
    suspend fun save(tripPoiVisitPlanJoin: TripPointOfInterestVisitPlanJoin);

    @Insert
    suspend fun save(tripRouteJoin: TripRouteJoin);
}