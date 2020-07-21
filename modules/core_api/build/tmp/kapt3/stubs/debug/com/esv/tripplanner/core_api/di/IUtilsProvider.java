package com.esv.tripplanner.core_api.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H\'\u00a8\u0006\b"}, d2 = {"Lcom/esv/tripplanner/core_api/di/IUtilsProvider;", "", "getDateProcessor", "Lcom/esv/tripplanner/core_api/helpers/IDateProcessor;", "getTypeCaster", "Lcom/esv/tripplanner/core_api/helpers/ITypeCaster;", "provideEmptyPoi", "Lcom/esv/tripplanner/core_api/data/entities/PointOfInterest;", "core_api_debug"})
public abstract interface IUtilsProvider {
    
    @org.jetbrains.annotations.NotNull()
    @EmptyPoi()
    public abstract com.esv.tripplanner.core_api.data.entities.PointOfInterest provideEmptyPoi();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.esv.tripplanner.core_api.helpers.IDateProcessor getDateProcessor();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.esv.tripplanner.core_api.helpers.ITypeCaster getTypeCaster();
}