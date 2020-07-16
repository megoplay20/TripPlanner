package com.esv.tripplanner.core.di

import android.app.Application
import com.esv.tripplanner.core.data.database.TripDatabase
import com.esv.tripplanner.core.data.repositories.ITripRepository
import com.esv.tripplanner.core.data.repositories.TripDatabaseRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DataModule {

    @Singleton
    @Provides
    fun getTripDatabase(app: Application): TripDatabase {
        return TripDatabase.getDatabase(app.applicationContext)
    }

    @Singleton
    @Provides
    fun getTripRepository(database: TripDatabase): ITripRepository {
            return TripDatabaseRepository(
                database,
                database.trips(),
                database.pointOfInterest(),
                database.pointOfInterestVisitPlans()
            )
    }


}