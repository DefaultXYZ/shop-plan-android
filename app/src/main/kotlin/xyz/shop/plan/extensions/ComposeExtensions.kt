package xyz.shop.plan.extensions

import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
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
