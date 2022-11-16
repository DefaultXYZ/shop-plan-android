package xyz.shop.plan.utils.locale

import java.util.Locale

private const val ISO_USA = "usa"
private const val ISO_MYANMAR = "mmr"
private const val ISO_LIBERIA = "lbr"

private val imperialCountries = arrayOf(ISO_USA, ISO_MYANMAR, ISO_LIBERIA)

fun Locale.isImperialSystem(): Boolean =
    isO3Country.lowercase() in imperialCountries
