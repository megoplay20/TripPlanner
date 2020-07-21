package com.otus.advancedviews

import android.content.Context
import android.util.AttributeSet
import android.view.ViewGroup
import com.esv.tripplanner.shared_ui.R

class QuadrantLayout (context: Context, attributeSet: AttributeSet) : ViewGroup(context, attributeSet){

    private var defaultWidthAndHeight = 200
    private var widthPerChild = 0
    private var heightPerChild = 0

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val widthMode = MeasureSpec.getMode(widthMeasureSpec)
        val heightMode = MeasureSpec.getMode(widthMeasureSpec)
        val heightSize = MeasureSpec.getSize(heightMeasureSpec)
        val widthSize = MeasureSpec.getSize(widthMeasureSpec)

        if(widthMode == MeasureSpec.UNSPECIFIED || widthSize == 0){
            setMeasuredDimension(defaultWidthAndHeight, heightSize)
        }
        else if(heightMode == MeasureSpec.UNSPECIFIED || heightSize == 0){
            setMeasuredDimension(widthSize, defaultWidthAndHeight)
        } else{
            super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        }

        if (childCount == 0) return

        widthPerChild = (measuredWidth.toFloat()/2f).toInt()
        heightPerChild = (measuredHeight.toFloat()/2f).toInt()

        for(childId in (0 until childCount)){
            val child = getChildAt(childId)
            measureChild(child,MeasureSpec.makeMeasureSpec(widthPerChild, MeasureSpec.EXACTLY), MeasureSpec.makeMeasureSpec(heightPerChild, MeasureSpec.EXACTLY))
        }
    }

    override fun onLayout(p0: Boolean, p1: Int, p2: Int, p3: Int, p4: Int) {
        if (childCount == 0) return
        for(childId in (0 until childCount)){
            val child = getChildAt(childId)
            val lp = child.layoutParams as QuadrantLayoutLayoutParams

            var positionLeft: Int
            var positionTop: Int
            var positionRight: Int
            var positionBottom: Int

            when(lp.viewPosition){
                QuadrantLayoutLayoutParams.ViewPosition.TOP_LEFT -> {
                    positionLeft = 0
                    positionTop = 0
                    positionRight = widthPerChild
                    positionBottom = heightPerChild
                }
                QuadrantLayoutLayoutParams.ViewPosition.TOP_RIGHT -> {
                    positionLeft = widthPerChild
                    positionTop = 0
                    positionRight = 2*widthPerChild
                    positionBottom = heightPerChild
                }
                QuadrantLayoutLayoutParams.ViewPosition.BOTTOM_LEFT -> {
                    positionLeft = 0
                    positionTop = heightPerChild
                    positionRight = widthPerChild
                    positionBottom = 2*heightPerChild
                }
                QuadrantLayoutLayoutParams.ViewPosition.BOTTOM_RIGHT -> {
                    positionLeft = widthPerChild
                    positionTop = heightPerChild
                    positionRight = 2* widthPerChild
                    positionBottom = 2*heightPerChild
                }
            }

            child.layout(positionLeft, positionTop, positionRight, positionBottom)
        }
    }

    override fun checkLayoutParams(p: LayoutParams?): Boolean {
        return p is QuadrantLayoutLayoutParams
    }

    override fun generateLayoutParams(attrs: AttributeSet): LayoutParams {
        return QuadrantLayoutLayoutParams(context, attrs)
    }

    override fun generateLayoutParams(p: LayoutParams): LayoutParams {
        return QuadrantLayoutLayoutParams(p)
    }

    class QuadrantLayoutLayoutParams : MarginLayoutParams {

        enum class ViewPosition(val value:Int){
                TOP_LEFT(0),
            TOP_RIGHT(1),
            BOTTOM_LEFT(2),
            BOTTOM_RIGHT(3);

            companion object {
                fun fromInt(value: Int) = values().first { it.value == value }
            }
        }

        constructor(context: Context, attributeSet: AttributeSet) : super(context, attributeSet) {
            readStyleParams(context, attributeSet)
        }

        constructor(layoutParams: ViewGroup.LayoutParams) : super(layoutParams)
        constructor(width: Int, height: Int) : super(width, height)

        var viewPosition: ViewPosition = ViewPosition.TOP_LEFT

        private fun readStyleParams(context: Context, attributeSet: AttributeSet) {
            val typedArray = context.obtainStyledAttributes(attributeSet, R.styleable.QuadrantLayout_Layout)
            try {
                viewPosition = ViewPosition.fromInt(typedArray.getInt(R.styleable.QuadrantLayout_Layout_layout_viewPosition, 0))
            } finally {
                typedArray.recycle()
            }
        }
    }


}