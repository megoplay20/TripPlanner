package com.esv.tripplanner.core

import com.esv.tripplanner.core_api.di.IAppProvider
import com.esv.tripplanner.core_api.di.IDatabaseProvider
import com.esv.tripplanner.core_impl.di.DatabaseComponent

object ComponentFactory {

    fun getDatabaseProvider(appProvider: IAppProvider): IDatabaseProvider {
        return DatabaseComponent.createComponent(appProvider)
    }
}