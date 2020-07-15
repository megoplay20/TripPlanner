package com.esv.tripplanner.core.di

import com.esv.tripplanner.core.data.database.TripDatabase
import com.esv.tripplanner.core.data.repositories.ITripRepository

interface IDatabaseProvider {
    fun provideDb(): TripDatabase
    fun provideTripRepo(): ITripRepository
}