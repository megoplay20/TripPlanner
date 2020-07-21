package com.esv.tripplanner.loadroute.di

import com.esv.tripplanner.core_api.di.ProvidersFacade
import com.esv.tripplanner.loadroute.fragments.LoadRouteFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    dependencies = [com.esv.tripplanner.core_api.di.ProvidersFacade::class]
)
interface LoadRouteComponent {
    companion object {
        fun createComponent(providersFacade: com.esv.tripplanner.core_api.di.ProvidersFacade): LoadRouteComponent {
            return DaggerLoadRouteComponent.builder().providersFacade(providersFacade).build();
        }
    }

    fun inject(fragment: LoadRouteFragment)
}