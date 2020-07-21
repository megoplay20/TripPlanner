package com.esv.tripplanner.shared_ui.customUiControls;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u001bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0014J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\bH\u0014J\u0018\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\bH\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/esv/tripplanner/shared_ui/customUiControls/QuadrantLayout;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defaultWidthAndHeight", "", "heightPerChild", "widthPerChild", "checkLayoutParams", "", "p", "Landroid/view/ViewGroup$LayoutParams;", "generateLayoutParams", "attrs", "onLayout", "", "p0", "p1", "p2", "p3", "p4", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "QuadrantLayoutLayoutParams", "shared_ui_debug"})
public final class QuadrantLayout extends android.view.ViewGroup {
    private int defaultWidthAndHeight = 200;
    private int widthPerChild = 0;
    private int heightPerChild = 0;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    }
    
    @java.lang.Override()
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {
    }
    
    @java.lang.Override()
    protected boolean checkLayoutParams(@org.jetbrains.annotations.Nullable()
    android.view.ViewGroup.LayoutParams p) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.ViewGroup.LayoutParams generateLayoutParams(@org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup.LayoutParams p) {
        return null;
    }
    
    public QuadrantLayout(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attributeSet) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0016B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tB\u0017\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\rJ\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0017"}, d2 = {"Lcom/esv/tripplanner/shared_ui/customUiControls/QuadrantLayout$QuadrantLayoutLayoutParams;", "Landroid/view/ViewGroup$MarginLayoutParams;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "layoutParams", "Landroid/view/ViewGroup$LayoutParams;", "(Landroid/view/ViewGroup$LayoutParams;)V", "width", "", "height", "(II)V", "viewPosition", "Lcom/esv/tripplanner/shared_ui/customUiControls/QuadrantLayout$QuadrantLayoutLayoutParams$ViewPosition;", "getViewPosition", "()Lcom/esv/tripplanner/shared_ui/customUiControls/QuadrantLayout$QuadrantLayoutLayoutParams$ViewPosition;", "setViewPosition", "(Lcom/esv/tripplanner/shared_ui/customUiControls/QuadrantLayout$QuadrantLayoutLayoutParams$ViewPosition;)V", "readStyleParams", "", "ViewPosition", "shared_ui_debug"})
    public static final class QuadrantLayoutLayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        @org.jetbrains.annotations.NotNull()
        private com.esv.tripplanner.shared_ui.customUiControls.QuadrantLayout.QuadrantLayoutLayoutParams.ViewPosition viewPosition = com.esv.tripplanner.shared_ui.customUiControls.QuadrantLayout.QuadrantLayoutLayoutParams.ViewPosition.TOP_LEFT;
        
        @org.jetbrains.annotations.NotNull()
        public final com.esv.tripplanner.shared_ui.customUiControls.QuadrantLayout.QuadrantLayoutLayoutParams.ViewPosition getViewPosition() {
            return null;
        }
        
        public final void setViewPosition(@org.jetbrains.annotations.NotNull()
        com.esv.tripplanner.shared_ui.customUiControls.QuadrantLayout.QuadrantLayoutLayoutParams.ViewPosition p0) {
        }
        
        private final void readStyleParams(android.content.Context context, android.util.AttributeSet attributeSet) {
        }
        
        public QuadrantLayoutLayoutParams(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.util.AttributeSet attributeSet) {
            super(null, null);
        }
        
        public QuadrantLayoutLayoutParams(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup.LayoutParams layoutParams) {
            super(null, null);
        }
        
        public QuadrantLayoutLayoutParams(int width, int height) {
            super(null, null);
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\f"}, d2 = {"Lcom/esv/tripplanner/shared_ui/customUiControls/QuadrantLayout$QuadrantLayoutLayoutParams$ViewPosition;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "TOP_LEFT", "TOP_RIGHT", "BOTTOM_LEFT", "BOTTOM_RIGHT", "Companion", "shared_ui_debug"})
        public static enum ViewPosition {
            /*public static final*/ TOP_LEFT /* = new TOP_LEFT(0) */,
            /*public static final*/ TOP_RIGHT /* = new TOP_RIGHT(0) */,
            /*public static final*/ BOTTOM_LEFT /* = new BOTTOM_LEFT(0) */,
            /*public static final*/ BOTTOM_RIGHT /* = new BOTTOM_RIGHT(0) */;
            private final int value = 0;
            public static final com.esv.tripplanner.shared_ui.customUiControls.QuadrantLayout.QuadrantLayoutLayoutParams.ViewPosition.Companion Companion = null;
            
            public final int getValue() {
                return 0;
            }
            
            ViewPosition(int value) {
            }
            
            @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/esv/tripplanner/shared_ui/customUiControls/QuadrantLayout$QuadrantLayoutLayoutParams$ViewPosition$Companion;", "", "()V", "fromInt", "Lcom/esv/tripplanner/shared_ui/customUiControls/QuadrantLayout$QuadrantLayoutLayoutParams$ViewPosition;", "value", "", "shared_ui_debug"})
            public static final class Companion {
                
                @org.jetbrains.annotations.NotNull()
                public final com.esv.tripplanner.shared_ui.customUiControls.QuadrantLayout.QuadrantLayoutLayoutParams.ViewPosition fromInt(int value) {
                    return null;
                }
                
                private Companion() {
                    super();
                }
            }
        }
    }
}