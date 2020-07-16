package com.esv.tripplanner.pointofinterest.di

import com.esv.tripplanner.core.di.ProvidersFacade
import com.esv.tripplanner.pointofinterest.fragments.PointOfInterestFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    dependencies = [ProvidersFacade::class]
)
interface PointOfInterestComponent {
    companion object {
        fun createComponent(providersFacade: ProvidersFacade): PointOfInterestComponent {
            return DaggerPointOfInterestComponent.builder().providersFacade(providersFacade).build();
        }
    }

    fun inject(fragment: PointOfInterestFragment)
}