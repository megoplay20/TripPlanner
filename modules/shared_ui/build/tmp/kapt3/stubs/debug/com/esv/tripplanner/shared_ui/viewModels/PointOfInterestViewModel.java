package com.esv.tripplanner.shared_ui.viewModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u001bJ\b\u0010\u001d\u001a\u00020\u001eH\u0007J\b\u0010\u001f\u001a\u00020\u001eH\u0007J\b\u0010 \u001a\u00020\u001eH\u0007J\b\u0010!\u001a\u00020\u001eH\u0007J\b\u0010\"\u001a\u00020\u001eH\u0007J\b\u0010#\u001a\u00020$H\u0007J\u0016\u0010%\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010&\u001a\u00020\u001bJ\u000e\u0010\'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\u001eJ\u000e\u0010)\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\u001eJ\u000e\u0010+\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u001eJ\u000e\u0010-\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020\u001eR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u00020\f8GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\f8GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000e\"\u0004\b\u0017\u0010\u0010R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lcom/esv/tripplanner/shared_ui/viewModels/PointOfInterestViewModel;", "Lcom/esv/tripplanner/core_api/helpers/AndroidObservableViewModel;", "app", "Landroid/app/Application;", "repository", "Lcom/esv/tripplanner/core_api/repositories/ITripRepository;", "navigator", "Lcom/esv/tripplanner/core_api/navigation/INavigationProvider;", "(Landroid/app/Application;Lcom/esv/tripplanner/core_api/repositories/ITripRepository;Lcom/esv/tripplanner/core_api/navigation/INavigationProvider;)V", "getNavigator", "()Lcom/esv/tripplanner/core_api/navigation/INavigationProvider;", "poi", "Lcom/esv/tripplanner/core_api/data/entities/PointOfInterest;", "getPoi", "()Lcom/esv/tripplanner/core_api/data/entities/PointOfInterest;", "setPoi", "(Lcom/esv/tripplanner/core_api/data/entities/PointOfInterest;)V", "getRepository", "()Lcom/esv/tripplanner/core_api/repositories/ITripRepository;", "setRepository", "(Lcom/esv/tripplanner/core_api/repositories/ITripRepository;)V", "selectedPoi", "getSelectedPoi", "setSelectedPoi", "typeCaster", "Lcom/esv/tripplanner/core_api/helpers/ITypeCaster;", "deletePoi", "", "editPoi", "getCloseHoursAsText", "", "getCoordinatesAsText", "getLatitudeAsText", "getLongitudeAsText", "getOpenHoursAsText", "getShowEditBlock", "", "initPointOfInterestViewModel", "savePoi", "setCloseHoursAsText", "closeHrsText", "setLatitudeAsText", "lat", "setLongitudeAsText", "lon", "setOpenHoursAsText", "openHrsText", "shared_ui_debug"})
public class PointOfInterestViewModel extends com.esv.tripplanner.core_api.helpers.AndroidObservableViewModel {
    private com.esv.tripplanner.core_api.helpers.ITypeCaster typeCaster;
    @org.jetbrains.annotations.NotNull()
    private com.esv.tripplanner.core_api.data.entities.PointOfInterest poi;
    @org.jetbrains.annotations.Nullable()
    private com.esv.tripplanner.core_api.data.entities.PointOfInterest selectedPoi;
    @org.jetbrains.annotations.NotNull()
    private com.esv.tripplanner.core_api.repositories.ITripRepository repository;
    @org.jetbrains.annotations.NotNull()
    private final com.esv.tripplanner.core_api.navigation.INavigationProvider navigator = null;
    
    @org.jetbrains.annotations.NotNull()
    @androidx.databinding.Bindable()
    public final com.esv.tripplanner.core_api.data.entities.PointOfInterest getPoi() {
        return null;
    }
    
    public final void setPoi(@org.jetbrains.annotations.NotNull()
    com.esv.tripplanner.core_api.data.entities.PointOfInterest p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final com.esv.tripplanner.core_api.data.entities.PointOfInterest getSelectedPoi() {
        return null;
    }
    
    public final void setSelectedPoi(@org.jetbrains.annotations.Nullable()
    com.esv.tripplanner.core_api.data.entities.PointOfInterest p0) {
    }
    
    public final void initPointOfInterestViewModel(@org.jetbrains.annotations.NotNull()
    com.esv.tripplanner.core_api.data.entities.PointOfInterest poi, @org.jetbrains.annotations.NotNull()
    com.esv.tripplanner.core_api.helpers.ITypeCaster typeCaster) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.databinding.Bindable()
    public final java.lang.String getOpenHoursAsText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.databinding.Bindable()
    public final java.lang.String getCloseHoursAsText() {
        return null;
    }
    
    public final void setCloseHoursAsText(@org.jetbrains.annotations.NotNull()
    java.lang.String closeHrsText) {
    }
    
    public final void setOpenHoursAsText(@org.jetbrains.annotations.NotNull()
    java.lang.String openHrsText) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.databinding.Bindable()
    public final java.lang.String getLatitudeAsText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.databinding.Bindable()
    public final java.lang.String getLongitudeAsText() {
        return null;
    }
    
    public final void setLatitudeAsText(@org.jetbrains.annotations.NotNull()
    java.lang.String lat) {
    }
    
    public final void setLongitudeAsText(@org.jetbrains.annotations.NotNull()
    java.lang.String lon) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.databinding.Bindable()
    public final java.lang.String getCoordinatesAsText() {
        return null;
    }
    
    public final void savePoi() {
    }
    
    public final void editPoi() {
    }
    
    public final void deletePoi() {
    }
    
    @androidx.databinding.Bindable()
    public final int getShowEditBlock() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.esv.tripplanner.core_api.repositories.ITripRepository getRepository() {
        return null;
    }
    
    protected final void setRepository(@org.jetbrains.annotations.NotNull()
    com.esv.tripplanner.core_api.repositories.ITripRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.esv.tripplanner.core_api.navigation.INavigationProvider getNavigator() {
        return null;
    }
    
    public PointOfInterestViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application app, @org.jetbrains.annotations.NotNull()
    com.esv.tripplanner.core_api.repositories.ITripRepository repository, @org.jetbrains.annotations.NotNull()
    com.esv.tripplanner.core_api.navigation.INavigationProvider navigator) {
        super(null);
    }
}