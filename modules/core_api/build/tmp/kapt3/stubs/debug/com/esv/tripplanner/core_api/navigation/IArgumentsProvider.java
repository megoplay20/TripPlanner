package com.esv.tripplanner.core_api.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/esv/tripplanner/core_api/navigation/IArgumentsProvider;", "", "getTripIdFromAddVisitPlanArgs", "", "arguments", "Landroid/os/Bundle;", "getTripIdFromArgs", "core_api_debug"})
public abstract interface IArgumentsProvider {
    
    public abstract int getTripIdFromArgs(@org.jetbrains.annotations.Nullable()
    android.os.Bundle arguments);
    
    public abstract int getTripIdFromAddVisitPlanArgs(@org.jetbrains.annotations.Nullable()
    android.os.Bundle arguments);
}