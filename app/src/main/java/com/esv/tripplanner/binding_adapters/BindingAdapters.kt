package com.esv.tripplanner.binding_adapters

import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.EditText
import android.widget.Spinner
import androidx.databinding.BindingAdapter
import androidx.databinding.InverseBindingAdapter
import androidx.databinding.InverseBindingListener
import androidx.databinding.adapters.ListenerUtil
import com.esv.tripplanner.R
import com.esv.tripplanner.utils.ITypeCaster
import com.esv.tripplanner.utils.TypeCasterImpl


class BindingAdapters {

    companion object {

        @BindingAdapter(
            value = ["selectedSpinnerItem", "selectedSpinnerItemAttrChanged"],
            requireAll = false
        )
        @JvmStatic
        fun setSelectedSpinnerItem(
            spinner: Spinner,
            selectedSpinnerItem: Any?,
            changeListener: InverseBindingListener?
        ) {

            val listener = object : OnItemSelectedListener {
                override fun onItemSelected(
                    adapterView: AdapterView<*>?,
                    view: View,
                    i: Int,
                    l: Long
                ) {
                    changeListener?.onChange()
                }

                override fun onNothingSelected(adapterView: AdapterView<*>?) {
                    changeListener?.onChange()
                }
            }


            val oldValue = ListenerUtil.trackListener(spinner, listener, R.id.editTextChangeListenerId)
            if(oldValue!=null)
                spinner.onItemSelectedListener = null
            spinner.onItemSelectedListener = listener

            val spinnerItemIndex = getSpinnerItemIndex(
                spinner,
                selectedSpinnerItem
            )

            if(spinner.selectedItemPosition != spinnerItemIndex) {
                spinner.setSelection(
                        spinnerItemIndex
                )
            }

        }


        private fun getSpinnerItemIndex(spinner: Spinner, spinnerItem: Any?): Int {
            for (i in 0 until spinner.count) {
                val item:Any? = spinner.getItemAtPosition(i)
                if (item == spinnerItem) {
                    return i
                }
            }
            return -1
        }

        @InverseBindingAdapter(
            attribute = "selectedSpinnerItem",
            event = "selectedSpinnerItemAttrChanged"
        )
        @JvmStatic
        fun getSelectedSpinnerItem(spinner: Spinner): Any? {
            return spinner.selectedItem
        }


        @BindingAdapter(value = ["setDoubleValue", "expectedType", "setDoubleValueAttrChanged"], requireAll = false )
        @JvmStatic fun setEditTextTypedValue(
            editText: EditText,
            value: Double?,
            expectedType: String,
            changeListener: InverseBindingListener
        ) {
            val listener =  object : TextWatcher{
                override fun afterTextChanged(s: Editable?) { }
                override fun beforeTextChanged(
                    s: CharSequence?,
                    start: Int,
                    count: Int,
                    after: Int
                ) {

                }
                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    changeListener.onChange()
                }
            }

            val oldValue: TextWatcher? = ListenerUtil.trackListener(editText, listener, R.id.editTextChangeListenerId)
            if(oldValue!=null)
                editText.removeTextChangedListener(oldValue)
            editText.addTextChangedListener(listener)

            editText.setTag(R.id.dataTypeId, expectedType);
            val newValue = value?.toString() ?: ""
            if(editText.text?.toString() ?: "" != newValue) {
                editText.setText(newValue);
            }
        }

        @InverseBindingAdapter(
            attribute = "setDoubleValue",
            event = "setDoubleValueAttrChanged"
        )
        @JvmStatic fun getEditTextTypedValue(editText: EditText): Double? {
            val typeCaster:ITypeCaster = TypeCasterImpl()
            val providedType = editText.getTag(R.id.dataTypeId)
            return typeCaster.GetDouble(editText.text)
        }
    }
}

