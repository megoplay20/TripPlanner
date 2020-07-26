package com.esv.tripplanner.navigation

import android.os.Bundle
import com.esv.tripplanner.core_api.navigation.IArgumentsProvider
import com.esv.tripplanner.newroute.fragments.NewRouteFragmentArgs
import com.esv.tripplanner.visitplan.fragments.AddVisitPlanFragmentArgs
import javax.inject.Inject

class ArgumentProvider @Inject constructor():
    com.esv.tripplanner.core_api.navigation.IArgumentsProvider {
    override fun getTripIdFromArgs(arguments: Bundle?): Int {
        return arguments?.let {
            val args = NewRouteFragmentArgs.fromBundle(it)
            args.tripId
        } ?: -1
    }

    override fun getTripIdFromAddVisitPlanArgs(arguments: Bundle?): Int {
        return arguments?.let {
            val args = AddVisitPlanFragmentArgs.fromBundle(it)
            args.tripId
        } ?: -1
    }

    override fun getTripIdForLoadRoute(arguments: Bundle?): Int {
        TODO("Not yet implemented")
    }
}