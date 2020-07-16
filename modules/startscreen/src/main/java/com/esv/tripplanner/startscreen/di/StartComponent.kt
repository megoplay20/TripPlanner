package com.esv.tripplanner.startscreen.di

import com.esv.tripplanner.core_api.di.ProvidersFacade
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    dependencies = [com.esv.tripplanner.core_api.di.ProvidersFacade::class]
)
interface StartComponent {

    companion object {
        fun createComponent(providersFacade: com.esv.tripplanner.core_api.di.ProvidersFacade): StartComponent {
                return DaggerStartComponent.builder().providersFacade(providersFacade).build();
        }
    }

    fun inject(fragment: com.esv.tripplanner.startscreen.fragments.StartFragment)

}