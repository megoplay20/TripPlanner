package com.esv.tripplanner.core_api.data.entities.relation_classes;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J3\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0019"}, d2 = {"Lcom/esv/tripplanner/core_api/data/entities/relation_classes/TripVisitPlansAndPoiRelation;", "", "trip", "Lcom/esv/tripplanner/core_api/data/entities/Trip;", "pointOfInterestVisitPlanList", "", "Lcom/esv/tripplanner/core_api/data/entities/PointOfInterestVisitPlan;", "route", "(Lcom/esv/tripplanner/core_api/data/entities/Trip;Ljava/util/List;Ljava/util/List;)V", "getPointOfInterestVisitPlanList", "()Ljava/util/List;", "getRoute", "getTrip", "()Lcom/esv/tripplanner/core_api/data/entities/Trip;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_api_debug"})
public final class TripVisitPlansAndPoiRelation {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded()
    private final com.esv.tripplanner.core_api.data.entities.Trip trip = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Relation(parentColumn = "id", entityColumn = "id", associateBy = @androidx.room.Junction(parentColumn = "tripId", value = com.esv.tripplanner.core_api.data.entities.TripPointOfInterestVisitPlanJoin.class, entityColumn = "poiVisitPlanId"))
    private final java.util.List<com.esv.tripplanner.core_api.data.entities.PointOfInterestVisitPlan> pointOfInterestVisitPlanList = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Relation(parentColumn = "id", entityColumn = "id", associateBy = @androidx.room.Junction(parentColumn = "tripId", value = com.esv.tripplanner.core_api.data.entities.TripRouteJoin.class, entityColumn = "poiVisitPlanId"))
    private final java.util.List<com.esv.tripplanner.core_api.data.entities.PointOfInterestVisitPlan> route = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.esv.tripplanner.core_api.data.entities.Trip getTrip() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.esv.tripplanner.core_api.data.entities.PointOfInterestVisitPlan> getPointOfInterestVisitPlanList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.esv.tripplanner.core_api.data.entities.PointOfInterestVisitPlan> getRoute() {
        return null;
    }
    
    public TripVisitPlansAndPoiRelation(@org.jetbrains.annotations.NotNull()
    com.esv.tripplanner.core_api.data.entities.Trip trip, @org.jetbrains.annotations.NotNull()
    java.util.List<com.esv.tripplanner.core_api.data.entities.PointOfInterestVisitPlan> pointOfInterestVisitPlanList, @org.jetbrains.annotations.NotNull()
    java.util.List<com.esv.tripplanner.core_api.data.entities.PointOfInterestVisitPlan> route) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.esv.tripplanner.core_api.data.entities.Trip component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.esv.tripplanner.core_api.data.entities.PointOfInterestVisitPlan> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.esv.tripplanner.core_api.data.entities.PointOfInterestVisitPlan> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.esv.tripplanner.core_api.data.entities.relation_classes.TripVisitPlansAndPoiRelation copy(@org.jetbrains.annotations.NotNull()
    com.esv.tripplanner.core_api.data.entities.Trip trip, @org.jetbrains.annotations.NotNull()
    java.util.List<com.esv.tripplanner.core_api.data.entities.PointOfInterestVisitPlan> pointOfInterestVisitPlanList, @org.jetbrains.annotations.NotNull()
    java.util.List<com.esv.tripplanner.core_api.data.entities.PointOfInterestVisitPlan> route) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}