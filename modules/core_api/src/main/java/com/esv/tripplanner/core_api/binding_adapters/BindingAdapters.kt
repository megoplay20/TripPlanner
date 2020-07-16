package com.esv.tripplanner.core_api.binding_adapters

import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.Spinner
import androidx.databinding.BindingAdapter
import androidx.databinding.InverseBindingAdapter
import androidx.databinding.InverseBindingListener
import androidx.databinding.adapters.ListenerUtil
import com.esv.tripplanner.core_api.R


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


            val oldValue =
                ListenerUtil.trackListener(spinner, listener, R.id.editTextChangeListenerId)
            if (oldValue != null)
                spinner.onItemSelectedListener = null
            spinner.onItemSelectedListener = listener

            val spinnerItemIndex =
                getSpinnerItemIndex(
                    spinner,
                    selectedSpinnerItem
                )

            if (spinner.selectedItemPosition != spinnerItemIndex) {
                spinner.setSelection(
                    spinnerItemIndex
                )
            }

        }


        private fun getSpinnerItemIndex(spinner: Spinner, spinnerItem: Any?): Int {
            for (i in 0 until spinner.count) {
                val item: Any? = spinner.getItemAtPosition(i)
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

    }

}

