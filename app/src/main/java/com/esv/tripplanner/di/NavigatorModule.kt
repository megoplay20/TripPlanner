package com.esv.tripplanner.di

import com.esv.tripplanner.core_api.navigation.IArgumentsProvider
import com.esv.tripplanner.core_api.navigation.INavigationProvider
import com.esv.tripplanner.core_api.navigation.INavigatorComponentsProvider
import com.esv.tripplanner.navigation.ArgumentProvider
import com.esv.tripplanner.navigation.NavigationComponent
import com.esv.tripplanner.navigation.Navigator
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module(includes = [NavigatorModule.NavigatorBinds::class])
class NavigatorModule {

    @Module
    abstract class NavigatorBinds{

        @Binds
        @Singleton
        abstract fun getNavigator(nav: Navigator): com.esv.tripplanner.core_api.navigation.INavigationProvider


        @Binds
        @Singleton
        abstract fun getArgumentProvider(args: ArgumentProvider): com.esv.tripplanner.core_api.navigation.IArgumentsProvider

        @Binds
        @Singleton
        abstract fun getNavComponentProvider(navComponent: NavigationComponent): com.esv.tripplanner.core_api.navigation.INavigatorComponentsProvider


    }

}
