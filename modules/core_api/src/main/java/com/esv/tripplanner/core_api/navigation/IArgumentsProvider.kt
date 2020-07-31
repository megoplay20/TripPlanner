package com.esv.tripplanner.core_api.navigation

import android.os.Bundle

interface IArgumentsProvider {
    fun getTripIdFromArgs(arguments: Bundle?):Int
    fun getTripIdFromAddVisitPlanArgs(arguments: Bundle?):Int
    fun getTripIdForLoadRoute(arguments: Bundle?): Int
    fun getTripIdForFollowRoute(arguments: Bundle?): Int
}