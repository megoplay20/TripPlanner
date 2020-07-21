package com.esv.tripplanner.core_api.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0006\u0010\n\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/esv/tripplanner/core_api/helpers/ObservableViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/databinding/Observable;", "()V", "callbacks", "Landroidx/databinding/PropertyChangeRegistry;", "addOnPropertyChangedCallback", "", "callback", "Landroidx/databinding/Observable$OnPropertyChangedCallback;", "notifyChange", "notifyPropertyChanged", "fieldId", "", "removeOnPropertyChangedCallback", "core_api_debug"})
public class ObservableViewModel extends androidx.lifecycle.ViewModel implements androidx.databinding.Observable {
    private final androidx.databinding.PropertyChangeRegistry callbacks = null;
    
    @java.lang.Override()
    public void addOnPropertyChangedCallback(@org.jetbrains.annotations.NotNull()
    androidx.databinding.Observable.OnPropertyChangedCallback callback) {
    }
    
    @java.lang.Override()
    public void removeOnPropertyChangedCallback(@org.jetbrains.annotations.NotNull()
    androidx.databinding.Observable.OnPropertyChangedCallback callback) {
    }
    
    /**
     * Notifies observers that all properties of this instance have changed.
     */
    public final void notifyChange() {
    }
    
    /**
     * Notifies observers that a specific property has changed. The getter for the
     * property that changes should be marked with the @Bindable annotation to
     * generate a field in the BR class to be used as the fieldId parameter.
     *
     * @param fieldId The generated BR id for the Bindable field.
     */
    public final void notifyPropertyChanged(int fieldId) {
    }
    
    public ObservableViewModel() {
        super();
    }
}