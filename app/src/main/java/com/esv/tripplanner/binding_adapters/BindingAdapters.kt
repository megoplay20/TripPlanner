package com.esv.tripplanner.binding_adapters

import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.Spinner
import androidx.databinding.BindingAdapter
import androidx.databinding.InverseBindingAdapter
import androidx.databinding.InverseBindingListener
import androidx.databinding.adapters.ListenerUtil
import androidx.recyclerview.widget.RecyclerView
import com.esv.tripplanner.R
import com.esv.tripplanner.utils.ITypeCaster
import com.esv.tripplanner.utils.TypeCasterImpl


class BindingAdapters {

    companion object {

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

