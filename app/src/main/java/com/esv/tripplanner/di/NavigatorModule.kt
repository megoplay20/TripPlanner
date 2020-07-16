package com.esv.tripplanner.di

import android.app.Application
import android.content.Context
import com.esv.tripplanner.core.navigation.IArgumentsProvider
import com.esv.tripplanner.core.navigation.INavigationProvider
import com.esv.tripplanner.core.navigation.INavigatorComponentsProvider
import com.esv.tripplanner.navigation.ArgumentProvider
import com.esv.tripplanner.navigation.NavigationComponent
import com.esv.tripplanner.navigation.Navigator
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [NavigatorModule.NavigatorBinds::class])
class NavigatorModule {

    @Module
    abstract class NavigatorBinds{

        @Binds
        @Singleton
        abstract fun getNavigator(nav: Navigator): INavigationProvider


        @Binds
        @Singleton
        abstract fun getArgumentProvider(args: ArgumentProvider): IArgumentsProvider

        @Binds
        @Singleton
        abstract fun getNavComponentProvider(navComponent: NavigationComponent): INavigatorComponentsProvider


    }

}
