package com.esv.tripplanner.navigation

import com.esv.tripplanner.core.navigation.IArgumentsProvider
import com.esv.tripplanner.core.navigation.INavigationProvider
import com.esv.tripplanner.core.navigation.INavigatorComponentsProvider
import javax.inject.Inject

class NavigationComponent @Inject constructor(var nav:INavigationProvider, var args: IArgumentsProvider) : INavigatorComponentsProvider {
    override fun provideNavigator(): INavigationProvider  = nav
    override fun provideArguments(): IArgumentsProvider = args
    override fun provideNavigatorComponents(): INavigatorComponentsProvider  = this
}