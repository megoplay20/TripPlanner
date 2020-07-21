package com.esv.tripplanner.core_api.data.database_converters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0007\u00a8\u0006\t"}, d2 = {"Lcom/esv/tripplanner/core_api/data/database_converters/DbLocalTimeConverter;", "", "()V", "convertDateToString", "", "date", "Lcom/esv/tripplanner/core_api/helpers/TimeHolder;", "convertLongToDate", "timeString", "core_api_debug"})
public final class DbLocalTimeConverter {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.lang.String convertDateToString(@org.jetbrains.annotations.Nullable()
    com.esv.tripplanner.core_api.helpers.TimeHolder date) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final com.esv.tripplanner.core_api.helpers.TimeHolder convertLongToDate(@org.jetbrains.annotations.Nullable()
    java.lang.String timeString) {
        return null;
    }
    
    public DbLocalTimeConverter() {
        super();
    }
}