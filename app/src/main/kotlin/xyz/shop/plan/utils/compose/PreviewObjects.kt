package xyz.shop.plan.utils.compose

import xyz.shop.plan.domain.Product
import xyz.shop.plan.presentation.products.ProductsListItem

object PreviewObjects {
    val product: Product
        get() = Product.Potato

    val productsListItems: List<ProductsListItem>
        get() = listOf(
            ProductsListItem(product = product, imageUrl = ""),
            ProductsListItem(product = Product.Bread, imageUrl = ""),
            ProductsListItem(product = Product.Milk, imageUrl = "")
        )

    val productsListItem: ProductsListItem
        get() = productsListItems.first()
}
