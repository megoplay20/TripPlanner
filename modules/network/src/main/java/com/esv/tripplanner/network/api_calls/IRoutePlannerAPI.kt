package com.esv.tripplanner.network.api_calls

import com.esv.tripplanner.network.api_calls.dto.OptimalRouteDto
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST


interface IRoutePlannerAPI {
    @POST("api/routes")
    fun findOptimalRoute(@Body query: OptimalRouteDto): Call<OptimalRouteDto>

    @POST("api/routes")
    suspend fun findOptimalRouteAsync(@Body query: OptimalRouteDto): OptimalRouteDto
}