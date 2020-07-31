package com.esv.tripplanner.core_api.di

import javax.inject.Qualifier

@Retention(AnnotationRetention.BINARY)
@Qualifier
annotation class EmptyPoi

@Retention(AnnotationRetention.BINARY)
@Qualifier
annotation class RuDateFormat


@Retention(AnnotationRetention.BINARY)
@Qualifier
annotation class RotePlannerApi