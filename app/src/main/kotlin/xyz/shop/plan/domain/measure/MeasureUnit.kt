package xyz.shop.plan.domain.measure

import xyz.shop.plan.R
import xyz.shop.plan.utils.locale.isImperialSystem
import java.util.Locale

enum class MeasureUnit {
    QUANTITY,
    WEIGHT,
    LIQUID
}

private val metricWeightResIds: Array<Int>
    get() = arrayOf(
        R.string.metric_weight_kilogram,
        R.string.metric_weight_gram,
        R.string.metric_weight_milligram
    )

private val metricLiquidResIds: Array<Int>
    get() = arrayOf(
        R.string.metric_liquid_litre,
        R.string.metric_liquid_millilitre
    )

private val imperialWeightResIds: Array<Int>
    get() = arrayOf(
        R.string.imperial_weight_pound,
        R.string.imperial_weight_ounce
    )

private val imperialLiquidResIds: Array<Int>
    get() = arrayOf(
        R.string.imperial_liquid_litre,
        R.string.imperial_liquid_millilitre,
        R.string.imperial_liquid_fluid_ounce,
        R.string.imperial_liquid_ounce
    )

fun MeasureUnit.getAvailableTitleResIds(locale: Locale): Array<Int>? =
    when (this) {
        MeasureUnit.QUANTITY -> null
        MeasureUnit.WEIGHT -> if (!locale.isImperialSystem()) metricWeightResIds else imperialWeightResIds
        MeasureUnit.LIQUID -> if (!locale.isImperialSystem()) metricLiquidResIds else imperialLiquidResIds
    }
