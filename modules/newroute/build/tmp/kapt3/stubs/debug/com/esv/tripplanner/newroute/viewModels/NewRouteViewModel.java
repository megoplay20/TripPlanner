package com.esv.tripplanner.newroute.viewModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010(\u001a\u00020)J\b\u0010*\u001a\u00020\u001bH\u0007J\u000e\u0010+\u001a\u00020)2\u0006\u0010\u0013\u001a\u00020\u0012J\u0010\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020\u001bH\u0007R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00128F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001a\u001a\u00020\u001b8GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR&\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0!X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'\u00a8\u0006."}, d2 = {"Lcom/esv/tripplanner/newroute/viewModels/NewRouteViewModel;", "Lcom/esv/tripplanner/core_api/helpers/AndroidObservableViewModel;", "app", "Landroid/app/Application;", "repository", "Lcom/esv/tripplanner/core_api/repositories/ITripRepository;", "dateProcessor", "Lcom/esv/tripplanner/core_api/helpers/IDateProcessor;", "nav", "Lcom/esv/tripplanner/core_api/navigation/INavigationProvider;", "(Landroid/app/Application;Lcom/esv/tripplanner/core_api/repositories/ITripRepository;Lcom/esv/tripplanner/core_api/helpers/IDateProcessor;Lcom/esv/tripplanner/core_api/navigation/INavigationProvider;)V", "date", "Ljava/util/Date;", "getDate", "()Ljava/util/Date;", "setDate", "(Ljava/util/Date;)V", "<set-?>", "", "tripId", "getTripId", "()I", "setTripId", "(I)V", "tripId$delegate", "Lkotlin/properties/ReadWriteProperty;", "tripName", "", "getTripName", "()Ljava/lang/String;", "setTripName", "(Ljava/lang/String;)V", "tripVisitPlacesRelations", "Landroidx/lifecycle/LiveData;", "", "Lcom/esv/tripplanner/core_api/data/entities/relation_classes/TripVisitPlansRelation;", "getTripVisitPlacesRelations", "()Landroidx/lifecycle/LiveData;", "setTripVisitPlacesRelations", "(Landroidx/lifecycle/LiveData;)V", "addVisitPlace", "", "getDateAsText", "init", "setDateAsText", "value", "newroute_debug"})
public final class NewRouteViewModel extends com.esv.tripplanner.core_api.helpers.AndroidObservableViewModel {
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.LiveData<java.util.List<com.esv.tripplanner.core_api.data.entities.relation_classes.TripVisitPlansRelation>> tripVisitPlacesRelations;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty tripId$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String tripName = "";
    @org.jetbrains.annotations.NotNull()
    private java.util.Date date;
    private final com.esv.tripplanner.core_api.repositories.ITripRepository repository = null;
    private final com.esv.tripplanner.core_api.helpers.IDateProcessor dateProcessor = null;
    private final com.esv.tripplanner.core_api.navigation.INavigationProvider nav = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.esv.tripplanner.core_api.data.entities.relation_classes.TripVisitPlansRelation>> getTripVisitPlacesRelations() {
        return null;
    }
    
    public final void setTripVisitPlacesRelations(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.esv.tripplanner.core_api.data.entities.relation_classes.TripVisitPlansRelation>> p0) {
    }
    
    public final int getTripId() {
        return 0;
    }
    
    public final void setTripId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.databinding.Bindable()
    public final java.lang.String getTripName() {
        return null;
    }
    
    public final void setTripName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getDate() {
        return null;
    }
    
    public final void setDate(@org.jetbrains.annotations.NotNull()
    java.util.Date p0) {
    }
    
    public final void init(int tripId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.databinding.Bindable()
    public final java.lang.String getDateAsText() {
        return null;
    }
    
    @androidx.databinding.Bindable()
    public final void setDateAsText(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    public final void addVisitPlace() {
    }
    
    public NewRouteViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application app, @org.jetbrains.annotations.NotNull()
    com.esv.tripplanner.core_api.repositories.ITripRepository repository, @org.jetbrains.annotations.NotNull()
    com.esv.tripplanner.core_api.helpers.IDateProcessor dateProcessor, @org.jetbrains.annotations.NotNull()
    com.esv.tripplanner.core_api.navigation.INavigationProvider nav) {
        super(null);
    }
}