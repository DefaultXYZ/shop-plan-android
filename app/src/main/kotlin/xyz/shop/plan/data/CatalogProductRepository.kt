package xyz.shop.plan.data

import xyz.shop.plan.domain.CatalogProduct

interface CatalogProductRepository {
    fun getCatalogItems(): List<CatalogProduct>
}
