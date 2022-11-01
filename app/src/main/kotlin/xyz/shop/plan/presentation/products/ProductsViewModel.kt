package xyz.shop.plan.presentation.products

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import xyz.shop.plan.data.CatalogProductRepository
import xyz.shop.plan.domain.CatalogProduct
import javax.inject.Inject

@HiltViewModel
class ProductsViewModel @Inject constructor(
    repository: CatalogProductRepository
) : ViewModel() {
    val productItems: Flow<List<CatalogProduct>> = repository.getCatalogItems()
}
