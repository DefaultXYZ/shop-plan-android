package xyz.shop.plan.presentation.products

import xyz.shop.plan.domain.CatalogProduct

data class ProductsListItem(
    val product: CatalogProduct,
    val imageUrl: String
)
