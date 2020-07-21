package com.esv.tripplanner.newroute.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\b\u0010\u0019\u001a\u00020\u0004H\u0016J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0004H\u0016J\u0018\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0004H\u0016J\u0014\u0010\"\u001a\u00020\u001b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0#R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006$"}, d2 = {"Lcom/esv/tripplanner/newroute/adapters/PoiVisitPlaceAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/esv/tripplanner/newroute/adapters/PoiVisitPlacesViewHolder;", "tripId", "", "app", "Landroid/app/Application;", "poiVisitPlaces", "", "Lcom/esv/tripplanner/core_api/data/entities/PointOfInterestVisitPlan;", "typeCaster", "Lcom/esv/tripplanner/core_api/helpers/ITypeCaster;", "repository", "Lcom/esv/tripplanner/core_api/repositories/ITripRepository;", "navigator", "Lcom/esv/tripplanner/core_api/navigation/INavigationProvider;", "(ILandroid/app/Application;Ljava/util/List;Lcom/esv/tripplanner/core_api/helpers/ITypeCaster;Lcom/esv/tripplanner/core_api/repositories/ITripRepository;Lcom/esv/tripplanner/core_api/navigation/INavigationProvider;)V", "getNavigator", "()Lcom/esv/tripplanner/core_api/navigation/INavigationProvider;", "getRepository", "()Lcom/esv/tripplanner/core_api/repositories/ITripRepository;", "getTripId", "()I", "getTypeCaster", "()Lcom/esv/tripplanner/core_api/helpers/ITypeCaster;", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setPlaces", "", "newroute_debug"})
public final class PoiVisitPlaceAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.esv.tripplanner.newroute.adapters.PoiVisitPlacesViewHolder> {
    private final int tripId = 0;
    private final android.app.Application app = null;
    private java.util.List<com.esv.tripplanner.core_api.data.entities.PointOfInterestVisitPlan> poiVisitPlaces;
    @org.jetbrains.annotations.NotNull()
    private final com.esv.tripplanner.core_api.helpers.ITypeCaster typeCaster = null;
    @org.jetbrains.annotations.NotNull()
    private final com.esv.tripplanner.core_api.repositories.ITripRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.esv.tripplanner.core_api.navigation.INavigationProvider navigator = null;
    
    public final void setPlaces(@org.jetbrains.annotations.NotNull()
    java.util.List<com.esv.tripplanner.core_api.data.entities.PointOfInterestVisitPlan> poiVisitPlaces) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.esv.tripplanner.newroute.adapters.PoiVisitPlacesViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.esv.tripplanner.newroute.adapters.PoiVisitPlacesViewHolder holder, int position) {
    }
    
    public final int getTripId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.esv.tripplanner.core_api.helpers.ITypeCaster getTypeCaster() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.esv.tripplanner.core_api.repositories.ITripRepository getRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.esv.tripplanner.core_api.navigation.INavigationProvider getNavigator() {
        return null;
    }
    
    public PoiVisitPlaceAdapter(int tripId, @org.jetbrains.annotations.NotNull()
    android.app.Application app, @org.jetbrains.annotations.NotNull()
    java.util.List<com.esv.tripplanner.core_api.data.entities.PointOfInterestVisitPlan> poiVisitPlaces, @org.jetbrains.annotations.NotNull()
    com.esv.tripplanner.core_api.helpers.ITypeCaster typeCaster, @org.jetbrains.annotations.NotNull()
    com.esv.tripplanner.core_api.repositories.ITripRepository repository, @org.jetbrains.annotations.NotNull()
    com.esv.tripplanner.core_api.navigation.INavigationProvider navigator) {
        super();
    }
}