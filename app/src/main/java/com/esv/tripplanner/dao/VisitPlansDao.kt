package com.esv.tripplanner.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.esv.tripplanner.entities.PointOfInterestVisitPlan

@Dao
interface VisitPlansDao{

    @Query("SELECT * FROM point_of_interest_visit_plan")
    fun loadPointOfInterestVisitPlan(): LiveData<List<PointOfInterestVisitPlan>>;

    @Query("SELECT * FROM point_of_interest_visit_plan WHERE id = :id")
    suspend fun loadPointOfInterestVisitPlan(id: Int):List<PointOfInterestVisitPlan>;

    @Insert
    suspend fun save(poiVisitPlan: PointOfInterestVisitPlan);

    @Update
    suspend fun update(poiVisitPlan: PointOfInterestVisitPlan);

    @Delete
    suspend fun delete(poiVisitPlan: PointOfInterestVisitPlan);

}