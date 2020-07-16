package com.esv.tripplanner.core.navigation

import androidx.navigation.NavController
import androidx.navigation.NavDirections

abstract class BaseNavigator:INavigationProvider {

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