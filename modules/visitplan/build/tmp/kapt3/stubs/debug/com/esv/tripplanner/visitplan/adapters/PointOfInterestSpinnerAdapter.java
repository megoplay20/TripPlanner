package com.esv.tripplanner.visitplan.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\"\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\"\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\"\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0014\u0010\u001e\u001a\u00020\u001f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\bR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/esv/tripplanner/visitplan/adapters/PointOfInterestSpinnerAdapter;", "Landroid/widget/ArrayAdapter;", "Lcom/esv/tripplanner/core_api/data/entities/PointOfInterest;", "app", "Landroid/app/Application;", "layoutId", "", "pointOfInterestList", "", "typeCaster", "Lcom/esv/tripplanner/core_api/helpers/ITypeCaster;", "repository", "Lcom/esv/tripplanner/core_api/repositories/ITripRepository;", "navigator", "Lcom/esv/tripplanner/core_api/navigation/INavigationProvider;", "(Landroid/app/Application;ILjava/util/List;Lcom/esv/tripplanner/core_api/helpers/ITypeCaster;Lcom/esv/tripplanner/core_api/repositories/ITripRepository;Lcom/esv/tripplanner/core_api/navigation/INavigationProvider;)V", "getApp", "()Landroid/app/Application;", "getNavigator", "()Lcom/esv/tripplanner/core_api/navigation/INavigationProvider;", "getRepository", "()Lcom/esv/tripplanner/core_api/repositories/ITripRepository;", "getCustomView", "Landroid/view/View;", "position", "convertView", "parent", "Landroid/view/ViewGroup;", "getDropDownView", "getView", "setPoints", "", "visitplan_debug"})
public final class PointOfInterestSpinnerAdapter extends android.widget.ArrayAdapter<com.esv.tripplanner.core_api.data.entities.PointOfInterest> {
    @org.jetbrains.annotations.NotNull()
    private final android.app.Application app = null;
    private java.util.List<com.esv.tripplanner.core_api.data.entities.PointOfInterest> pointOfInterestList;
    private com.esv.tripplanner.core_api.helpers.ITypeCaster typeCaster;
    @org.jetbrains.annotations.NotNull()
    private final com.esv.tripplanner.core_api.repositories.ITripRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.esv.tripplanner.core_api.navigation.INavigationProvider navigator = null;
    
    public final void setPoints(@org.jetbrains.annotations.NotNull()
    java.util.List<com.esv.tripplanner.core_api.data.entities.PointOfInterest> pointOfInterestList) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View getView(int position, @org.jetbrains.annotations.Nullable()
    android.view.View convertView, @org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View getDropDownView(int position, @org.jetbrains.annotations.Nullable()
    android.view.View convertView, @org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    private final android.view.View getCustomView(int position, android.view.View convertView, android.view.ViewGroup parent) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Application getApp() {
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
    
    public PointOfInterestSpinnerAdapter(@org.jetbrains.annotations.NotNull()
    android.app.Application app, int layoutId, @org.jetbrains.annotations.NotNull()
    java.util.List<com.esv.tripplanner.core_api.data.entities.PointOfInterest> pointOfInterestList, @org.jetbrains.annotations.NotNull()
    com.esv.tripplanner.core_api.helpers.ITypeCaster typeCaster, @org.jetbrains.annotations.NotNull()
    com.esv.tripplanner.core_api.repositories.ITripRepository repository, @org.jetbrains.annotations.NotNull()
    com.esv.tripplanner.core_api.navigation.INavigationProvider navigator) {
        super(null, 0);
    }
}