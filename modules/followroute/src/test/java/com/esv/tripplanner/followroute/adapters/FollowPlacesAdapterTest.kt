package com.esv.tripplanner.followroute.adapters

import android.app.Application
import com.esv.tripplanner.core_api.data.entities.PointOfInterestVisitPlan
import com.esv.tripplanner.core_api.helpers.ITypeCaster
import com.esv.tripplanner.core_api.navigation.INavigationProvider
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.mockito.ArgumentMatchers.any
import org.mockito.ArgumentMatchers.anyObject
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.spy
import org.mockito.Mockito.times
import org.mockito.MockitoAnnotations

internal class FollowPlacesAdapterTest {

    fun <T> any(): T = Mockito.any<T>()

    @Mock
    private lateinit var app: Application

    @Mock
    private lateinit var typeCaster: ITypeCaster

    @Mock
    private lateinit var repository: com.esv.tripplanner.core_api.repositories.ITripRepository

    @Mock
    private lateinit var nav: INavigationProvider

    @BeforeEach
    fun setUp() {
        MockitoAnnotations.openMocks(this)
    }

    @AfterEach
    fun tearDown() {
    }

    @Test
    fun getItemCount() {
        var adapter = FollowPlacesAdapter(5, app, mutableListOf(), typeCaster, repository, nav)
        assertEquals(adapter.itemCount, 0)

        adapter = FollowPlacesAdapter(5, app, mutableListOf(PointOfInterestVisitPlan(2, 2.3)), typeCaster, repository, nav)
        assertEquals(adapter.itemCount, 1)
    }

    @Test
    fun onBindViewHolder() {
        val adapter = FollowPlacesAdapter(5, app, mutableListOf(PointOfInterestVisitPlan(2, 2.3),
            PointOfInterestVisitPlan(2, 2.3),
            PointOfInterestVisitPlan(2, 2.3)), typeCaster, repository, nav)
        val viewHolder = Mockito.mock(FollowPlacesViewHolder::class.java)

        adapter.onBindViewHolder(viewHolder, 0)
        adapter.onBindViewHolder(viewHolder, 1)
        adapter.onBindViewHolder(viewHolder, 2)

        Mockito.verify(viewHolder, times(3)).bindItem(this.any())
    }
}