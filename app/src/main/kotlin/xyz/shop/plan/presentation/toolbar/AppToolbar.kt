package xyz.shop.plan.presentation.toolbar

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun AppToolbar(
    modifier: Modifier = Modifier,
    title: String,
    displayNavigateUpIcon: Boolean = false,
    onNavigateUp: () -> Unit = {}
) {
    TopAppBar(
        modifier = modifier
    ) {
        if (displayNavigateUpIcon) {
            IconButton(onClick = onNavigateUp) {
                Icon(Icons.Outlined.ArrowBack, contentDescription = null)
            }
        }
        Text(title)
    }
}
