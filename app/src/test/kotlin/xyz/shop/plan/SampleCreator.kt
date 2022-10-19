package xyz.shop.plan

import xyz.shop.plan.domain.CatalogProduct
import xyz.shop.plan.domain.ListedProduct
import xyz.shop.plan.domain.MeasureUnit

object SampleCreator {
    fun createCatalogProduct(): CatalogProduct =
        CatalogProduct(
            id = 0,
            nameResId = 0,
            imageUrl = "http://test/image",
            measureUnit = MeasureUnit.QUANTITY
        )

    fun createListedProduct(quantity: Double = 1.0): ListedProduct =
        ListedProduct(
            id = 0,
            nameResId = 0,
            imageUrl = "http://test/image",
            measureUnit = MeasureUnit.QUANTITY,
            initialQuantity = quantity
        )
}
