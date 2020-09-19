package com.esv.tripplanner.application

import android.os.Bundle
import androidx.core.view.isVisible
import androidx.fragment.app.testing.FragmentScenario
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.esv.tripplanner.R
import com.esv.tripplanner.application.TripPlannerApplication
import com.esv.tripplanner.core_api.data.entities.Trip
import com.esv.tripplanner.loadroute.fragments.LoadRouteFragment
import junit.framework.Assert.assertTrue
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

//https://stackoverflow.com/questions/56808485/robolectric-and-android-sdk-29/57261194#57261194
@RunWith(RobolectricTestRunner::class)
@Config(sdk=[21],application = TripPlannerApplication::class)
class LoadRouteFragmentTest {
    @Mock
    private lateinit var repository: com.esv.tripplanner.core_api.repositories.ITripRepository

    @Before
    fun setUp() {
        MockitoAnnotations.openMocks(this)
    }

    @After
    fun tearDown() {
        StubNewRouteFragment.stubRepo = null
    }

    @Test
    fun `test recycle view adapter initialized`() {
            val scenario = FragmentScenario.launchInContainer(LoadRouteFragment::class.java)
            scenario.onFragment {
                onView(withId(com.esv.tripplanner.loadroute.R.id.trips))
                    .check { view, _ ->
                        val rv = view as RecyclerView
                        rv.adapter?.let { adapter ->
                            if (adapter.itemCount != 0) {
                                throw AssertionError("Non zero items in adapter!")
                            }
                        } ?: throw AssertionError("Adapter is not initialized!")
                    }
            }
    }


    @Test
    fun `test arguments passing to fragment`() {
        runBlocking {

            val expectedValue = 99
            val expectedArgName = "tripId"

            val bundle = Bundle()
            bundle.putInt(expectedArgName, expectedValue)

            Mockito.`when`(repository.getTripById(Mockito.anyInt())).thenReturn(
                Trip("My Trip", "")
            )

            Mockito.`when`(repository.getVisitPlansForTrip(Mockito.anyInt())).thenReturn(
                MutableLiveData(mutableListOf())
            )

            //mock repo
            StubNewRouteFragment.stubRepo = repository

            val newRouteScenario =
                FragmentScenario.launchInContainer(
                    StubNewRouteFragment::class.java,
                    bundle,
                    R.style.AppTheme,
                    null
                )

            newRouteScenario.onFragment {
                assert(it.arguments?.getInt(expectedArgName) == expectedValue)
            }
        }
    }


    @Test
    fun `test visibility of toggle control button and content`() {
        runBlocking {
            Mockito.`when`(repository.getTripById(Mockito.anyInt())).thenReturn(
                Trip("My Trip", "")
            )
            Mockito.`when`(repository.getVisitPlansForTrip(Mockito.anyInt())).thenReturn(
                MutableLiveData(mutableListOf())
            )

            //mock repo
            StubNewRouteFragment.stubRepo = repository

            val newRouteScenario =
                FragmentScenario.launchInContainer(
                    StubNewRouteFragment::class.java,
                    null,
                    R.style.AppTheme,
                    null
                )

            newRouteScenario.onFragment {

                onView(withId(R.id.route_gen_layout)).check() { view, _ ->
                    onView(withId(R.id.show_items)).check(
                    ) { viewShow, _ ->
                        assert(viewShow.isVisible)
                        onView(withId(R.id.show_items)).perform(click())
                        onView(withId(R.id.hide_items)).check() { viewHide, _ ->
                            assert(viewHide.isVisible)
                            assert(!viewShow.isVisible)

                            onView(withId(R.id.toggle_content)).check(){toggleContent, _->
                                assertTrue(toggleContent.isVisible)
                            }

                        }
                    }
                }
            }
        }



    }




}
