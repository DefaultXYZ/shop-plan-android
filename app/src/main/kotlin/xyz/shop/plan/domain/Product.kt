package xyz.shop.plan.domain

interface Product {
    val id: Int
    val nameResId: Int
    val imageUrl: String
    val measureUnit: MeasureUnit
}
