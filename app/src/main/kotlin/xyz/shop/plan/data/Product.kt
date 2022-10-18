package xyz.shop.plan.data

interface Product {
    val id: Int
    val nameResId: Int
    val imageUrl: String
    val measureUnit: MeasureUnit
}
