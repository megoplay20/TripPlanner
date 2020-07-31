package com.esv.tripplanner.core_impl.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.esv.tripplanner.core_api.data.dao.PointOfInterestDao
import com.esv.tripplanner.core_api.data.dao.TripDao
import com.esv.tripplanner.core_api.data.dao.VisitPlansDao
import com.esv.tripplanner.core_api.data.database_converters.DbDateConverter
import com.esv.tripplanner.core_api.data.database_converters.DbLocalTimeConverter
import com.esv.tripplanner.core_api.data.entities.*

@Database(entities = [PointOfInterest::class,
    PointOfInterestVisitPlan::class,
    Trip::class,
    TripRouteJoin::class,
    TripPointOfInterestVisitPlanJoin::class], version = 8)
@TypeConverters(com.esv.tripplanner.core_api.data.database_converters.DbDateConverter::class, com.esv.tripplanner.core_api.data.database_converters.DbLocalTimeConverter::class)

abstract class TripDatabase: RoomDatabase(){
    abstract fun pointOfInterest(): com.esv.tripplanner.core_api.data.dao.PointOfInterestDao;
    abstract fun pointOfInterestVisitPlans(): com.esv.tripplanner.core_api.data.dao.VisitPlansDao;
    abstract fun trips(): com.esv.tripplanner.core_api.data.dao.TripDao;

    companion object{

        @Volatile
        private var databaseInstance: TripDatabase? = null

        fun getDatabase(applicationContext: Context): TripDatabase {
            val tempInstance =
                databaseInstance
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