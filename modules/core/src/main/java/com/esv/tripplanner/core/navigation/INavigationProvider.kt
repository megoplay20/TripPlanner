package com.esv.tripplanner.core.navigation

import android.os.Bundle
import androidx.navigation.NavController

interface INavigationProvider {

    fun startNewRouteAction(tripId: Int)

    fun bind(navController: NavController)

    fun unbind()

}