package com.superddaiupay

import java.text.NumberFormat
import java.text.SimpleDateFormat
import java.util.*

object Utils {

    @JvmStatic
    fun minDecimalFormat(value: Number?, decimalDigits: Int): String {
        val nf = NumberFormat.getInstance(Locale("pt", "BR"))
        nf.minimumFractionDigits = decimalDigits
        return nf.format(value?.toDouble() ?: 0)
    }

    @JvmStatic
    fun maxDecimalFormat(value: Number?, decimalDigits: Int): String {
        val nf = NumberFormat.getInstance(Locale("pt", "BR"))
        nf.maximumFractionDigits = decimalDigits
        return nf.format(value?.toDouble() ?: 0)
    }

    @JvmStatic
    fun formatMoney(value: Number?): String {
       return minDecimalFormat(value, 2)
    }

    @JvmStatic
    fun formatText(value: String?): String {
        return  value ?: ""
    }

    @JvmStatic
    fun formatDate(date: Date?, pattern: String): String {
        return date?.let {
            SimpleDateFormat(pattern, Locale.getDefault())
                .format(it).toUpperCase(Locale.ROOT)
        } ?: ""
    }
}