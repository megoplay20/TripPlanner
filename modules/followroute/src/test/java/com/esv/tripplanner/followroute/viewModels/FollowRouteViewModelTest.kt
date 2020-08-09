package com.esv.tripplanner.followroute.viewModels

import android.app.Application
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.esv.tripplanner.core_api.data.entities.PointOfInterestVisitPlan
import com.esv.tripplanner.core_api.data.entities.Trip
import com.esv.tripplanner.core_api.data.entities.relation_classes.TripRouteRelation
import com.esv.tripplanner.core_api.repositories.ITripRepository
import com.esv.tripplanner.followroute.helpers.InstantExecutorExtension
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.verify
import org.mockito.MockitoAnnotations


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@ExtendWith(InstantExecutorExtension::class)
class FollowRouteViewModelTest {


    private lateinit var followViewModel : FollowRouteViewModel

    @Mock
    lateinit var app: Application

    @Mock
    lateinit var tripRepo: ITripRepository

    @Mock lateinit var observer: Observer<List<TripRouteRelation>>

    @BeforeEach
    fun setUp() {
        MockitoAnnotations.openMocks(this)
        followViewModel = FollowRouteViewModel(app,tripRepo)
    }


    @Test
    fun testTripRouteRelationAfterInit() {

        val tripRouteExpected = TripRouteRelation(Trip("My trip1","Desc", false),
        mutableListOf(PointOfInterestVisitPlan(6,10.2)))


        Mockito.`when`(tripRepo. getTripRoute(Mockito.anyInt())).
        thenReturn(
            MutableLiveData(arrayListOf(tripRouteExpected))
        )

        followViewModel.init(5)

        followViewModel.tripRouteRelation.observeForever(observer)

        verify(observer).onChanged(arrayListOf(tripRouteExpected))

    }


}