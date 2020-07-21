package com.esv.tripplanner.core_impl.data.database;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.esv.tripplanner.core_api.data.database_converters.DbDateConverter.class, com.esv.tripplanner.core_api.data.database_converters.DbLocalTimeConverter.class})
@androidx.room.Database(entities = {com.esv.tripplanner.core_api.data.entities.PointOfInterest.class, com.esv.tripplanner.core_api.data.entities.PointOfInterestVisitPlan.class, com.esv.tripplanner.core_api.data.entities.Trip.class, com.esv.tripplanner.core_api.data.entities.TripRouteJoin.class, com.esv.tripplanner.core_api.data.entities.TripPointOfInterestVisitPlanJoin.class}, version = 8)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\n"}, d2 = {"Lcom/esv/tripplanner/core_impl/data/database/TripDatabase;", "Landroidx/room/RoomDatabase;", "()V", "pointOfInterest", "Lcom/esv/tripplanner/core_api/data/dao/PointOfInterestDao;", "pointOfInterestVisitPlans", "Lcom/esv/tripplanner/core_api/data/dao/VisitPlansDao;", "trips", "Lcom/esv/tripplanner/core_api/data/dao/TripDao;", "Companion", "core_impl_debug"})
public abstract class TripDatabase extends androidx.room.RoomDatabase {
    private static volatile com.esv.tripplanner.core_impl.data.database.TripDatabase databaseInstance;
    public static final com.esv.tripplanner.core_impl.data.database.TripDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.esv.tripplanner.core_api.data.dao.PointOfInterestDao pointOfInterest();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.esv.tripplanner.core_api.data.dao.VisitPlansDao pointOfInterestVisitPlans();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.esv.tripplanner.core_api.data.dao.TripDao trips();
    
    public TripDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/esv/tripplanner/core_impl/data/database/TripDatabase$Companion;", "", "()V", "databaseInstance", "Lcom/esv/tripplanner/core_impl/data/database/TripDatabase;", "getDatabase", "applicationContext", "Landroid/content/Context;", "core_impl_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.esv.tripplanner.core_impl.data.database.TripDatabase getDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context applicationContext) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}