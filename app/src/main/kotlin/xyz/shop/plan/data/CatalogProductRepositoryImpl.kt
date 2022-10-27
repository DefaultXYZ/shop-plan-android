package xyz.shop.plan.data

import xyz.shop.plan.domain.Catalog
import xyz.shop.plan.domain.CatalogProduct
import javax.inject.Inject

class CatalogProductRepositoryImpl @Inject constructor(
    private val catalog: Catalog
) : CatalogProductRepository {

    override fun getCatalogItems(): List<CatalogProduct> = catalog.items
}
