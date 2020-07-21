package com.esv.tripplanner.core_api.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0003H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000f\u001a\u00020\u0003H&\u00a8\u0006\u0010"}, d2 = {"Lcom/esv/tripplanner/core_api/navigation/INavigationProvider;", "", "bind", "", "navController", "Landroidx/navigation/NavController;", "goBack", "safeNavigate", "direction", "Landroidx/navigation/NavDirections;", "startAddPoiActionFromVisitPlan", "startAddVisitPlanAction", "tripId", "", "startNewRouteAction", "unbind", "core_api_debug"})
public abstract interface INavigationProvider {
    
    public abstract void startNewRouteAction(int tripId);
    
    public abstract void startAddVisitPlanAction(int tripId);
    
    public abstract void startAddPoiActionFromVisitPlan();
    
    public abstract void bind(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController navController);
    
    public abstract void unbind();
    
    public abstract void safeNavigate(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavDirections direction);
    
    public abstract void goBack();
}