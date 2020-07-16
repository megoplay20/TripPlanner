package com.esv.tripplanner.core_api.navigation

interface INavigatorComponentsProvider {
    fun provideNavigator(): com.esv.tripplanner.core_api.navigation.INavigationProvider
    fun provideArguments(): com.esv.tripplanner.core_api.navigation.IArgumentsProvider
    fun provideNavigatorComponents(): INavigatorComponentsProvider
}