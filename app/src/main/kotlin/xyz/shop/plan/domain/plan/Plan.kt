package xyz.shop.plan.domain.plan

import org.joda.time.DateTime
import xyz.shop.plan.domain.product.ListedProduct

data class Plan(
    val id: String,
    val listedProducts: List<ListedProduct>,
    val creationDateTime: DateTime = DateTime.now()
)
