package com.esv.tripplanner.network.di

import com.esv.tripplanner.core_api.di.RotePlannerApi
import com.esv.tripplanner.core_api.repositories.ITripRepository
import com.esv.tripplanner.core_api.di.IPlanRouteActions
import com.esv.tripplanner.network.api_calls.OptimalRoutePlanner
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
class NetworkModule {

    @Singleton
    @Provides
    @RotePlannerApi
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://reqres.in/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }

    @Singleton
    @Provides
    fun provideRoutePlannerApi(@RotePlannerApi retrofit: Retrofit, repo:ITripRepository): IPlanRouteActions {
        return OptimalRoutePlanner(repo, retrofit)
    }




}