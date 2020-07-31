package com.esv.tripplanner.core_api.di

import com.esv.tripplanner.core_api.di.RotePlannerApi
import retrofit2.Retrofit

interface INetworkProvider {
    @RotePlannerApi
    fun provideRoutePlannerApi(): Retrofit

    fun providePlannerApi(): IPlanRouteActions

}