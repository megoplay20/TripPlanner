package com.otus.advancedviews

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.util.Log
import android.view.View
import com.esv.tripplanner.shared_ui.R
import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.sqrt

class TripPlanPlacesIndicatorView(context: Context, attributeSet: AttributeSet) :
    View(context, attributeSet) {

    companion object {
        const val TAG = "TripPlanPlacesView"
    }

    private var fillItems: Boolean = false
    private var itemColor: Int
    private var textBackgroundColor: Int
    private var fitElements: Boolean = false
    private val bounds = Rect()
    private var singleItemRadius = 5f
    private var itemPadding = 15f
    private var itemStrokeWidth = 10f
    private val paddingRadiusFraction = 0.5f
    private val strokeRadiusFraction = 0.5f

    init {
        val typedArray =
            context.obtainStyledAttributes(attributeSet, R.styleable.TripPlanPlacesIndicatorView)
        try {
            fitElements =
                typedArray.getBoolean(R.styleable.TripPlanPlacesIndicatorView_fitElements, false)
            itemStrokeWidth = typedArray.getFloat(R.styleable.TripPlanPlacesIndicatorView_strokeSize, 10f)

            textBackgroundColor = typedArray.getColor(R.styleable.TripPlanPlacesIndicatorView_textBackgroundColor,Color.WHITE )
            itemColor = typedArray.getColor(R.styleable.TripPlanPlacesIndicatorView_itemColor,Color.GREEN )

            fillItems = typedArray.getBoolean(R.styleable.TripPlanPlacesIndicatorView_fillItems, false)


        } finally {
            typedArray.recycle()
        }
    }

    private val textPaint = Paint().apply {
        color = Color.BLACK
        strokeWidth = 20f
        textSize = 60f
        textAlign = Paint.Align.CENTER
        typeface = Typeface.DEFAULT_BOLD
        style = Paint.Style.FILL
        flags = Paint.ANTI_ALIAS_FLAG

    }

    private val textBackground = Paint().apply {
        color = textBackgroundColor
        style = Paint.Style.FILL_AND_STROKE
        strokeWidth = itemStrokeWidth
        flags = Paint.ANTI_ALIAS_FLAG
    }

    private val itemPaint = Paint().apply {
        color = itemColor
        strokeWidth = itemStrokeWidth
        style = if(fillItems){Paint.Style.FILL_AND_STROKE}else{Paint.Style.STROKE}
        flags = Paint.ANTI_ALIAS_FLAG
    }


    private var placesCount: Number = 0
    private var noPlacesText: String = "Нет элементов"

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val widthMode = MeasureSpec.getMode(widthMeasureSpec)
        when (widthMode) {
            MeasureSpec.UNSPECIFIED -> Log.d(
                TripPlanPlacesIndicatorView.TAG,
                "onMeasure UNSPECIFIED"
            )
            MeasureSpec.AT_MOST,
            MeasureSpec.EXACTLY -> {
                super.onMeasure(widthMeasureSpec, heightMeasureSpec)
            }
        }
    }

    private fun getItemSize(): Float {
        return 2 * singleItemRadius + itemPadding + 2 * itemStrokeWidth
    }


    /*
    Optimization in order to fit all circles inside element
    if attribute fitElements = true
    iterations needed since solving square equation has limitations
    it operates based on floating point operations, but we want
    whole circle to be visible (not part of it)
     */
    private fun findOptimalRadiusAndPadding() {
        var fakePlacesCount:Int = placesCount.toInt()

        var optimizeSize = true
        while(optimizeSize) {
            // find allowed element Area
            val totalArea: Float = width.toFloat() * height.toFloat()
            val areaUnitPerElement: Float = totalArea / (fakePlacesCount.toFloat())

            val solution = sqrt((areaUnitPerElement)/(paddingRadiusFraction + 2*strokeRadiusFraction + 2))

            val positiveSolution: Float = if (solution > 0) {
                solution
            } else {
                -solution
            }

            singleItemRadius = positiveSolution
            itemPadding = singleItemRadius * paddingRadiusFraction
            itemStrokeWidth = singleItemRadius * strokeRadiusFraction


            val totalRows: Int = floor(height.toFloat() / getItemSize()).toInt()
            val totalColumns: Int = floor(width.toFloat() / getItemSize()).toInt()

            if ((totalRows * totalColumns) >= placesCount.toInt()) {
                //accept solution
                optimizeSize = false
            }else{
                fakePlacesCount += ceil(0.1f * placesCount.toInt()).toInt()
            }
        }

    }

    override fun onDraw(canvas: Canvas?) {

        if(fitElements && placesCount.toInt() > 0){
            findOptimalRadiusAndPadding()
        }

        if (placesCount == 0) {

            adjustFontSizeToFitControlSize()

            canvas?.drawText(noPlacesText, width.toFloat() / 2, height.toFloat() / 2, textPaint)
        } else {
            val itemsPerRow: Int =
                if (width.toFloat() / (placesCount.toInt() * getItemSize()) > 1) {
                    placesCount.toInt()
                } else {
                    floor(width.toFloat() / getItemSize()).toInt()
                }
            var itemsPlacedInARow = 0
            var rowIndex = 1


            val realRowsUsed = ceil(placesCount.toFloat() / itemsPerRow).toInt()
            val dH = height.toFloat() - (getItemSize() * realRowsUsed) - itemStrokeWidth
            val firstDyItemPadding = singleItemRadius + itemStrokeWidth + (itemPadding + dH) / 2

            val dW =
                width.toFloat() - (getItemSize() * floor((width.toFloat() / getItemSize()))) - itemStrokeWidth
            val firstDxItemPadding = singleItemRadius + itemStrokeWidth + (itemPadding + dW) / 2

            var cx = 0f
            var cy = firstDyItemPadding

            for (i in 1..placesCount.toInt()) {

                if (itemsPlacedInARow != 0) {
                    cx += getItemSize()
                } else {
                    cx += firstDxItemPadding
                }

                itemsPlacedInARow++

                if(fitElements)
                    itemPaint.strokeWidth = itemStrokeWidth

                canvas?.drawCircle(cx, cy, singleItemRadius, itemPaint)
                if (itemsPlacedInARow == itemsPerRow) {
                    itemsPlacedInARow = 0
                    //add y
                    cy += getItemSize()
                    cx = 0f
                    rowIndex++
                }

                if (rowIndex > realRowsUsed) {
                    break
                }

            }


            val textXPos = width.toFloat() / 2
            val textYPos = height.toFloat() / 2
            val w: Float = textPaint.measureText(placesCount.toString())/2


            textPaint.getTextBounds(placesCount.toString(), 0, placesCount.toString().length, bounds)
            val textSize = bounds.height()

            canvas?.drawRoundRect(textXPos-w, textYPos - textSize, textXPos + w, textYPos, 15f,15f, textBackground);
            canvas?.drawText(
                placesCount.toString(),
                textXPos,
                textYPos,
                textPaint
            )
        }
    }

    private fun adjustFontSizeToFitControlSize() {

        var textSizeAdapted = textPaint.textSize
        var textWidth = textPaint.measureText(noPlacesText)

        while (textWidth > width) {
            textSizeAdapted -= 1
            textPaint.apply {
                textSize = textSizeAdapted
            }
            textWidth = textPaint.measureText(noPlacesText)
        }
    }

    fun setVisitPlacesCount(placesCount: Int) {
        this.placesCount = placesCount
        requestLayout()
        invalidate()
    }

    fun setVisitPlacesCount(placesCount: Int, noPlacesText: String) {
        this.placesCount = placesCount
        this.noPlacesText = noPlacesText
        requestLayout()
        invalidate()
    }

}