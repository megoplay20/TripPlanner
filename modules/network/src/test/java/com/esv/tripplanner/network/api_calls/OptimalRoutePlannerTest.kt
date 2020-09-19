package com.esv.tripplanner.network.api_calls

import android.util.Log
import com.esv.tripplanner.core_api.data.entities.Location
import com.esv.tripplanner.core_api.data.entities.PointOfInterest
import com.esv.tripplanner.core_api.data.entities.PointOfInterestVisitPlan
import com.esv.tripplanner.core_api.data.entities.Trip
import com.esv.tripplanner.core_api.data.entities.relation_classes.TripVisitPlansAndPoiRelation
import com.esv.tripplanner.core_api.helpers.TimeSpan
import com.esv.tripplanner.network.api_calls.dto.OptimalRouteDto
import com.google.gson.Gson
import kotlinx.coroutines.runBlocking
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory



class OptimalRoutePlannerTest {

    @Mock
    private lateinit var repository: com.esv.tripplanner.core_api.repositories.ITripRepository

    private lateinit var retrofitMock: Retrofit

    private val server = MockWebServer()


    @Before
    fun setUp() {
        MockitoAnnotations.openMocks(this)
        retrofitMock = Retrofit.Builder()
            .baseUrl("http://localhost:8000/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        server.start(8000)
    }

    @After
    fun tearDown() {
        server.shutdown()
    }


    @Test
    fun findOptimalRoute() {
        val mockTrip = Trip("Trip1", "")
        mockTrip.id = 1
        val mockPoiVisitPlan = PointOfInterestVisitPlan(1, 20.0)
        mockPoiVisitPlan.id = 1
        val mockPoiInfo = PointOfInterest("My poi", "Descr", Location(0.0, 0.0), TimeSpan())
        mockPoiInfo.id = 1

        runBlocking {
            Mockito.`when`(repository.loadTripWithAllRelatedEntities(Mockito.anyInt())).thenReturn(
                TripVisitPlansAndPoiRelation(
                    mockTrip,
                    mutableListOf(mockPoiVisitPlan),
                    mutableListOf()
                )
            )

            Mockito.`when`(repository.getPointOfInterestById(Mockito.anyInt())).thenReturn(
                mockPoiInfo
            )

            val gson = Gson()
            val mockDto = OptimalRouteDto(6, mutableListOf())

            server.enqueue(MockResponse().setBody(gson.toJson(mockDto)))

            val r = OptimalRoutePlanner(repository, retrofitMock).findOptimalRoute(mockTrip.id)


            System.out.println("E " + gson.toJson(r));

        }


    }
}