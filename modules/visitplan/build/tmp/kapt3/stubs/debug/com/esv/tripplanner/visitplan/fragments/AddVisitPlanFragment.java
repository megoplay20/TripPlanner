package com.esv.tripplanner.visitplan.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u001a\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010&\u001a\u00020$H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/esv/tripplanner/visitplan/fragments/AddVisitPlanFragment;", "Lcom/esv/tripplanner/core_api/ui/InjectableFragment;", "()V", "binding", "Lcom/esv/tripplanner/visitplan/databinding/AddOrEditPointOfInterestVisitPlansBinding;", "navComponent", "Lcom/esv/tripplanner/core_api/navigation/INavigatorComponentsProvider;", "getNavComponent", "()Lcom/esv/tripplanner/core_api/navigation/INavigatorComponentsProvider;", "setNavComponent", "(Lcom/esv/tripplanner/core_api/navigation/INavigatorComponentsProvider;)V", "repository", "Lcom/esv/tripplanner/core_api/repositories/ITripRepository;", "getRepository", "()Lcom/esv/tripplanner/core_api/repositories/ITripRepository;", "setRepository", "(Lcom/esv/tripplanner/core_api/repositories/ITripRepository;)V", "tripId", "", "typeCaster", "Lcom/esv/tripplanner/core_api/helpers/ITypeCaster;", "getTypeCaster", "()Lcom/esv/tripplanner/core_api/helpers/ITypeCaster;", "setTypeCaster", "(Lcom/esv/tripplanner/core_api/helpers/ITypeCaster;)V", "viewModel", "Lcom/esv/tripplanner/shared_ui/viewModels/PointOfInterestVisitPlansViewModel;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "performInjection", "visitplan_debug"})
public final class AddVisitPlanFragment extends com.esv.tripplanner.core_api.ui.InjectableFragment {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.esv.tripplanner.core_api.helpers.ITypeCaster typeCaster;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.esv.tripplanner.core_api.repositories.ITripRepository repository;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.esv.tripplanner.core_api.navigation.INavigatorComponentsProvider navComponent;
    private com.esv.tripplanner.shared_ui.viewModels.PointOfInterestVisitPlansViewModel viewModel;
    private int tripId = -1;
    private com.esv.tripplanner.visitplan.databinding.AddOrEditPointOfInterestVisitPlansBinding binding;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.esv.tripplanner.core_api.helpers.ITypeCaster getTypeCaster() {
        return null;
    }
    
    public final void setTypeCaster(@org.jetbrains.annotations.NotNull()
    com.esv.tripplanner.core_api.helpers.ITypeCaster p0) {
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
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void performInjection() {
    }
    
    public AddVisitPlanFragment() {
        super();
    }
}