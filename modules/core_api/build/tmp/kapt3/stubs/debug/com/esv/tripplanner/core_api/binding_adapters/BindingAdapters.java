package com.esv.tripplanner.core_api.binding_adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/esv/tripplanner/core_api/binding_adapters/BindingAdapters;", "", "()V", "Companion", "core_api_debug"})
public final class BindingAdapters {
    public static final com.esv.tripplanner.core_api.binding_adapters.BindingAdapters.Companion Companion = null;
    
    public BindingAdapters() {
        super();
    }
    
    @androidx.databinding.BindingAdapter(requireAll = false, value = {"selectedSpinnerItem", "selectedSpinnerItemAttrChanged"})
    public static final void setSelectedSpinnerItem(@org.jetbrains.annotations.NotNull()
    android.widget.Spinner spinner, @org.jetbrains.annotations.Nullable()
    java.lang.Object selectedSpinnerItem, @org.jetbrains.annotations.Nullable()
    androidx.databinding.InverseBindingListener changeListener) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.InverseBindingAdapter(attribute = "selectedSpinnerItem", event = "selectedSpinnerItemAttrChanged")
    public static final java.lang.Object getSelectedSpinnerItem(@org.jetbrains.annotations.NotNull()
    android.widget.Spinner spinner) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0007J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0002J$\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/esv/tripplanner/core_api/binding_adapters/BindingAdapters$Companion;", "", "()V", "getSelectedSpinnerItem", "spinner", "Landroid/widget/Spinner;", "getSpinnerItemIndex", "", "spinnerItem", "setSelectedSpinnerItem", "", "selectedSpinnerItem", "changeListener", "Landroidx/databinding/InverseBindingListener;", "core_api_debug"})
    public static final class Companion {
        
        @androidx.databinding.BindingAdapter(requireAll = false, value = {"selectedSpinnerItem", "selectedSpinnerItemAttrChanged"})
        public final void setSelectedSpinnerItem(@org.jetbrains.annotations.NotNull()
        android.widget.Spinner spinner, @org.jetbrains.annotations.Nullable()
        java.lang.Object selectedSpinnerItem, @org.jetbrains.annotations.Nullable()
        androidx.databinding.InverseBindingListener changeListener) {
        }
        
        private final int getSpinnerItemIndex(android.widget.Spinner spinner, java.lang.Object spinnerItem) {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        @androidx.databinding.InverseBindingAdapter(attribute = "selectedSpinnerItem", event = "selectedSpinnerItemAttrChanged")
        public final java.lang.Object getSelectedSpinnerItem(@org.jetbrains.annotations.NotNull()
        android.widget.Spinner spinner) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}