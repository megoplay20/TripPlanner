package com.esv.tripplanner.core_impl.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007\u00a8\u0006\n"}, d2 = {"Lcom/esv/tripplanner/core_impl/di/DataModule;", "", "()V", "getTripDatabase", "Landroidx/room/RoomDatabase;", "app", "Landroid/app/Application;", "getTripRepository", "Lcom/esv/tripplanner/core_api/repositories/ITripRepository;", "database", "core_impl_debug"})
@dagger.Module()
public final class DataModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final androidx.room.RoomDatabase getTripDatabase(@org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.esv.tripplanner.core_api.repositories.ITripRepository getTripRepository(@org.jetbrains.annotations.NotNull()
    androidx.room.RoomDatabase database) {
        return null;
    }
    
    public DataModule() {
        super();
    }
}