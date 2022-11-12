package xyz.shop.plan.presentation.products

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import xyz.shop.plan.data.CatalogProductRepository
import xyz.shop.plan.utils.firebase.FirebaseStorageProvider
import javax.inject.Inject

@HiltViewModel
class ProductsViewModel @Inject constructor(
    repository: CatalogProductRepository,
    private val storageProvider: FirebaseStorageProvider
) : ViewModel() {
    val productItems: Flow<List<ProductsListItem>> = repository.getCatalogItems().map { items ->
        items.map {
            ProductsListItem(product = it, imageUrl = storageProvider.loadImageDownloadUrl(it.imageUrl))
        }.sortedBy { it.product.name }
    }
}
