package com.esv.tripplanner.startscreen.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/esv/tripplanner/startscreen/di/StartComponent;", "", "inject", "", "fragment", "Lcom/esv/tripplanner/startscreen/fragments/StartFragment;", "Companion", "startscreen_debug"})
@dagger.Component(dependencies = {com.esv.tripplanner.core_api.di.ProvidersFacade.class})
@javax.inject.Singleton()
public abstract interface StartComponent {
    public static final com.esv.tripplanner.startscreen.di.StartComponent.Companion Companion = null;
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.esv.tripplanner.startscreen.fragments.StartFragment fragment);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/esv/tripplanner/startscreen/di/StartComponent$Companion;", "", "()V", "createComponent", "Lcom/esv/tripplanner/startscreen/di/StartComponent;", "providersFacade", "Lcom/esv/tripplanner/core_api/di/ProvidersFacade;", "startscreen_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.esv.tripplanner.startscreen.di.StartComponent createComponent(@org.jetbrains.annotations.NotNull()
        com.esv.tripplanner.core_api.di.ProvidersFacade providersFacade) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}