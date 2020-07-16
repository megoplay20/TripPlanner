package com.esv.tripplanner.core.navigation

import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.NavDirections

interface INavigationProvider {

    fun startNewRouteAction(tripId: Int)

    fun startAddVisitPlanAction(tripId: Int)

    fun startAddPoiActionFromVisitPlan()

    fun bind(navController: NavController)

    fun unbind()

    fun safeNavigate(direction: NavDirections)

    fun goBack()

}