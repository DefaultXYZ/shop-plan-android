package xyz.shop.plan.presentation.products

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.SubcomposeAsyncImage
import coil.request.ImageRequest
import xyz.shop.plan.R
import xyz.shop.plan.domain.nameResId
import xyz.shop.plan.extensions.PreviewContainer
import xyz.shop.plan.utils.compose.PreviewObjects

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
        ProductsGrid(productItems = productItems)
    }
}

@Composable
fun ProductsGrid(
    modifier: Modifier = Modifier,
    productItems: List<ProductsListItem>
) {
    LazyVerticalGrid(
        modifier = modifier,
        columns = GridCells.Fixed(2),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(16.dp)
    ) {
        items(
            count = productItems.count(),
            key = { productItems[it].product.id }
        ) {
            val item = productItems[it]
            ProductCard(item = item)
        }
    }
}

@Composable
fun ProductCard(
    modifier: Modifier = Modifier,
    item: ProductsListItem
) {
    Card(modifier = modifier) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            SubcomposeAsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(item.imageUrl)
                    .placeholder(R.drawable.placeholder_basket)
                    .build(),
                contentDescription = stringResource(item.product.nameResId),
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(1f)
            )
            Text(stringResource(item.product.nameResId))
        }
    }
}

@Preview
@Composable
fun PreviewProductGrid() {
    PreviewContainer {
        ProductsGrid(productItems = PreviewObjects.productsListItems)
    }
}

@Preview(widthDp = 256, heightDp = 280)
@Composable
fun PreviewProductCard() {
    PreviewContainer {
        ProductCard(modifier = Modifier.padding(16.dp), item = PreviewObjects.productsListItem)
    }
}
