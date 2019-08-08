package com.lambdaschool.android.organization.util


import android.util.Log
import java.text.NumberFormat

class TextUtils {
    companion object {
        // TODO: format the currency using NumberFormat.getCurrencyInstance - refer to the docs
        fun formatCurrency(price : Double) : String {
            var format = NumberFormat.getCurrencyInstance()
            return "${format.format(price)}"
        }

        // TODO: format the percent using NumberFormat.getPercentInstance - refer to the docs
        fun formatPercent(discount : Double) : String {
            var format = NumberFormat.getPercentInstance()
            return "${format.format(discount)}"
        }
    }
}