package com.esv.tripplanner.core_api.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H&\u00a2\u0006\u0002\u0010\u0005J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H&J\u0019\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H&\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H&\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H&\u00a2\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H&\u00a8\u0006\u0013"}, d2 = {"Lcom/esv/tripplanner/core_api/helpers/ITypeCaster;", "", "GetBoolean", "", "o", "(Ljava/lang/Object;)Ljava/lang/Boolean;", "GetDate", "Ljava/util/Date;", "GetDouble", "", "(Ljava/lang/Object;)Ljava/lang/Double;", "GetInteger", "", "(Ljava/lang/Object;)Ljava/lang/Integer;", "GetLong", "", "(Ljava/lang/Object;)Ljava/lang/Long;", "GetString", "", "core_api_debug"})
public abstract interface ITypeCaster {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String GetString(@org.jetbrains.annotations.Nullable()
    java.lang.Object o);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Boolean GetBoolean(@org.jetbrains.annotations.Nullable()
    java.lang.Object o);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Integer GetInteger(@org.jetbrains.annotations.Nullable()
    java.lang.Object o);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Double GetDouble(@org.jetbrains.annotations.Nullable()
    java.lang.Object o);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Long GetLong(@org.jetbrains.annotations.Nullable()
    java.lang.Object o);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.util.Date GetDate(@org.jetbrains.annotations.Nullable()
    java.lang.Object o);
}