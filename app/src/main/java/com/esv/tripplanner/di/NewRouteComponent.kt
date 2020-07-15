package com.esv.tripplanner.di

import com.esv.tripplanner.core.di.ProvidersFacade
import com.esv.tripplanner.fragments.NewRouteFragment
import com.esv.tripplanner.fragments.PointOfInterestFragment
import com.esv.tripplanner.fragments.StartFragment
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

    fun inject(fragment: NewRouteFragment)
}