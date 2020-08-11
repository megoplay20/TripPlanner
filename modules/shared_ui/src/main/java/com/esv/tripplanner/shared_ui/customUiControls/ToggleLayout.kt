package com.esv.tripplanner.shared_ui.customUiControls

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.util.AttributeSet
import android.view.View
import android.view.ViewGroup
import com.esv.tripplanner.shared_ui.R
import java.lang.Exception
import kotlin.math.max

class ToggleLayout (context: Context, attributeSet: AttributeSet) : ViewGroup(context, attributeSet){
    private var defaultWidthAndHeight = 200
    private var hideButtonVisible = true
    private var maxToggleHeight = 0
    private var maxToggleWidth = 0

    private var toggleListener: IToggleStateListener? = null;

    init {
        val typedArray =
            context.obtainStyledAttributes(attributeSet, R.styleable.ToggleLayout)
        try {
            hideButtonVisible =
                !typedArray.getBoolean(R.styleable.ToggleLayout_hideContentByDefault, false)


        } finally {
            typedArray.recycle()
        }
    }

    companion object{
        const val defaultToggleButtonWidth = 50
        const val defaultToggleButtonHeight = 50
    }

    fun setToggleStateListener(toggleListener: IToggleStateListener){
        this.toggleListener = toggleListener
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        getToggleChildren().forEach {
            if(it.hasOnClickListeners()){
                    it.setOnClickListener(null)
            }

            it.setOnClickListener {
                val lp = it.layoutParams as ToggleLayoutParams
                if(lp.viewRole == ToggleLayoutParams.ViewRole.SHOW_BUTTON){
                    hideButtonVisible = true
                }
                if(lp.viewRole == ToggleLayoutParams.ViewRole.HIDE_BUTTON){
                    hideButtonVisible = false
                }
                toggleListener?.stateToggled(hideButtonVisible)
                invalidate()
                requestLayout()
            }
        }
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val widthMode = MeasureSpec.getMode(widthMeasureSpec)
        val heightMode = MeasureSpec.getMode(widthMeasureSpec)
        val heightSize = MeasureSpec.getSize(heightMeasureSpec)
        val widthSize = MeasureSpec.getSize(widthMeasureSpec)

        updateGetMaxToggleSizes()

        if(childCount > 4){
            throw Exception("Toggle layout is suppose to work with 3 children: 2 hide buttons, 1 content and 1 title!")
        }
        val toggleChildren = getToggleChildren()
        val contentChild = getContentChild()
        if(toggleChildren.count()!=2){
            throw Exception("You should provide 2 toggle child!")
        }


        for(child in toggleChildren){
            val lp = child.layoutParams as ToggleLayoutParams
            measureChild(child,MeasureSpec.makeMeasureSpec(lp.desiredWidth, MeasureSpec.EXACTLY),
                MeasureSpec.makeMeasureSpec(lp.desiredHeight, MeasureSpec.EXACTLY))
        }

        val headerTitle= getHeaderLabelChild()

        headerTitle?.let {
            measureChild(it,MeasureSpec.makeMeasureSpec(widthSize - maxToggleWidth, MeasureSpec.AT_MOST),
                MeasureSpec.makeMeasureSpec(maxToggleHeight, MeasureSpec.AT_MOST))
        }

        contentChild?.let {
            val lp = it.layoutParams as ToggleLayoutParams

            measureChild(it,MeasureSpec.makeMeasureSpec(widthSize, if(lp.width == LayoutParams.WRAP_CONTENT){MeasureSpec.AT_MOST}else{MeasureSpec.EXACTLY} ),
                    MeasureSpec.makeMeasureSpec(heightSize - maxToggleHeight, if(lp.height == LayoutParams.WRAP_CONTENT){MeasureSpec.AT_MOST}else{MeasureSpec.EXACTLY} ))

            if(widthMode == MeasureSpec.UNSPECIFIED || widthSize == 0){
                setMeasuredDimension(defaultWidthAndHeight, heightSize)
            }
            else if(heightMode == MeasureSpec.UNSPECIFIED || heightSize == 0){
                setMeasuredDimension(widthSize, defaultWidthAndHeight)
            } else if(!hideButtonVisible){
                setMeasuredDimension(widthSize, maxToggleHeight)
            }
            else{
                setMeasuredDimension(widthSize, maxToggleHeight + it.measuredHeight)
            }
        }
    }
    private fun updateGetMaxToggleSizes(){
        for(child in getToggleChildren()){
            val lp = child.layoutParams as ToggleLayoutParams
            maxToggleHeight = max(lp.desiredHeight, maxToggleHeight)
            maxToggleWidth = max(lp.desiredWidth, maxToggleWidth)
        }
    }


    private fun getHeaderLabelChild(): View? {
        return getChildWithGivenLayoutViewRoles(
            ToggleLayoutParams.ViewRole.SECTION_LABEL).firstOrNull()
    }

    private fun getContentChild(): View? {
        return getChildWithGivenLayoutViewRoles(
            ToggleLayoutParams.ViewRole.CONTENT).first()
    }

    private fun getToggleChildren(): List<View> {
        return getChildWithGivenLayoutViewRoles(
            ToggleLayoutParams.ViewRole.SHOW_BUTTON, ToggleLayoutParams.ViewRole.HIDE_BUTTON)
    }

    private fun getChildWithGivenLayoutViewRoles(vararg roles: ToggleLayoutParams.ViewRole): List<View> {
        return (0 until childCount).toList().filter {
            val child = getChildAt(it)
            val lp = child.layoutParams as ToggleLayoutParams
            lp.viewRole in roles
        }.map {
            getChildAt(it)
        }
    }


    override fun onLayout(p0: Boolean, p1: Int, p2: Int, p3: Int, p4: Int) {
        if (childCount == 0) return

        for(child in getToggleChildren()){
            val lp = child.layoutParams as ToggleLayoutParams
            child.layout(measuredWidth - lp.desiredWidth, 0, measuredWidth, lp.desiredHeight)
        }
        getContentChild()?.layout(0, maxToggleHeight, measuredWidth, measuredHeight)

        getHeaderLabelChild()?.let{
            it.layout(0,0, it.measuredWidth, it.measuredHeight)
        }

        for(child in getToggleChildren()){
            val lp = child.layoutParams as ToggleLayoutParams
            if(lp.viewRole == ToggleLayoutParams.ViewRole.HIDE_BUTTON){
                if(hideButtonVisible)
                    child.visibility = View.VISIBLE
                else
                    child.visibility = View.GONE
            }
            if(lp.viewRole == ToggleLayoutParams.ViewRole.SHOW_BUTTON){
                if(!hideButtonVisible)
                    child.visibility = View.VISIBLE
                else
                    child.visibility = View.GONE
            }
        }
        val contentChild = getContentChild()
        contentChild?.apply {
            if(hideButtonVisible){
                visibility = View.VISIBLE
            }else{
                visibility = View.GONE
            }
        }

    }
    override fun dispatchDraw(canvas: Canvas?) {
        super.dispatchDraw(canvas)

    }

    override fun checkLayoutParams(p: LayoutParams?): Boolean {
        return p is ToggleLayoutParams
    }

    override fun generateLayoutParams(attrs: AttributeSet): LayoutParams {
        return ToggleLayoutParams(context, attrs)
    }

    override fun generateLayoutParams(p: LayoutParams): LayoutParams {
        return ToggleLayoutParams(p)
    }

    class ToggleLayoutParams : MarginLayoutParams {

        enum class ViewRole(val value:Int){
                HIDE_BUTTON(0),
            SHOW_BUTTON(1),
            CONTENT(2),
            SECTION_LABEL(3);
            companion object {
                fun fromInt(value: Int) = values().first { it.value == value }
            }
        }

        constructor(context: Context, attributeSet: AttributeSet) : super(context, attributeSet) {
            readStyleParams(context, attributeSet)
        }

        constructor(layoutParams: ViewGroup.LayoutParams) : super(layoutParams)
        constructor(width: Int, height: Int) : super(width, height)

        var viewRole: ViewRole = ViewRole.HIDE_BUTTON
        var desiredWidth:Int = ToggleLayout.defaultToggleButtonWidth
        var desiredHeight:Int = ToggleLayout.defaultToggleButtonHeight

        private fun readStyleParams(context: Context, attributeSet: AttributeSet) {
            val typedArray = context.obtainStyledAttributes(attributeSet, R.styleable.ToggleLayout_Layout)
            try {
                viewRole = ViewRole.fromInt(typedArray.getInt(R.styleable.ToggleLayout_Layout_layout_viewRole, 0))
                desiredWidth = typedArray.getDimensionPixelSize(R.styleable.ToggleLayout_Layout_layout_childDesiredWidth, ToggleLayout.defaultToggleButtonWidth)
                desiredHeight = typedArray.getDimensionPixelSize(R.styleable.ToggleLayout_Layout_layout_childDesiredHeight, ToggleLayout.defaultToggleButtonHeight)
            } finally {
                typedArray.recycle()
            }
        }
    }
    interface IToggleStateListener{
        fun stateToggled(isContentVisible: Boolean)
    }
}