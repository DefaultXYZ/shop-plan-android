package xyz.shop.plan

import xyz.shop.plan.data.CatalogProduct
import xyz.shop.plan.data.ListedProduct
import xyz.shop.plan.data.MeasureUnit

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
