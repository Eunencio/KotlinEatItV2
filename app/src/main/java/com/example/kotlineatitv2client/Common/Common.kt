package com.example.kotlineatitv2client.Common

import android.graphics.Typeface
import android.text.Spannable
import android.text.SpannableString
import android.text.SpannableStringBuilder
import android.text.style.StyleSpan
import android.widget.TextView
import com.example.kotlineatitv2client.Model.*
import java.math.RoundingMode
import java.text.DecimalFormat
import java.util.*

object Common {
    fun formatPrice(price: Double): Any {
           if (price != 0.toDouble()){
               val df = DecimalFormat("#,##0.00")
               df.roundingMode = RoundingMode.HALF_UP
               val finalPrice = StringBuilder(df.format(price)).toString()
               return finalPrice.replace(".",",")
           }else
               return "0,00"
    }

    fun calculateExtraPrice(
        userSelectedSize: SizeModel?,
        userSelectedAddon: MutableList<AddonModel>?
    ): Double {
        var result:Double=0.0
        if (userSelectedSize == null && userSelectedAddon == null)
            return 0.0
        else if (userSelectedSize == null)
        {
            for (addonModel in userSelectedAddon!!)
                result += addonModel.price!!.toDouble()
            return result
        }
        else if (userSelectedAddon == null)
        {
            result = userSelectedSize!!.price!!.toDouble()
            return result
        }
        else
        {
            result = userSelectedSize!!.price!!.toDouble()
            for (addonModel in userSelectedAddon!!)
                result += addonModel.price!!.toDouble()
            return result
        }
    }

    fun setSpanString(welcome: String, name: String?, txtUser: TextView?) {
        val buider = SpannableStringBuilder()
        buider.append(welcome)
        val txtSpannable = SpannableString(name)
        val boldSpan = StyleSpan(Typeface.BOLD)
        txtSpannable.setSpan(boldSpan,0,name!!.length,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        buider.append(txtSpannable)
        txtUser!!.setText(buider,TextView.BufferType.SPANNABLE)
    }

    fun createOrderNumber(): String {
        return StringBuilder()
            .append(System.currentTimeMillis())
            .append(Math.abs(Random().nextInt()))
            .toString()
    }

    val ORDER_REF: String = "Order"
    val COMMENT_REF: String = "Comments"
    var foodSelected: FoodModel?=null
    val CATEGORY_REF: String="Category"
    var categorySelected: CategoryModel?=null
    val FULL_WIDTH_COLUMN: Int = 1
    val DEFAULT_COLUMN_COUNT: Int=0
    val BEST_DEALS_REF: String="BestDeals"
    val POPULAR_REF: String="MostPopular"
    val USER_REFERENCE="Users"
    var currentUser:UserModel?=null
}