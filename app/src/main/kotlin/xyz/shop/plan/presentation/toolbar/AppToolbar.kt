package xyz.shop.plan.presentation.toolbar

import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun AppToolbar(
    title: String,
    modifier: Modifier = Modifier
) {
    TopAppBar(
        modifier = modifier
    ) {
        Text(title)
    }
}
