package xyz.shop.plan.utils.compose

import xyz.shop.plan.domain.ListedProduct
import xyz.shop.plan.domain.Plan
import xyz.shop.plan.domain.Product
import xyz.shop.plan.presentation.plan.PlanListItem
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

    private val plans: List<Plan>
        get() = listOf(
            Plan(
                id = "1",
                listedProducts = listOf(
                    ListedProduct(product = Product.Potato, initialQuantity = 2.5),
                    ListedProduct(product = Product.Milk, initialQuantity = 1.0),
                    ListedProduct(product = Product.Water, initialQuantity = 5.5),
                    ListedProduct(product = Product.Bread, initialQuantity = 2.0)
                )
            ),
            Plan(
                id = "2",
                listedProducts = listOf(
                    ListedProduct(product = Product.Water, initialQuantity = 0.5),
                    ListedProduct(product = Product.Potato, initialQuantity = 6.5)
                )
            )
        )

    private val plan: Plan
        get() = plans.first()

    val planListItems: List<PlanListItem>
        get() = plans.map { PlanListItem(plan = it) }

    val planListItem: PlanListItem
        get() = planListItems.first()
}
