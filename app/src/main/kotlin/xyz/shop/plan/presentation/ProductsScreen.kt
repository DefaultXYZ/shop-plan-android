package xyz.shop.plan.presentation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
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

@Composable
fun ProductsScreen(
    modifier: Modifier = Modifier,
    viewModel: ProductsViewModel
) {
    val productItems by viewModel.productItems.collectAsState(initial = emptyList())
    Surface(
        modifier = modifier.fillMaxSize(),
        color = MaterialTheme.colors.background,
    ) {
        LazyColumn {
            items(
                count = productItems.count(),
                key = { productItems[it].id }
            ) {
                Text(stringResource(productItems[it].nameResId))
            }
        }
    }
}
