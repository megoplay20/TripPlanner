package com.esv.tripplanner.core_api.di

import com.esv.tripplanner.core_api.navigation.INavigatorComponentsProvider

interface ProvidersFacade : com.esv.tripplanner.core_api.navigation.INavigatorComponentsProvider, IAppProvider, IDatabaseProvider, IUtilsProvider{
}