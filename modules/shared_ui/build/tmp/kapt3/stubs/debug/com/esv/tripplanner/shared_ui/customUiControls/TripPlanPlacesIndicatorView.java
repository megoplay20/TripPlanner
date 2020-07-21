package com.esv.tripplanner.shared_ui.customUiControls;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 (2\u00020\u0001:\u0001(B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u001eH\u0002J\b\u0010 \u001a\u00020\u000fH\u0002J\u0012\u0010!\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0014J\u0018\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020\rH\u0014J\u000e\u0010\'\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\rJ\u0016\u0010\'\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000fX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000fX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/esv/tripplanner/shared_ui/customUiControls/TripPlanPlacesIndicatorView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "bounds", "Landroid/graphics/Rect;", "fillItems", "", "fitElements", "itemColor", "", "itemPadding", "", "itemPaint", "Landroid/graphics/Paint;", "itemStrokeWidth", "noPlacesText", "", "paddingRadiusFraction", "placesCount", "", "singleItemRadius", "strokeRadiusFraction", "textBackground", "textBackgroundColor", "textPaint", "adjustFontSizeToFitControlSize", "", "findOptimalRadiusAndPadding", "getItemSize", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setVisitPlacesCount", "Companion", "shared_ui_debug"})
public final class TripPlanPlacesIndicatorView extends android.view.View {
    private boolean fillItems = false;
    private int itemColor;
    private int textBackgroundColor;
    private boolean fitElements = false;
    private final android.graphics.Rect bounds = null;
    private float singleItemRadius = 5.0F;
    private float itemPadding = 15.0F;
    private float itemStrokeWidth = 10.0F;
    private final float paddingRadiusFraction = 0.5F;
    private final float strokeRadiusFraction = 0.5F;
    private java.lang.Number placesCount = 0;
    private java.lang.String noPlacesText = "\u041d\u0435\u0442 \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u043e\u0432";
    private final android.graphics.Paint textPaint = null;
    private final android.graphics.Paint textBackground = null;
    private final android.graphics.Paint itemPaint = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "TripPlanPlacesView";
    public static final com.esv.tripplanner.shared_ui.customUiControls.TripPlanPlacesIndicatorView.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    }
    
    private final float getItemSize() {
        return 0.0F;
    }
    
    private final void findOptimalRadiusAndPadding() {
    }
    
    @java.lang.Override()
    protected void onDraw(@org.jetbrains.annotations.Nullable()
    android.graphics.Canvas canvas) {
    }
    
    private final void adjustFontSizeToFitControlSize() {
    }
    
    public final void setVisitPlacesCount(int placesCount) {
    }
    
    public final void setVisitPlacesCount(int placesCount, @org.jetbrains.annotations.NotNull()
    java.lang.String noPlacesText) {
    }
    
    public TripPlanPlacesIndicatorView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attributeSet) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/esv/tripplanner/shared_ui/customUiControls/TripPlanPlacesIndicatorView$Companion;", "", "()V", "TAG", "", "shared_ui_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}