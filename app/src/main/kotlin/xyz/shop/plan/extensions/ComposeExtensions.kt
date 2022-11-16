package xyz.shop.plan.extensions

import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.platform.LocalContext
import kotlinx.coroutines.CoroutineScope
import xyz.shop.plan.ui.theme.ShopPlanTheme

@Composable
fun ShowToast(message: String, length: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(LocalContext.current, message, length).show()
}

@Composable
fun PreviewContainer(content: @Composable () -> Unit) {
    ShopPlanTheme {
        content()
    }
}

@Composable
fun LaunchCoroutine(block: suspend CoroutineScope.() -> Unit) {
    LaunchedEffect(Unit, block)
}
