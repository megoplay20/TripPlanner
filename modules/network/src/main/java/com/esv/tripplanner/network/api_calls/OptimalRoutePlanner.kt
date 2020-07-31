package com.esv.tripplanner.network.api_calls

import com.esv.tripplanner.core_api.di.IPlanRouteActions
import com.esv.tripplanner.core_api.repositories.ITripRepository
import com.esv.tripplanner.network.api_calls.dto.*
import retrofit2.Retrofit

class OptimalRoutePlanner(val repo: ITripRepository, private val retrofit:Retrofit):
    IPlanRouteActions {
    override suspend fun findOptimalRoute(tripId: Int): OptimalRouteDto {
        val tripRelatedEntities = repo.loadTripWithAllRelatedEntities(tripId)
        val relatedPointOfInterest = tripRelatedEntities.pointOfInterestVisitPlanList.mapNotNull {
            repo.getPointOfInterestById(it.pointOfInterestId)?.let {poi->
                PointOfInterestVisitPlans(it.id,
                    it.pointOfInterestId,
                    it.isStartPoint,
                    Location(poi.location.latitude, poi.location.longitude),
                    WorkingHours(OpenTime(poi.workingHours.openTime.hour, poi.workingHours.openTime.minute),
                        CloseTime(poi.workingHours.closeTime.hour, poi.workingHours.closeTime.minute)
                    ), it.visitTimeHrs ?: 0.0)
            }
        }.distinctBy { it.poiId }

        val optimalRoute = OptimalRouteDto(
            tripId,
            relatedPointOfInterest
        )
        return retrofit.create(IRoutePlannerAPI::class.java).findOptimalRouteAsync(optimalRoute)
    }
}