package com.esv.tripplanner.followroute.adapters

import android.app.Application
import android.view.View
import com.esv.tripplanner.core_api.data.entities.PointOfInterestVisitPlan
import com.esv.tripplanner.core_api.helpers.ITypeCaster
import com.esv.tripplanner.core_api.navigation.INavigationProvider
import com.esv.tripplanner.followroute.databinding.FollowFragmentBinding
import com.esv.tripplanner.followroute.databinding.PointOfInterestOrderedBinding
import com.esv.tripplanner.followroute.viewModels.FollowRouteViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.TestCoroutineDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runBlockingTest
import kotlinx.coroutines.test.setMain
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.times
import org.mockito.MockitoAnnotations

// info https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-test/
// https://codelabs.developers.google.com/codelabs/advanced-android-kotlin-training-testing-survey/#2
@ExperimentalCoroutinesApi
internal class FollowPlacesViewHolderTest {

    private val testDispatcher = TestCoroutineDispatcher()

    private lateinit var viewHolder : FollowPlacesViewHolder


    @Mock
    private lateinit var itemView: View

    @Mock
    private lateinit var binding: PointOfInterestOrderedBinding

    @Mock
    private lateinit var typeCaster: ITypeCaster

    @Mock
    private lateinit var app: Application

    @Mock
    private lateinit var repository: com.esv.tripplanner.core_api.repositories.ITripRepository

    @Mock
    private lateinit var nav: INavigationProvider

    @BeforeEach
    fun setUp() {
        Dispatchers.setMain(Dispatchers.Unconfined)
        MockitoAnnotations.openMocks(this)
        viewHolder = FollowPlacesViewHolder(itemView, binding,typeCaster,app,6,repository,nav)
    }

    @AfterEach
    fun tearDown(){
        Dispatchers.resetMain()
        testDispatcher.cleanupTestCoroutines()
    }


    @Test
    fun bindItemUpdatePendingChangesTest() = runBlockingTest {
        viewHolder.bindItem(PointOfInterestVisitPlan(223,222.0))
        Mockito.verify(binding, times(1)).executePendingBindings()
    }
}