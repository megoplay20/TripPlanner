package com.esv.tripplanner.dao

import androidx.room.*
import com.esv.tripplanner.entities.PointOfInterest

@Dao
interface PointOfInterestDao{

    @Query("SELECT * FROM point_of_interest")
    suspend fun loadPointOfInterest():List<PointOfInterest>;

    @Query("SELECT * FROM point_of_interest WHERE id = :id")
    suspend fun loadPointOfInterest(id: Int):List<PointOfInterest>;

    @Delete
    suspend fun delete(poi: PointOfInterest);

    @Insert
    suspend fun save(poi: PointOfInterest);

    @Update
    suspend fun update(poi: PointOfInterest);

}