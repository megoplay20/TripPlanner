package com.esv.tripplanner.startscreen.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/esv/tripplanner/startscreen/fragments/StartFragment;", "Lcom/esv/tripplanner/core_api/ui/InjectableFragment;", "()V", "navigationProvider", "Lcom/esv/tripplanner/core_api/navigation/INavigationProvider;", "getNavigationProvider", "()Lcom/esv/tripplanner/core_api/navigation/INavigationProvider;", "setNavigationProvider", "(Lcom/esv/tripplanner/core_api/navigation/INavigationProvider;)V", "repository", "Lcom/esv/tripplanner/core_api/repositories/ITripRepository;", "getRepository", "()Lcom/esv/tripplanner/core_api/repositories/ITripRepository;", "setRepository", "(Lcom/esv/tripplanner/core_api/repositories/ITripRepository;)V", "viewModel", "Lcom/esv/tripplanner/startscreen/viewModels/StartFragmentViewModel;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "performInjection", "", "startscreen_debug"})
public final class StartFragment extends com.esv.tripplanner.core_api.ui.InjectableFragment {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.esv.tripplanner.core_api.repositories.ITripRepository repository;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.esv.tripplanner.core_api.navigation.INavigationProvider navigationProvider;
    private com.esv.tripplanner.startscreen.viewModels.StartFragmentViewModel viewModel;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.esv.tripplanner.core_api.repositories.ITripRepository getRepository() {
        return null;
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull()
    com.esv.tripplanner.core_api.repositories.ITripRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.esv.tripplanner.core_api.navigation.INavigationProvider getNavigationProvider() {
        return null;
    }
    
    public final void setNavigationProvider(@org.jetbrains.annotations.NotNull()
    com.esv.tripplanner.core_api.navigation.INavigationProvider p0) {
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
    public void performInjection() {
    }
    
    public StartFragment() {
        super();
    }
}