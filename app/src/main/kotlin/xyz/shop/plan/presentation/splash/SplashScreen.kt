package xyz.shop.plan.presentation.splash

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Modifier
import kotlinx.coroutines.delay
import xyz.shop.plan.extensions.ShowToast

private const val splashDelay = 2000L

@Composable
fun SplashScreen(
    modifier: Modifier = Modifier,
    viewModel: SplashViewModel,
    onMainNavigation: () -> Unit
) {
    val signInStatus = viewModel.signInStatus

    val currentOnScreenShown by rememberUpdatedState(onMainNavigation)

    LaunchedEffect(Unit) {
        viewModel.signInAnonymously()
    }

    ShowStatusToast(signInStatus)
    if (signInStatus is SignInStatus.Successful) {
        LaunchedEffect(Unit) {
            delay(splashDelay)
            currentOnScreenShown()
        }
    }

    Box(modifier) {
        Column {
            Text("You're on Splash")
        }
    }
}

@Composable
private fun ShowStatusToast(signInStatus: SignInStatus) {
    when (signInStatus) {
        is SignInStatus.Failed -> ShowToast("Login failed")
        SignInStatus.Successful.LoggedIn -> ShowToast("Logged In")
        SignInStatus.Successful.Success -> ShowToast("Login Successful")
        SignInStatus.NotDefined -> Unit
    }
}
