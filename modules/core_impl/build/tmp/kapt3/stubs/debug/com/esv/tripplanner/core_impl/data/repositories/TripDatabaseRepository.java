package com.esv.tripplanner.core_impl.data.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ!\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0014\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0017H\u0016J\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u001c\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00180\u00172\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00180\u00172\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0019\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0019H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J\u0019\u0010\'\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010(R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006)"}, d2 = {"Lcom/esv/tripplanner/core_impl/data/repositories/TripDatabaseRepository;", "Lcom/esv/tripplanner/core_api/repositories/ITripRepository;", "database", "Landroidx/room/RoomDatabase;", "tripDao", "Lcom/esv/tripplanner/core_api/data/dao/TripDao;", "poiDao", "Lcom/esv/tripplanner/core_api/data/dao/PointOfInterestDao;", "poiVisitPlanDao", "Lcom/esv/tripplanner/core_api/data/dao/VisitPlansDao;", "(Landroidx/room/RoomDatabase;Lcom/esv/tripplanner/core_api/data/dao/TripDao;Lcom/esv/tripplanner/core_api/data/dao/PointOfInterestDao;Lcom/esv/tripplanner/core_api/data/dao/VisitPlansDao;)V", "addVisitPlanToTrip", "", "tripId", "", "poiVisitPlan", "Lcom/esv/tripplanner/core_api/data/entities/PointOfInterestVisitPlan;", "(ILcom/esv/tripplanner/core_api/data/entities/PointOfInterestVisitPlan;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createEmptyTrip", "emptyTripName", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPointOfInterest", "Landroidx/lifecycle/LiveData;", "", "Lcom/esv/tripplanner/core_api/data/entities/PointOfInterest;", "getPointOfInterestById", "id", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTripById", "Lcom/esv/tripplanner/core_api/data/entities/Trip;", "getVisitPlansForTrip", "Lcom/esv/tripplanner/core_api/data/entities/relation_classes/TripVisitPlansRelation;", "getVisitPlansForTripJoin", "Lcom/esv/tripplanner/core_api/data/entities/relation_classes/TripPoiVisitPlanJoinRelation;", "savePointOfInterest", "", "poi", "(Lcom/esv/tripplanner/core_api/data/entities/PointOfInterest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "savePointOfInterestVisitPlan", "(Lcom/esv/tripplanner/core_api/data/entities/PointOfInterestVisitPlan;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_impl_debug"})
public final class TripDatabaseRepository implements com.esv.tripplanner.core_api.repositories.ITripRepository {
    private final androidx.room.RoomDatabase database = null;
    private final com.esv.tripplanner.core_api.data.dao.TripDao tripDao = null;
    private final com.esv.tripplanner.core_api.data.dao.PointOfInterestDao poiDao = null;
    private final com.esv.tripplanner.core_api.data.dao.VisitPlansDao poiVisitPlanDao = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object createEmptyTrip(@org.jetbrains.annotations.NotNull()
    java.lang.String emptyTripName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getTripById(int tripId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.esv.tripplanner.core_api.data.entities.Trip> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object savePointOfInterest(@org.jetbrains.annotations.NotNull()
    com.esv.tripplanner.core_api.data.entities.PointOfInterest poi, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object savePointOfInterestVisitPlan(@org.jetbrains.annotations.NotNull()
    com.esv.tripplanner.core_api.data.entities.PointOfInterestVisitPlan poiVisitPlan, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object addVisitPlanToTrip(int tripId, @org.jetbrains.annotations.NotNull()
    com.esv.tripplanner.core_api.data.entities.PointOfInterestVisitPlan poiVisitPlan, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.esv.tripplanner.core_api.data.entities.relation_classes.TripPoiVisitPlanJoinRelation>> getVisitPlansForTripJoin(int tripId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.esv.tripplanner.core_api.data.entities.relation_classes.TripVisitPlansRelation>> getVisitPlansForTrip(int tripId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.esv.tripplanner.core_api.data.entities.PointOfInterest>> getPointOfInterest() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getPointOfInterestById(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.esv.tripplanner.core_api.data.entities.PointOfInterest> p1) {
        return null;
    }
    
    public TripDatabaseRepository(@org.jetbrains.annotations.NotNull()
    androidx.room.RoomDatabase database, @org.jetbrains.annotations.NotNull()
    com.esv.tripplanner.core_api.data.dao.TripDao tripDao, @org.jetbrains.annotations.NotNull()
    com.esv.tripplanner.core_api.data.dao.PointOfInterestDao poiDao, @org.jetbrains.annotations.NotNull()
    com.esv.tripplanner.core_api.data.dao.VisitPlansDao poiVisitPlanDao) {
        super();
    }
}