package com.esv.tripplanner.core_api.data.entities;

import java.lang.System;

@androidx.room.Entity(tableName = "point_of_interest_visit_plan", foreignKeys = {@androidx.room.ForeignKey(entity = com.esv.tripplanner.core_api.data.entities.PointOfInterest.class, childColumns = {"pointOfInterestId"}, onDelete = 5, parentColumns = {"id"})})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\t\u0010\u001a\u001a\u00020\u0007H\u00c6\u0003J.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001J\t\u0010 \u001a\u00020!H\u00d6\u0001R\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\rR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\""}, d2 = {"Lcom/esv/tripplanner/core_api/data/entities/PointOfInterestVisitPlan;", "", "pointOfInterestId", "", "visitTimeHrs", "", "isStartPoint", "", "(ILjava/lang/Double;Z)V", "id", "getId", "()I", "setId", "(I)V", "()Z", "setStartPoint", "(Z)V", "getPointOfInterestId", "setPointOfInterestId", "getVisitTimeHrs", "()Ljava/lang/Double;", "setVisitTimeHrs", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "component1", "component2", "component3", "copy", "(ILjava/lang/Double;Z)Lcom/esv/tripplanner/core_api/data/entities/PointOfInterestVisitPlan;", "equals", "other", "hashCode", "toString", "", "core_api_debug"})
public final class PointOfInterestVisitPlan {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int id = 0;
    @androidx.room.ColumnInfo(index = true)
    private int pointOfInterestId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double visitTimeHrs;
    private boolean isStartPoint;
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    public final int getPointOfInterestId() {
        return 0;
    }
    
    public final void setPointOfInterestId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getVisitTimeHrs() {
        return null;
    }
    
    public final void setVisitTimeHrs(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    public final boolean isStartPoint() {
        return false;
    }
    
    public final void setStartPoint(boolean p0) {
    }
    
    public PointOfInterestVisitPlan(int pointOfInterestId, @org.jetbrains.annotations.Nullable()
    java.lang.Double visitTimeHrs, boolean isStartPoint) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component2() {
        return null;
    }
    
    public final boolean component3() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.esv.tripplanner.core_api.data.entities.PointOfInterestVisitPlan copy(int pointOfInterestId, @org.jetbrains.annotations.Nullable()
    java.lang.Double visitTimeHrs, boolean isStartPoint) {
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