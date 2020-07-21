package com.esv.tripplanner.startscreen.viewModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\nR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/esv/tripplanner/startscreen/viewModels/StartFragmentViewModel;", "Lcom/esv/tripplanner/core_api/helpers/AndroidObservableViewModel;", "app", "Landroid/app/Application;", "repository", "Lcom/esv/tripplanner/core_api/repositories/ITripRepository;", "navigator", "Lcom/esv/tripplanner/core_api/navigation/INavigationProvider;", "(Landroid/app/Application;Lcom/esv/tripplanner/core_api/repositories/ITripRepository;Lcom/esv/tripplanner/core_api/navigation/INavigationProvider;)V", "navigateToLoadExistingRoute", "", "navigateToStartNewRoute", "startscreen_debug"})
public final class StartFragmentViewModel extends com.esv.tripplanner.core_api.helpers.AndroidObservableViewModel {
    private final com.esv.tripplanner.core_api.repositories.ITripRepository repository = null;
    private final com.esv.tripplanner.core_api.navigation.INavigationProvider navigator = null;
    
    public final void navigateToStartNewRoute() {
    }
    
    public final void navigateToLoadExistingRoute() {
    }
    
    public StartFragmentViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application app, @org.jetbrains.annotations.NotNull()
    com.esv.tripplanner.core_api.repositories.ITripRepository repository, @org.jetbrains.annotations.Nullable()
    com.esv.tripplanner.core_api.navigation.INavigationProvider navigator) {
        super(null);
    }
}