package com.esv.tripplanner.newroute.di

import com.esv.tripplanner.core_api.di.ProvidersFacade
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    dependencies = [com.esv.tripplanner.core_api.di.ProvidersFacade::class]
)
interface NewRouteComponent {
    companion object {
        fun createComponent(providersFacade: com.esv.tripplanner.core_api.di.ProvidersFacade): NewRouteComponent {
            return DaggerNewRouteComponent.builder().providersFacade(providersFacade).build();
        }
    }

    fun inject(fragment: com.esv.tripplanner.newroute.fragments.NewRouteFragment)
}