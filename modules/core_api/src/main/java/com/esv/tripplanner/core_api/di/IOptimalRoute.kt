package com.esv.tripplanner.core_api.di

import com.esv.tripplanner.core_api.data.entities.PointOfInterestVisitPlan

interface IOptimalRoute {
    fun getTripId(): Int
    fun getPlacesOfVisitOrdered(): List<PointOfInterestVisitPlan>
}