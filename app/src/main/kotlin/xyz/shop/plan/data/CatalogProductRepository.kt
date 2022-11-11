package xyz.shop.plan.data

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import xyz.shop.plan.domain.Catalog
import xyz.shop.plan.domain.Product
import javax.inject.Inject

class CatalogProductRepository @Inject constructor(
    private val catalog: Catalog
) {

    fun getCatalogItems(): Flow<List<Product>> =
        flow {
            emit(catalog.items)
        }
}
