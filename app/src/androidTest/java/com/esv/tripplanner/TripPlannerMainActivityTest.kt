package com.esv.tripplanner

import android.view.View
import android.widget.Button
import android.widget.Spinner
import androidx.appcompat.widget.AppCompatSpinner
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.UiController
import androidx.test.espresso.ViewAction
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withClassName
import androidx.test.espresso.matcher.ViewMatchers.withEffectiveVisibility
import androidx.test.rule.ActivityTestRule
import com.agoda.kakao.common.views.KView
import com.agoda.kakao.edit.KEditText
import com.agoda.kakao.image.KImageView
import com.agoda.kakao.screen.Screen
import com.agoda.kakao.text.KButton
import org.hamcrest.Matcher
import org.hamcrest.Matchers.*
import org.junit.Rule
import org.junit.Test


class StartScreen : Screen<StartScreen>() {
    val startNewRoute = KButton { withId(com.esv.tripplanner.startscreen.R.id.startNewRouteButton) }
    val followRouteButton = KButton { withId(com.esv.tripplanner.startscreen.R.id.followRouteButton) }
}

class NewRouteScreen : Screen<NewRouteScreen>() {
    val routeNameEdit = KEditText { withId(com.esv.tripplanner.newroute.R.id.name) }
    val showItemsImageView = KImageView { withId(com.esv.tripplanner.newroute.R.id.show_items) }
    val hideItemsImageView = KImageView { withId(com.esv.tripplanner.newroute.R.id.hide_items) }
    val addVisitPlace = KButton { withId(com.esv.tripplanner.newroute.R.id.button) }
    val buildRoute = KButton { withId(com.esv.tripplanner.newroute.R.id.build) }
    val rebuildRoute = KButton { withId(com.esv.tripplanner.newroute.R.id.rebuild) }
    val followBuiltRoute = KButton { withId(com.esv.tripplanner.newroute.R.id.navigate) }
}

class VisitPlanScreen: Screen<VisitPlanScreen>(){
    val saveVisitPlan= KButton { withId(com.esv.tripplanner.visitplan.R.id.save) }
    val placeSelectorSpinner = KView{withId(com.esv.tripplanner.visitplan.R.id.placeSelector)}
}

class SpinnerSelectItemAction(val positionId: Int): ViewAction{
    override fun getDescription(): String {
        return "Spinner select item action"
    }

    override fun getConstraints(): Matcher<View> {
        return allOf(
            withEffectiveVisibility(ViewMatchers.Visibility.VISIBLE),
            anyOf(withClassName(`is`(Spinner::class.java.canonicalName)),
                instanceOf(Spinner::class.java),
                instanceOf(AppCompatSpinner::class.java)
            )

        )
    }

    override fun perform(uiController: UiController?, view: View?) {
        view?.let {
            val spinnerInstance = view as Spinner
            spinnerInstance.setSelection(positionId)
        }

    }
}

class TripPlannerMainActivityTest {

    @Rule
    @JvmField
    var activityRule = ActivityTestRule(TripPlannerMainActivity::class.java)
    val startScreen = StartScreen()
    val newRouteScreen = NewRouteScreen()
    val visitPlanScreen = VisitPlanScreen()

    @Test
    fun addVisitPlaceToRoute() {
        startScreen{
            startNewRoute.isDisplayed()
            startNewRoute.click()
        }
        newRouteScreen{
            routeNameEdit.isDisplayed()
            routeNameEdit.clearText()
            routeNameEdit.typeText("New route for testing!")
            addVisitPlace.click()
        }
        visitPlanScreen{
            placeSelectorSpinner.isDisplayed()
            placeSelectorSpinner.view.perform(SpinnerSelectItemAction(4))
            pressBack()
            saveVisitPlan.click()
        }


    }


    @Test
    fun buildORebuildRouteThenFollow() {
        val activity = activityRule.activity
        startScreen{
            startNewRoute.isDisplayed()
            startNewRoute.click()
        }
        newRouteScreen{
            routeNameEdit.isDisplayed()
            routeNameEdit.clearText()
            routeNameEdit.typeText("New route for testing!")
            showItemsImageView.isDisplayed()
            showItemsImageView.click()
            activity?.let{
                val fragment = (it as TripPlannerMainActivity).supportFragmentManager.fragments[0]
                fragment.view?.let{fragmentRootView->
                    if(fragmentRootView.findViewById<Button>(R.id.build).isVisible){
                            buildRoute.click()
                    }else{
                            rebuildRoute.click()
                    }
                }
            }
        }
    }

    @Test
    fun navigateToNewRouteTest() {
        startScreen{
            startNewRoute.isDisplayed()
            followRouteButton.isDisplayed()
            startNewRoute.click()
        }
    }

    @Test
    fun navigateToLoadRouteTest() {
        startScreen{
            startNewRoute.isDisplayed()
            followRouteButton.isDisplayed()
            followRouteButton.click()
        }
    }
}