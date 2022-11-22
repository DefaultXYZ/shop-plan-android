package xyz.shop.plan.presentation.plan

import androidx.compose.runtime.Composable
import org.joda.time.DateTime
import xyz.shop.plan.domain.plan.Plan
import xyz.shop.plan.domain.product.ListedProduct
import xyz.shop.plan.domain.product.provideTitle

data class PlanListItem(
    val plan: Plan,
    val id: String = plan.id,
    val listedProducts: List<ListedProduct> = plan.listedProducts,
    val creationDateTime: DateTime = plan.creationDateTime
)

@Composable
fun PlanListItem.provideTitle(): String =
    listedProducts.map { it.provideTitle() }.joinToString { it }

fun PlanListItem.formattedDateTime(): String =
    creationDateTime.toString("dd/MM/YYYY HH:mm")