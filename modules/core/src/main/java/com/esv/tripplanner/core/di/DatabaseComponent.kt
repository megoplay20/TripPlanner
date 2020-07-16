package com.esv.tripplanner.core.di

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    dependencies = [IAppProvider::class],
    modules = [DataModule::class]
)
interface DatabaseComponent : IDatabaseProvider {

    companion object{
        fun createComponent(app: IAppProvider): DatabaseComponent {
            return DaggerDatabaseComponent.builder().iAppProvider(app).build()
        }
    }

}