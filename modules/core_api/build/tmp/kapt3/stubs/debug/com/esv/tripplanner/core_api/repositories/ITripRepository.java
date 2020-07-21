package com.esv.tripplanner.core_api.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000eH&J\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u001c\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u000f0\u000e2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001c\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u000f0\u000e2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006 "}, d2 = {"Lcom/esv/tripplanner/core_api/repositories/ITripRepository;", "", "addVisitPlanToTrip", "", "tripId", "", "poiVisitPlan", "Lcom/esv/tripplanner/core_api/data/entities/PointOfInterestVisitPlan;", "(ILcom/esv/tripplanner/core_api/data/entities/PointOfInterestVisitPlan;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createEmptyTrip", "emptyTripName", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPointOfInterest", "Landroidx/lifecycle/LiveData;", "", "Lcom/esv/tripplanner/core_api/data/entities/PointOfInterest;", "getPointOfInterestById", "id", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTripById", "Lcom/esv/tripplanner/core_api/data/entities/Trip;", "getVisitPlansForTrip", "Lcom/esv/tripplanner/core_api/data/entities/relation_classes/TripVisitPlansRelation;", "getVisitPlansForTripJoin", "Lcom/esv/tripplanner/core_api/data/entities/relation_classes/TripPoiVisitPlanJoinRelation;", "savePointOfInterest", "", "poi", "(Lcom/esv/tripplanner/core_api/data/entities/PointOfInterest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "savePointOfInterestVisitPlan", "(Lcom/esv/tripplanner/core_api/data/entities/PointOfInterestVisitPlan;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_api_debug"})
public abstract interface ITripRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object createEmptyTrip(@org.jetbrains.annotations.NotNull()
    java.lang.String emptyTripName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTripById(int tripId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.esv.tripplanner.core_api.data.entities.Trip> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object savePointOfInterest(@org.jetbrains.annotations.NotNull()
    com.esv.tripplanner.core_api.data.entities.PointOfInterest poi, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object savePointOfInterestVisitPlan(@org.jetbrains.annotations.NotNull()
    com.esv.tripplanner.core_api.data.entities.PointOfInterestVisitPlan poiVisitPlan, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object addVisitPlanToTrip(int tripId, @org.jetbrains.annotations.NotNull()
    com.esv.tripplanner.core_api.data.entities.PointOfInterestVisitPlan poiVisitPlan, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> p2);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.esv.tripplanner.core_api.data.entities.relation_classes.TripPoiVisitPlanJoinRelation>> getVisitPlansForTripJoin(int tripId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.esv.tripplanner.core_api.data.entities.relation_classes.TripVisitPlansRelation>> getVisitPlansForTrip(int tripId);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPointOfInterestById(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.esv.tripplanner.core_api.data.entities.PointOfInterest> p1);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.esv.tripplanner.core_api.data.entities.PointOfInterest>> getPointOfInterest();
}