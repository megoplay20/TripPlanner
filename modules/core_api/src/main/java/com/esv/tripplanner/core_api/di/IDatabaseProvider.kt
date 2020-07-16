package com.esv.tripplanner.core_api.di

import androidx.room.RoomDatabase
import com.esv.tripplanner.core_api.repositories.ITripRepository

interface IDatabaseProvider {
    fun provideDb(): RoomDatabase
    fun provideTripRepo(): com.esv.tripplanner.core_api.repositories.ITripRepository
}