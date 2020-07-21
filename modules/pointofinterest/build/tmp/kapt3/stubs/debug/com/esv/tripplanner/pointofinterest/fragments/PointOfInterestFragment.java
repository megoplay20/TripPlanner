package com.esv.tripplanner.pointofinterest.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001e\u001a\u00020\u001fH\u0016J&\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\b\u0010(\u001a\u00020\u001fH\u0016J\b\u0010)\u001a\u00020\u001fH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/esv/tripplanner/pointofinterest/fragments/PointOfInterestFragment;", "Lcom/esv/tripplanner/core_api/ui/InjectableFragment;", "Lcom/esv/tripplanner/core_api/ui/IBackPressAwareFragment;", "()V", "emptyPoi", "Lcom/esv/tripplanner/core_api/data/entities/PointOfInterest;", "getEmptyPoi", "()Lcom/esv/tripplanner/core_api/data/entities/PointOfInterest;", "setEmptyPoi", "(Lcom/esv/tripplanner/core_api/data/entities/PointOfInterest;)V", "navComponent", "Lcom/esv/tripplanner/core_api/navigation/INavigatorComponentsProvider;", "getNavComponent", "()Lcom/esv/tripplanner/core_api/navigation/INavigatorComponentsProvider;", "setNavComponent", "(Lcom/esv/tripplanner/core_api/navigation/INavigatorComponentsProvider;)V", "repository", "Lcom/esv/tripplanner/core_api/repositories/ITripRepository;", "getRepository", "()Lcom/esv/tripplanner/core_api/repositories/ITripRepository;", "setRepository", "(Lcom/esv/tripplanner/core_api/repositories/ITripRepository;)V", "typeCaster", "Lcom/esv/tripplanner/core_api/helpers/ITypeCaster;", "getTypeCaster", "()Lcom/esv/tripplanner/core_api/helpers/ITypeCaster;", "setTypeCaster", "(Lcom/esv/tripplanner/core_api/helpers/ITypeCaster;)V", "viewModel", "Lcom/esv/tripplanner/shared_ui/viewModels/PointOfInterestViewModel;", "onBackPressedTriggered", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onSupportNavigateUpTriggered", "performInjection", "pointofinterest_debug"})
public final class PointOfInterestFragment extends com.esv.tripplanner.core_api.ui.InjectableFragment implements com.esv.tripplanner.core_api.ui.IBackPressAwareFragment {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.esv.tripplanner.core_api.helpers.ITypeCaster typeCaster;
    @org.jetbrains.annotations.NotNull()
    @com.esv.tripplanner.core_api.di.EmptyPoi()
    @javax.inject.Inject()
    public com.esv.tripplanner.core_api.data.entities.PointOfInterest emptyPoi;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.esv.tripplanner.core_api.repositories.ITripRepository repository;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.esv.tripplanner.core_api.navigation.INavigatorComponentsProvider navComponent;
    private com.esv.tripplanner.shared_ui.viewModels.PointOfInterestViewModel viewModel;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.esv.tripplanner.core_api.helpers.ITypeCaster getTypeCaster() {
        return null;
    }
    
    public final void setTypeCaster(@org.jetbrains.annotations.NotNull()
    com.esv.tripplanner.core_api.helpers.ITypeCaster p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.esv.tripplanner.core_api.data.entities.PointOfInterest getEmptyPoi() {
        return null;
    }
    
    public final void setEmptyPoi(@org.jetbrains.annotations.NotNull()
    com.esv.tripplanner.core_api.data.entities.PointOfInterest p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.esv.tripplanner.core_api.repositories.ITripRepository getRepository() {
        return null;
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull()
    com.esv.tripplanner.core_api.repositories.ITripRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.esv.tripplanner.core_api.navigation.INavigatorComponentsProvider getNavComponent() {
        return null;
    }
    
    public final void setNavComponent(@org.jetbrains.annotations.NotNull()
    com.esv.tripplanner.core_api.navigation.INavigatorComponentsProvider p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onSupportNavigateUpTriggered() {
    }
    
    @java.lang.Override()
    public void onBackPressedTriggered() {
    }
    
    @java.lang.Override()
    public void performInjection() {
    }
    
    public PointOfInterestFragment() {
        super();
    }
}