package com.esv.tripplanner.core_impl.navigation

import androidx.navigation.NavController
import androidx.navigation.NavDirections

abstract class BaseNavigator:
    com.esv.tripplanner.core_api.navigation.INavigationProvider {

    protected var navController: NavController? = null

    override fun bind(navController: NavController) {
        this.navController = navController
    }

    override fun unbind() {
        navController = null
    }

    override fun safeNavigate(direction: NavDirections) {
        try {
            navController?.navigate(direction)
        } catch (e: IllegalArgumentException) {
            e.printStackTrace();
        }
    }

    override fun goBack() {
        navController?.popBackStack()
    }
}