package com.esv.tripplanner.core.navigation

import android.os.Bundle

interface IArgumentsProvider {
    fun getTripIdFromArgs(arguments: Bundle?):Int
    fun getTripIdFromAddVisitPlanArgs(arguments: Bundle?):Int

}