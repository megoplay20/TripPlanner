package com.esv.tripplanner.di

import android.content.Context
import com.esv.tripplanner.database.TripDatabase
import com.esv.tripplanner.repositories.ITripRepository
import com.esv.tripplanner.repositories.TripDatabaseRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DataModule {

    @Singleton
    @Provides
    fun getTripDatabase(context: Context): TripDatabase{
        return TripDatabase.getDatabase(context)
    }

    @Singleton
    @Provides
    fun getTripRepository(database: TripDatabase): ITripRepository {
            return TripDatabaseRepository(database, database.trips(), database.pointOfInterest(), database.pointOfInterestVisitPlans())
    }


}