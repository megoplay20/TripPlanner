package com.esv.tripplanner.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.esv.tripplanner.dao.PointOfInterestDao
import com.esv.tripplanner.dao.TripDao
import com.esv.tripplanner.dao.VisitPlansDao
import com.esv.tripplanner.database_converters.DbDateConverter
import com.esv.tripplanner.database_converters.DbLocalTimeConverter
import com.esv.tripplanner.entities.*

@Database(entities = [PointOfInterest::class,
    PointOfInterestVisitPlan::class,
    Trip::class,
    TripRouteJoin::class,
    TripPointOfInterestVisitPlanJoin::class], version = 8)
@TypeConverters(DbDateConverter::class, DbLocalTimeConverter::class)

abstract class TripDatabase: RoomDatabase(){
    abstract fun pointOfInterest(): PointOfInterestDao;
    abstract fun pointOfInterestVisitPlans(): VisitPlansDao;
    abstract fun trips(): TripDao;

    companion object{

        @Volatile
        private var databaseInstance: TripDatabase? = null

        fun getDatabase(applicationContext: Context): TripDatabase {
            val tempInstance = databaseInstance
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    applicationContext,
                    TripDatabase::class.java, "trip_db"
                ).build()
                databaseInstance = instance
                return instance
            }
        }


    }


}