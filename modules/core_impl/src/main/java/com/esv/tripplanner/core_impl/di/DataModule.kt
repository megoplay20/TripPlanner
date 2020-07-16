package com.esv.tripplanner.core_impl.di

import android.app.Application
import androidx.room.Room
import androidx.room.RoomDatabase
import com.esv.tripplanner.core_api.data.entities.Trip
import com.esv.tripplanner.core_impl.data.database.TripDatabase
import com.esv.tripplanner.core_impl.data.repositories.TripDatabaseRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DataModule {

    @Singleton
    @Provides
    fun getTripDatabase(app: Application): RoomDatabase {
        return com.esv.tripplanner.core_impl.data.database.TripDatabase.getDatabase(app.applicationContext)
    }

    @Singleton
    @Provides
    fun getTripRepository(database: RoomDatabase): com.esv.tripplanner.core_api.repositories.ITripRepository {

        val tripDatabase  = database as TripDatabase
            return com.esv.tripplanner.core_impl.data.repositories.TripDatabaseRepository(
                database,
                tripDatabase.trips(),
                tripDatabase.pointOfInterest(),
                tripDatabase.pointOfInterestVisitPlans()
            )
    }


}