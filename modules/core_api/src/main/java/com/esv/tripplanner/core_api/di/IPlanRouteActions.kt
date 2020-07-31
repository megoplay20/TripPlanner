package com.esv.tripplanner.core_api.di



interface IPlanRouteActions {
    suspend fun findOptimalRoute(tripId: Int): IOptimalRoute
}