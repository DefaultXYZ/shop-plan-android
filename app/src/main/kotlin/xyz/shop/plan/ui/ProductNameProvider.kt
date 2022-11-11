package xyz.shop.plan.ui

import androidx.annotation.StringRes
import xyz.shop.plan.R
import xyz.shop.plan.domain.Product

@get:StringRes
val Product.nameResId: Int
    get() = when (this) {
        Product.Potato -> R.string.product_potato
        Product.Milk -> R.string.product_milk
        Product.Water -> R.string.product_water
        Product.Bread -> R.string.product_bread
    }
