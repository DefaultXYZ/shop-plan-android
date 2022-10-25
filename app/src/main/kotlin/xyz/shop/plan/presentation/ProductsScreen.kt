package xyz.shop.plan.presentation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.lifecycle.viewmodel.compose.viewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import xyz.shop.plan.R
import javax.inject.Inject

@HiltViewModel
class ProductsViewModel @Inject constructor() : ViewModel() {
    var data by mutableStateOf("Hello, I'm State")
        private set

    fun changeData() {
        data = "Received new data"
    }
}

@Composable
fun ProductsScreen(
    modifier: Modifier = Modifier,
    viewModel: ProductsViewModel = viewModel()
) {
    Surface(
        modifier = modifier.fillMaxSize(),
        color = MaterialTheme.colors.background,
    ) {
        Column {
            Text(
                text = stringResource(R.string.nav_product_list),
                modifier = Modifier.clickable {
                    viewModel.changeData()
                }
            )
            Text(viewModel.data)
        }
    }
}
