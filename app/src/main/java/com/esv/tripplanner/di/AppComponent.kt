package com.esv.tripplanner.di

import android.app.Application
import com.esv.tripplanner.core.di.IAppProvider
import com.esv.tripplanner.core.di.IUtilsProvider
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [UtilsModule::class])
interface AppComponent : IAppProvider, IUtilsProvider{

    companion object{
        private var appComponent: AppComponent? = null

        fun createComponent(application: Application): AppComponent {
            return appComponent ?: DaggerAppComponent
                .builder()
                .application(application)
                .build().also {
                    appComponent = it
                }
        }



    }

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder
        fun build(): AppComponent
    }



}