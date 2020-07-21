package com.esv.tripplanner.newroute.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\u001a\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\"2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010,\u001a\u00020*H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020 X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/esv/tripplanner/newroute/fragments/NewRouteFragment;", "Lcom/esv/tripplanner/core_api/ui/InjectableFragment;", "()V", "binding", "Lcom/esv/tripplanner/newroute/databinding/NewRouteFragmentBinding;", "dateProcessor", "Lcom/esv/tripplanner/core_api/helpers/IDateProcessor;", "getDateProcessor", "()Lcom/esv/tripplanner/core_api/helpers/IDateProcessor;", "setDateProcessor", "(Lcom/esv/tripplanner/core_api/helpers/IDateProcessor;)V", "navComponent", "Lcom/esv/tripplanner/core_api/navigation/INavigatorComponentsProvider;", "getNavComponent", "()Lcom/esv/tripplanner/core_api/navigation/INavigatorComponentsProvider;", "setNavComponent", "(Lcom/esv/tripplanner/core_api/navigation/INavigatorComponentsProvider;)V", "repository", "Lcom/esv/tripplanner/core_api/repositories/ITripRepository;", "getRepository", "()Lcom/esv/tripplanner/core_api/repositories/ITripRepository;", "setRepository", "(Lcom/esv/tripplanner/core_api/repositories/ITripRepository;)V", "tripId", "", "typeCaster", "Lcom/esv/tripplanner/core_api/helpers/ITypeCaster;", "getTypeCaster", "()Lcom/esv/tripplanner/core_api/helpers/ITypeCaster;", "setTypeCaster", "(Lcom/esv/tripplanner/core_api/helpers/ITypeCaster;)V", "viewModel", "Lcom/esv/tripplanner/newroute/viewModels/NewRouteViewModel;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "performInjection", "newroute_debug"})
public final class NewRouteFragment extends com.esv.tripplanner.core_api.ui.InjectableFragment {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.esv.tripplanner.core_api.helpers.ITypeCaster typeCaster;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.esv.tripplanner.core_api.helpers.IDateProcessor dateProcessor;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.esv.tripplanner.core_api.repositories.ITripRepository repository;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.esv.tripplanner.core_api.navigation.INavigatorComponentsProvider navComponent;
    private com.esv.tripplanner.newroute.viewModels.NewRouteViewModel viewModel;
    private com.esv.tripplanner.newroute.databinding.NewRouteFragmentBinding binding;
    private int tripId = -1;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.esv.tripplanner.core_api.helpers.ITypeCaster getTypeCaster() {
        return null;
    }
    
    public final void setTypeCaster(@org.jetbrains.annotations.NotNull()
    com.esv.tripplanner.core_api.helpers.ITypeCaster p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.esv.tripplanner.core_api.helpers.IDateProcessor getDateProcessor() {
        return null;
    }
    
    public final void setDateProcessor(@org.jetbrains.annotations.NotNull()
    com.esv.tripplanner.core_api.helpers.IDateProcessor p0) {
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
    
    public NewRouteFragment() {
        super();
    }
}