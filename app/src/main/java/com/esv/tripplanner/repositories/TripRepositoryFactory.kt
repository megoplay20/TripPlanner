package com.esv.tripplanner.repositories

import com.esv.tripplanner.database.TripDatabase

class TripRepositoryFactory {

    companion object{
        fun getDatabaseRepositoryInstance(database: TripDatabase): TripDatabaseRepository {
            return TripDatabaseRepository(database, database.trips(), database.pointOfInterest(), database.pointOfInterestVisitPlans())
        }
    }
}