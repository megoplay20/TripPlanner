package com.esv.tripplanner.navigation

import com.esv.tripplanner.core_api.navigation.IArgumentsProvider
import com.esv.tripplanner.core_api.navigation.INavigationProvider
import com.esv.tripplanner.core_api.navigation.INavigatorComponentsProvider
import javax.inject.Inject

class NavigationComponent @Inject constructor(var nav: com.esv.tripplanner.core_api.navigation.INavigationProvider, var args: com.esv.tripplanner.core_api.navigation.IArgumentsProvider) :
    com.esv.tripplanner.core_api.navigation.INavigatorComponentsProvider {
    override fun provideNavigator(): com.esv.tripplanner.core_api.navigation.INavigationProvider = nav
    override fun provideArguments(): com.esv.tripplanner.core_api.navigation.IArgumentsProvider = args
    override fun provideNavigatorComponents(): com.esv.tripplanner.core_api.navigation.INavigatorComponentsProvider = this
}