package xyz.shop.plan.presentation.splash

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import xyz.shop.plan.extensions.withExceptionHandler
import xyz.shop.plan.utils.coroutines.AppDispatchers
import xyz.shop.plan.utils.firebase.FirebaseAuthProvider
import xyz.shop.plan.utils.logging.logError
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(
    private val dispatchers: AppDispatchers,
    private val firebaseAuthProvider: FirebaseAuthProvider
) : ViewModel() {
    var signInStatus by mutableStateOf<SignInStatus>(SignInStatus.NotDefined)
        private set

    fun signInAnonymously() {
        viewModelScope.launch(dispatchers.background.withExceptionHandler { exception ->
            logError(exception)
            signInStatus = SignInStatus.Failed(exception)
        }) {
            signInStatus = if (!firebaseAuthProvider.isUserLoggedIn()) {
                firebaseAuthProvider.signInAnonymously()
                SignInStatus.Successful.Success
            } else {
                SignInStatus.Successful.LoggedIn
            }
        }
    }
}

sealed class SignInStatus {
    sealed class Successful : SignInStatus() {
        object Success : Successful()
        object LoggedIn : Successful()
    }

    object NotDefined : SignInStatus()
    data class Failed(val exception: Throwable) : SignInStatus()
}
