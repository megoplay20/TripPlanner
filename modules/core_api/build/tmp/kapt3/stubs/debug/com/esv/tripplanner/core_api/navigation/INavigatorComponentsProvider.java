package com.esv.tripplanner.core_api.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0000H&\u00a8\u0006\u0007"}, d2 = {"Lcom/esv/tripplanner/core_api/navigation/INavigatorComponentsProvider;", "", "provideArguments", "Lcom/esv/tripplanner/core_api/navigation/IArgumentsProvider;", "provideNavigator", "Lcom/esv/tripplanner/core_api/navigation/INavigationProvider;", "provideNavigatorComponents", "core_api_debug"})
public abstract interface INavigatorComponentsProvider {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.esv.tripplanner.core_api.navigation.INavigationProvider provideNavigator();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.esv.tripplanner.core_api.navigation.IArgumentsProvider provideArguments();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.esv.tripplanner.core_api.navigation.INavigatorComponentsProvider provideNavigatorComponents();
}