package xyz.shop.plan.data

import androidx.annotation.StringRes

data class ListedProduct(
    override val id: Int,
    @StringRes override val nameResId: Int,
    override val imageUrl: String,
    override val measureUnit: MeasureUnit,
    private var initialQuantity: Double = DEFAULT_QUANTITY
) : Product {
    val quantity: Double get() = initialQuantity

    fun changeQuantity(newQuantity: Double) {
        initialQuantity = newQuantity
    }

    companion object {
        private const val DEFAULT_QUANTITY = 1.0

        fun from(product: Product, quantity: Double = DEFAULT_QUANTITY): ListedProduct =
            ListedProduct(
                id = product.id,
                nameResId = product.nameResId,
                imageUrl = product.imageUrl,
                measureUnit = product.measureUnit,
                initialQuantity = quantity
            )
    }
}
