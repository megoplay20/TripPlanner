package com.esv.tripplanner.core.navigation

interface INavigatorComponentsProvider {
    fun provideNavigator(): INavigationProvider
    fun provideArguments(): IArgumentsProvider
}