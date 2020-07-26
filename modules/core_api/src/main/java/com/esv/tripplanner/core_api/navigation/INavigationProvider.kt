package com.esv.tripplanner.core_api.navigation

import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.NavDirections

interface INavigationProvider {

    fun startLoadRouteById(tripId: Int)

    fun startLoadRoutesAction()

    fun startNewRouteAction(tripId: Int)

    fun startAddVisitPlanAction(tripId: Int)

    fun startAddPoiActionFromVisitPlan()

    fun bind(navController: NavController)

    fun unbind()

    fun safeNavigate(direction: NavDirections)

    fun goBack()

}