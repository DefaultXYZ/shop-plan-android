package xyz.shop.plan.domain

import org.joda.time.DateTime

data class ProductList(
    val id: Int,
    private val initialBasket: MutableList<ListedProduct> = mutableListOf(),
    val creationDateTime: DateTime = DateTime.now()
) {
    val basket: List<ListedProduct> get() = initialBasket

    fun addToBasket(product: ListedProduct) {
        initialBasket.add(product)
    }

    fun changeQuantityAtPosition(position: Int, quantity: Double) {
        initialBasket[position].changeQuantity(quantity)
    }

    fun removeFromBasket(product: ListedProduct) {
        initialBasket.remove(product)
    }

    fun removeFromBasket(id: Int) {
        initialBasket.removeAll { it.product.id == id }
    }

    fun removeFromBasketAtPosition(position: Int) {
        initialBasket.removeAt(position)
    }
}
