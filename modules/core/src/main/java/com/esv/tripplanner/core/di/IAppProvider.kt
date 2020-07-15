package com.esv.tripplanner.core.di

import android.app.Application
import android.content.Context

interface IAppProvider {

    fun provideContext(): Context
    fun provideApplication(): Application


}