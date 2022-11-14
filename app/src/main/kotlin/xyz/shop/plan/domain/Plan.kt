package xyz.shop.plan.domain

import org.joda.time.DateTime

data class Plan(
    val id: String,
    val listedProducts: List<ListedProduct>,
    val creationDateTime: DateTime = DateTime.now()
)
