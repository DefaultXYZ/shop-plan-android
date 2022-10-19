package xyz.shop.plan.domain

import androidx.annotation.StringRes

data class CatalogProduct(
    override val id: Int,
    @StringRes override val nameResId: Int,
    override val imageUrl: String,
    override val measureUnit: MeasureUnit
) : Product
