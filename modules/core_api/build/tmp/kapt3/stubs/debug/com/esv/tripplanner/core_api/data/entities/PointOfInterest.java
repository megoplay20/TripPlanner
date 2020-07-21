package com.esv.tripplanner.core_api.data.entities;

import java.lang.System;

@androidx.room.Entity(tableName = "point_of_interest")
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\bH\u00c6\u0003J1\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\"\u001a\u00020\u000fH\u00d6\u0001J\t\u0010#\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\rR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006$"}, d2 = {"Lcom/esv/tripplanner/core_api/data/entities/PointOfInterest;", "", "name", "", "description", "location", "Lcom/esv/tripplanner/core_api/data/entities/Location;", "workingHours", "Lcom/esv/tripplanner/core_api/helpers/TimeSpan;", "(Ljava/lang/String;Ljava/lang/String;Lcom/esv/tripplanner/core_api/data/entities/Location;Lcom/esv/tripplanner/core_api/helpers/TimeSpan;)V", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "id", "", "getId", "()I", "setId", "(I)V", "getLocation", "()Lcom/esv/tripplanner/core_api/data/entities/Location;", "getName", "setName", "getWorkingHours", "()Lcom/esv/tripplanner/core_api/helpers/TimeSpan;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "core_api_debug"})
public final class PointOfInterest {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int id = 0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String description;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded()
    private final com.esv.tripplanner.core_api.data.entities.Location location = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded()
    private final com.esv.tripplanner.core_api.helpers.TimeSpan workingHours = null;
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.esv.tripplanner.core_api.data.entities.Location getLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.esv.tripplanner.core_api.helpers.TimeSpan getWorkingHours() {
        return null;
    }
    
    public PointOfInterest(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    com.esv.tripplanner.core_api.data.entities.Location location, @org.jetbrains.annotations.NotNull()
    com.esv.tripplanner.core_api.helpers.TimeSpan workingHours) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.esv.tripplanner.core_api.data.entities.Location component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.esv.tripplanner.core_api.helpers.TimeSpan component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.esv.tripplanner.core_api.data.entities.PointOfInterest copy(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    com.esv.tripplanner.core_api.data.entities.Location location, @org.jetbrains.annotations.NotNull()
    com.esv.tripplanner.core_api.helpers.TimeSpan workingHours) {
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