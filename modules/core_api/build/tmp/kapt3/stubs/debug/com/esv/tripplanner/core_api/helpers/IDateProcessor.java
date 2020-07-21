package com.esv.tripplanner.core_api.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6\u0004J\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u00a6\u0004\u00a8\u0006\u0007"}, d2 = {"Lcom/esv/tripplanner/core_api/helpers/IDateProcessor;", "", "formatDate", "", "d", "Ljava/util/Date;", "parseDate", "core_api_debug"})
public abstract interface IDateProcessor {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String formatDate(@org.jetbrains.annotations.NotNull()
    java.util.Date d);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.util.Date parseDate(@org.jetbrains.annotations.NotNull()
    java.lang.String d);
}