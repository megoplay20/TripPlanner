package com.esv.tripplanner.di

import android.app.Application
import android.content.Context
import com.esv.tripplanner.fragments.AddVisitPlanFragment
import com.esv.tripplanner.fragments.NewRouteFragment
import com.esv.tripplanner.fragments.PointOfInterestFragment
import com.esv.tripplanner.fragments.StartFragment
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [UtilsModule::class, DataModule::class])
interface AppComponent {
    fun inject(newRouteFragment: NewRouteFragment)
    fun inject(newRouteFragment: AddVisitPlanFragment)
    fun inject(pointOfInterestFragment: PointOfInterestFragment)
    fun inject(startFragment: StartFragment)

    companion object{
        fun createComponent(app:Application, appContext: Context): AppComponent {
            return DaggerAppComponent.builder()
                .applicationContext(appContext)
                .application(app)
                .build()
        }
    }

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun applicationContext(applicationContext: Context): Builder
        @BindsInstance
        fun application(application: Application): Builder
        fun build(): AppComponent
    }
}