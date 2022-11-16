package xyz.shop.plan.domain.product

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource

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

@Composable
fun ListedProduct.provideTitle(): String = "${stringResource(product.nameResId)} x$quantity"
