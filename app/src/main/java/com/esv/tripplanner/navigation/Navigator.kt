package com.esv.tripplanner.navigation

import androidx.navigation.NavController
import com.esv.tripplanner.core.navigation.BaseNavigator
import com.esv.tripplanner.core.navigation.INavigationProvider
import com.esv.tripplanner.fragments.NewRouteFragmentDirections
import com.esv.tripplanner.fragments.StartFragmentDirections
import javax.inject.Inject
import javax.inject.Singleton


class Navigator @Inject constructor():BaseNavigator(), INavigationProvider  {
    override fun startNewRouteAction(tripId: Int) {
                navController?.navigate(StartFragmentDirections.startNewRouteAction(tripId))
    }


}