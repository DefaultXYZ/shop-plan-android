package xyz.shop.plan.domain

import androidx.annotation.StringRes
import xyz.shop.plan.R
import javax.inject.Inject
import javax.inject.Singleton

enum class Product(
    val imageUrl: String,
    val measureUnit: MeasureUnit
) {
    Milk("product_milk.jpg", MeasureUnit.LIQUID),
    Water("product_water.jpg", MeasureUnit.LIQUID),
    Potato("product_potato.jpg", MeasureUnit.WEIGHT),
    Bread("product_bread.jpg", MeasureUnit.QUANTITY);

    val id: Int = ordinal
}

@get:StringRes
val Product.nameResId: Int
    get() = when (this) {
        Product.Potato -> R.string.product_potato
        Product.Milk -> R.string.product_milk
        Product.Water -> R.string.product_water
        Product.Bread -> R.string.product_bread
    }

@Singleton
class Catalog @Inject constructor() {
    val items: List<Product> = Product.values().toList()
}
