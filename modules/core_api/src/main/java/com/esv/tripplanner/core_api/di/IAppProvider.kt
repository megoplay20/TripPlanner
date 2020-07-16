package com.esv.tripplanner.core_api.di

import android.app.Application
import android.content.Context

interface IAppProvider {

    fun provideContext(): Context
    fun provideApplication(): Application


}