package com.esv.tripplanner.core.di

import com.esv.tripplanner.core.navigation.INavigatorComponentsProvider

interface ProvidersFacade : INavigatorComponentsProvider, IAppProvider, IDatabaseProvider, IUtilsProvider{
}