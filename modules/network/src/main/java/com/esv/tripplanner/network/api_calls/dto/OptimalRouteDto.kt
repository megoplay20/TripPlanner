package com.esv.tripplanner.network.api_calls.dto

import com.esv.tripplanner.core_api.data.entities.PointOfInterestVisitPlan
import com.esv.tripplanner.core_api.di.IOptimalRoute


data class OptimalRouteDto(
    var trip_id: Int,
    var point_of_interest_visit_plans: List<PointOfInterestVisitPlans>
) : IOptimalRoute {
    override fun getTripId(): Int {
        return trip_id
    }

    override fun getPlacesOfVisitOrdered(): List<PointOfInterestVisitPlan> {
        return this.point_of_interest_visit_plans.map {
            PointOfInterestVisitPlan(it.poiId, it.visitTimeHrs, it.isStartPoint).apply {
                id = it.poiVisitPlanId
            }
        }
    }
}