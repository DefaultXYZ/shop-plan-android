package xyz.shop.plan.domain

data class ListedProduct(
    val product: Product,
    private var initialQuantity: Double = DEFAULT_QUANTITY
) {
    val quantity: Double get() = initialQuantity

    fun changeQuantity(newQuantity: Double) {
        initialQuantity = newQuantity
    }

    companion object {
        private const val DEFAULT_QUANTITY = 1.0
    }
}
