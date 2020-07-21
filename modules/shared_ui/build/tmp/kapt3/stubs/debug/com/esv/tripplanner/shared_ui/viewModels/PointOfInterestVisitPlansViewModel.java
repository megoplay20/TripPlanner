package com.esv.tripplanner.shared_ui.viewModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u001eJ\u0006\u0010 \u001a\u00020\u001eJ\u0006\u0010!\u001a\u00020\u001eJ\u001e\u0010\"\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\n2\u0006\u0010#\u001a\u00020$J\u0006\u0010%\u001a\u00020\u001eR\u001c\u0010\t\u001a\u00020\n8GX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR&\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006&"}, d2 = {"Lcom/esv/tripplanner/shared_ui/viewModels/PointOfInterestVisitPlansViewModel;", "Lcom/esv/tripplanner/shared_ui/viewModels/PointOfInterestViewModel;", "app", "Landroid/app/Application;", "repository", "Lcom/esv/tripplanner/core_api/repositories/ITripRepository;", "navigator", "Lcom/esv/tripplanner/core_api/navigation/INavigationProvider;", "(Landroid/app/Application;Lcom/esv/tripplanner/core_api/repositories/ITripRepository;Lcom/esv/tripplanner/core_api/navigation/INavigationProvider;)V", "poiVisitPlan", "Lcom/esv/tripplanner/core_api/data/entities/PointOfInterestVisitPlan;", "getPoiVisitPlan", "()Lcom/esv/tripplanner/core_api/data/entities/PointOfInterestVisitPlan;", "setPoiVisitPlan", "(Lcom/esv/tripplanner/core_api/data/entities/PointOfInterestVisitPlan;)V", "pointOfInterestList", "Landroidx/lifecycle/LiveData;", "", "Lcom/esv/tripplanner/core_api/data/entities/PointOfInterest;", "getPointOfInterestList", "()Landroidx/lifecycle/LiveData;", "setPointOfInterestList", "(Landroidx/lifecycle/LiveData;)V", "tripId", "", "getTripId", "()I", "setTripId", "(I)V", "addNewPoi", "", "cancel", "deleteVisitPlanPoi", "editVisitPlan", "initVisitPlansViewModel", "typeCaster", "Lcom/esv/tripplanner/core_api/helpers/ITypeCaster;", "saveVisitPlan", "shared_ui_debug"})
public final class PointOfInterestVisitPlansViewModel extends com.esv.tripplanner.shared_ui.viewModels.PointOfInterestViewModel {
    @org.jetbrains.annotations.NotNull()
    public com.esv.tripplanner.core_api.data.entities.PointOfInterestVisitPlan poiVisitPlan;
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.LiveData<java.util.List<com.esv.tripplanner.core_api.data.entities.PointOfInterest>> pointOfInterestList;
    private int tripId = -1;
    
    @org.jetbrains.annotations.NotNull()
    @androidx.databinding.Bindable()
    public final com.esv.tripplanner.core_api.data.entities.PointOfInterestVisitPlan getPoiVisitPlan() {
        return null;
    }
    
    public final void setPoiVisitPlan(@org.jetbrains.annotations.NotNull()
    com.esv.tripplanner.core_api.data.entities.PointOfInterestVisitPlan p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.esv.tripplanner.core_api.data.entities.PointOfInterest>> getPointOfInterestList() {
        return null;
    }
    
    public final void setPointOfInterestList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.esv.tripplanner.core_api.data.entities.PointOfInterest>> p0) {
    }
    
    public final int getTripId() {
        return 0;
    }
    
    public final void setTripId(int p0) {
    }
    
    public final void initVisitPlansViewModel(int tripId, @org.jetbrains.annotations.NotNull()
    com.esv.tripplanner.core_api.data.entities.PointOfInterestVisitPlan poiVisitPlan, @org.jetbrains.annotations.NotNull()
    com.esv.tripplanner.core_api.helpers.ITypeCaster typeCaster) {
    }
    
    public final void addNewPoi() {
    }
    
    public final void saveVisitPlan() {
    }
    
    public final void editVisitPlan() {
    }
    
    public final void deleteVisitPlanPoi() {
    }
    
    public final void cancel() {
    }
    
    public PointOfInterestVisitPlansViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application app, @org.jetbrains.annotations.NotNull()
    com.esv.tripplanner.core_api.repositories.ITripRepository repository, @org.jetbrains.annotations.NotNull()
    com.esv.tripplanner.core_api.navigation.INavigationProvider navigator) {
        super(null, null, null);
    }
}