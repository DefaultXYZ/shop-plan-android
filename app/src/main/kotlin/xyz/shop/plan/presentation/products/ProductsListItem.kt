package xyz.shop.plan.presentation.products

import xyz.shop.plan.domain.Product

data class ProductsListItem(
    val product: Product,
    val imageUrl: String
)
