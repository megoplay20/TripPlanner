package com.esv.tripplanner.core_api.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/esv/tripplanner/core_api/di/IDatabaseProvider;", "", "provideDb", "Landroidx/room/RoomDatabase;", "provideTripRepo", "Lcom/esv/tripplanner/core_api/repositories/ITripRepository;", "core_api_debug"})
public abstract interface IDatabaseProvider {
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.room.RoomDatabase provideDb();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.esv.tripplanner.core_api.repositories.ITripRepository provideTripRepo();
}