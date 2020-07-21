package com.esv.tripplanner.core_api.data.entities;

import java.lang.System;

@androidx.room.Entity(primaryKeys = {"tripId", "poiVisitPlanId"}, indices = {@androidx.room.Index(value = {"tripId"}), @androidx.room.Index(value = {"poiVisitPlanId"})}, foreignKeys = {@androidx.room.ForeignKey(entity = com.esv.tripplanner.core_api.data.entities.PointOfInterestVisitPlan.class, childColumns = {"poiVisitPlanId"}, onDelete = 5, parentColumns = {"id"}), @androidx.room.ForeignKey(entity = com.esv.tripplanner.core_api.data.entities.Trip.class, childColumns = {"tripId"}, onDelete = 5, parentColumns = {"id"})})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/esv/tripplanner/core_api/data/entities/TripRouteJoin;", "", "tripId", "", "poiVisitPlanId", "order", "(III)V", "getOrder", "()I", "getPoiVisitPlanId", "getTripId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "core_api_debug"})
public final class TripRouteJoin {
    private final int tripId = 0;
    private final int poiVisitPlanId = 0;
    private final int order = 0;
    
    public final int getTripId() {
        return 0;
    }
    
    public final int getPoiVisitPlanId() {
        return 0;
    }
    
    public final int getOrder() {
        return 0;
    }
    
    public TripRouteJoin(int tripId, int poiVisitPlanId, int order) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int component3() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.esv.tripplanner.core_api.data.entities.TripRouteJoin copy(int tripId, int poiVisitPlanId, int order) {
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