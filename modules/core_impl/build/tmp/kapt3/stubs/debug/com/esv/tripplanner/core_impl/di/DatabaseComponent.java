package com.esv.tripplanner.core_impl.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/esv/tripplanner/core_impl/di/DatabaseComponent;", "Lcom/esv/tripplanner/core_api/di/IDatabaseProvider;", "Companion", "core_impl_debug"})
@dagger.Component(dependencies = {com.esv.tripplanner.core_api.di.IAppProvider.class}, modules = {com.esv.tripplanner.core_impl.di.DataModule.class})
@javax.inject.Singleton()
public abstract interface DatabaseComponent extends com.esv.tripplanner.core_api.di.IDatabaseProvider {
    public static final com.esv.tripplanner.core_impl.di.DatabaseComponent.Companion Companion = null;
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/esv/tripplanner/core_impl/di/DatabaseComponent$Companion;", "", "()V", "createComponent", "Lcom/esv/tripplanner/core_impl/di/DatabaseComponent;", "app", "Lcom/esv/tripplanner/core_api/di/IAppProvider;", "core_impl_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.esv.tripplanner.core_impl.di.DatabaseComponent createComponent(@org.jetbrains.annotations.NotNull()
        com.esv.tripplanner.core_api.di.IAppProvider app) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}