package com.esv.tripplanner.di

import com.esv.tripplanner.core.di.ProvidersFacade
import com.esv.tripplanner.fragments.PointOfInterestFragment
import com.esv.tripplanner.fragments.StartFragment
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