package com.esv.tripplanner.newroute.di

import com.esv.tripplanner.core.di.ProvidersFacade
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    dependencies = [ProvidersFacade::class]
)
interface NewRouteComponent {
    companion object {
        fun createComponent(providersFacade: ProvidersFacade): NewRouteComponent {
            return DaggerNewRouteComponent.builder().providersFacade(providersFacade).build();
        }
    }

    fun inject(fragment: com.esv.tripplanner.newroute.fragments.NewRouteFragment)
}