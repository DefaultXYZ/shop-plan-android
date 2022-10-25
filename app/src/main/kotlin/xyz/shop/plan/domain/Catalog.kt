package xyz.shop.plan.domain

import androidx.annotation.StringRes
import xyz.shop.plan.R

private val catalogItems = listOf(
    CatalogItem(
        nameResId = R.string.product_milk,
        imageUrl = "product_milk.jpg",
        measureUnit = MeasureUnit.LIQUID
    ),
    CatalogItem(
        nameResId = R.string.product_water,
        imageUrl = "product_water.jpg",
        measureUnit = MeasureUnit.LIQUID
    ),
    CatalogItem(
        nameResId = R.string.product_potato,
        imageUrl = "product_potato.jpg",
        measureUnit = MeasureUnit.WEIGHT
    ),
    CatalogItem(
        nameResId = R.string.product_bread,
        imageUrl = "product_bread.jpg",
        measureUnit = MeasureUnit.QUANTITY
    ),
)

object Catalog {
    val items: List<CatalogProduct> = catalogItems.mapIndexed { index, catalogItem -> catalogItem.toCatalogProduct(index) }
}

private data class CatalogItem(
    @StringRes val nameResId: Int,
    val imageUrl: String,
    val measureUnit: MeasureUnit
)

private fun CatalogItem.toCatalogProduct(index: Int): CatalogProduct =
    CatalogProduct(
        id = index,
        nameResId = nameResId,
        imageUrl = "products/$imageUrl",
        measureUnit = measureUnit
    )
