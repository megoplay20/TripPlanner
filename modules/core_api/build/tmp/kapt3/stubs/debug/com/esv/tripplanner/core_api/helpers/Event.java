package com.esv.tripplanner.core_api.helpers;

import java.lang.System;

/**
 * Used as a wrapper for data that is exposed via a LiveData that represents an event.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0016\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0004J\r\u0010\t\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u000b\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\nR\u0010\u0010\u0003\u001a\u00028\u0000X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@BX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/esv/tripplanner/core_api/helpers/Event;", "T", "", "content", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "<set-?>", "", "hasBeenHandled", "getContentIfNotHandled", "()Ljava/lang/Object;", "peekContent", "core_api_debug"})
public class Event<T extends java.lang.Object> {
    private boolean hasBeenHandled = false;
    private final T content = null;
    
    /**
     * Returns the content and prevents its use again.
     */
    @org.jetbrains.annotations.Nullable()
    public final T getContentIfNotHandled() {
        return null;
    }
    
    /**
     * Returns the content, even if it's already been handled.
     */
    public final T peekContent() {
        return null;
    }
    
    public Event(T content) {
        super();
    }
}