package com.esv.tripplanner.core_api.data.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\t2\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00030\t2\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u0019\u0010\u0013\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0019\u0010\u0013\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001f"}, d2 = {"Lcom/esv/tripplanner/core_api/data/dao/TripDao;", "", "loadTrip", "", "Lcom/esv/tripplanner/core_api/data/entities/Trip;", "tripId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadTripPoiVisitPlanJoin", "Landroidx/lifecycle/LiveData;", "Lcom/esv/tripplanner/core_api/data/entities/relation_classes/TripPoiVisitPlanJoinRelation;", "loadTripWithRelations", "Lcom/esv/tripplanner/core_api/data/entities/relation_classes/TripVisitPlansAndPoiRelation;", "loadTripWithRouteRelation", "Lcom/esv/tripplanner/core_api/data/entities/relation_classes/TripRouteRelation;", "loadTripWithVisitPlanRelation", "Lcom/esv/tripplanner/core_api/data/entities/relation_classes/TripVisitPlansRelation;", "loadTripWithVisitPlanRelationNoLiveData", "loadTrips", "save", "", "trip", "(Lcom/esv/tripplanner/core_api/data/entities/Trip;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "tripPoiVisitPlanJoin", "Lcom/esv/tripplanner/core_api/data/entities/TripPointOfInterestVisitPlanJoin;", "(Lcom/esv/tripplanner/core_api/data/entities/TripPointOfInterestVisitPlanJoin;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tripRouteJoin", "Lcom/esv/tripplanner/core_api/data/entities/TripRouteJoin;", "(Lcom/esv/tripplanner/core_api/data/entities/TripRouteJoin;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "core_api_debug"})
public abstract interface TripDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM trip")
    public abstract java.util.List<com.esv.tripplanner.core_api.data.entities.Trip> loadTrips();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM trip  WHERE id = :tripId")
    public abstract java.lang.Object loadTrip(int tripId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.esv.tripplanner.core_api.data.entities.Trip>> p1);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM trip WHERE id = :tripId")
    @androidx.room.Transaction()
    public abstract java.util.List<com.esv.tripplanner.core_api.data.entities.relation_classes.TripVisitPlansAndPoiRelation> loadTripWithRelations(int tripId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM trip WHERE id = :tripId")
    @androidx.room.Transaction()
    public abstract java.util.List<com.esv.tripplanner.core_api.data.entities.relation_classes.TripVisitPlansRelation> loadTripWithVisitPlanRelationNoLiveData(int tripId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM trip WHERE id = :tripId")
    @androidx.room.Transaction()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.esv.tripplanner.core_api.data.entities.relation_classes.TripVisitPlansRelation>> loadTripWithVisitPlanRelation(int tripId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM trippointofinterestvisitplanjoin WHERE tripId = :tripId")
    @androidx.room.Transaction()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.esv.tripplanner.core_api.data.entities.relation_classes.TripPoiVisitPlanJoinRelation>> loadTripPoiVisitPlanJoin(int tripId);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM trip WHERE id = :tripId")
    @androidx.room.Transaction()
    public abstract java.lang.Object loadTripWithRouteRelation(int tripId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.esv.tripplanner.core_api.data.entities.relation_classes.TripRouteRelation>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert()
    public abstract java.lang.Object save(@org.jetbrains.annotations.NotNull()
    com.esv.tripplanner.core_api.data.entities.Trip trip, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Update()
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.esv.tripplanner.core_api.data.entities.Trip trip, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert()
    public abstract java.lang.Object save(@org.jetbrains.annotations.NotNull()
    com.esv.tripplanner.core_api.data.entities.TripPointOfInterestVisitPlanJoin tripPoiVisitPlanJoin, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert()
    public abstract java.lang.Object save(@org.jetbrains.annotations.NotNull()
    com.esv.tripplanner.core_api.data.entities.TripRouteJoin tripRouteJoin, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
}