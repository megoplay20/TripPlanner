package com.esv.tripplanner.navigation

import androidx.navigation.NavController
import androidx.navigation.NavDirections
import com.esv.tripplanner.core.navigation.BaseNavigator
import com.esv.tripplanner.core.navigation.INavigationProvider
import com.esv.tripplanner.newroute.fragments.NewRouteFragmentDirections
import com.esv.tripplanner.startscreen.fragments.StartFragmentDirections
import com.esv.tripplanner.visitplan.fragments.AddVisitPlanFragmentDirections
import javax.inject.Inject
import javax.inject.Singleton


class Navigator @Inject constructor():BaseNavigator()  {
    override fun startNewRouteAction(tripId: Int) {
         safeNavigate(StartFragmentDirections.startNewRouteAction(tripId))
    }

    override fun startAddVisitPlanAction(tripId: Int) {
        safeNavigate( NewRouteFragmentDirections.addVisitPlanAction(tripId))
    }

    override fun startAddPoiActionFromVisitPlan() {
        safeNavigate(AddVisitPlanFragmentDirections.addPoiActionFromVisitPlan())
    }


}