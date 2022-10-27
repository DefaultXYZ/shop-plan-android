package xyz.shop.plan.presentation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import xyz.shop.plan.data.CatalogProductRepository
import javax.inject.Inject

@HiltViewModel
class ProductsViewModel @Inject constructor(
    repository: CatalogProductRepository
) : ViewModel() {
    var productItems by mutableStateOf(repository.getCatalogItems())
        private set
}

@Composable
fun ProductsScreen(
    modifier: Modifier = Modifier,
    viewModel: ProductsViewModel
) {
    val productItems = viewModel.productItems
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
