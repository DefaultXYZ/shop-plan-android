package xyz.shop.plan.presentation.splash

import androidx.compose.foundation.layout.Box
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Modifier
import kotlinx.coroutines.delay

private const val splashDelay = 2000L

@Composable
fun SplashScreen(
    modifier: Modifier = Modifier,
    onMainNavigation: () -> Unit
) {
    val currentOnScreenShown by rememberUpdatedState(onMainNavigation)
    LaunchedEffect(Unit) {
        delay(splashDelay)
        currentOnScreenShown()
    }

    Box(modifier) {
        Text("You're on Splash")
    }
}
