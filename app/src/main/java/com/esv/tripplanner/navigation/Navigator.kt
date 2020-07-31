package com.esv.tripplanner.navigation

import com.esv.tripplanner.core_api.navigation.INavigationProvider
import com.esv.tripplanner.loadroute.fragments.LoadRouteFragmentDirections
import com.esv.tripplanner.newroute.fragments.NewRouteFragmentDirections
import com.esv.tripplanner.startscreen.fragments.StartFragmentDirections
import com.esv.tripplanner.visitplan.fragments.AddVisitPlanFragmentDirections
import javax.inject.Inject


class Navigator @Inject constructor():
    com.esv.tripplanner.core_impl.navigation.BaseNavigator()  {
    override fun followRoute(tripId: Int) {
        safeNavigate(NewRouteFragmentDirections.followRouteAction(tripId))
    }

    override fun startLoadRouteById(tripId: Int) {
        safeNavigate(LoadRouteFragmentDirections.loadExistingRouteById(tripId))
    }

    override fun startLoadRoutesAction() {
        safeNavigate(StartFragmentDirections.loadRouteAction())
    }

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