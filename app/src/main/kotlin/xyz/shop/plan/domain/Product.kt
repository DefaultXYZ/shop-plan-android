package xyz.shop.plan.domain

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

@Singleton
class Catalog @Inject constructor() {
    val items: List<Product> = Product.values().toList()
}
