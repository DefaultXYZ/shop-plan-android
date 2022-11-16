package xyz.shop.plan.presentation.splash

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import dagger.hilt.android.lifecycle.HiltViewModel
import xyz.shop.plan.base.BaseViewModel
import xyz.shop.plan.domain.auth.SignInStatus
import xyz.shop.plan.utils.coroutines.AppDispatchers
import xyz.shop.plan.utils.firebase.FirebaseAuthProvider
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(
    dispatchers: AppDispatchers,
    private val firebaseAuthProvider: FirebaseAuthProvider
) : BaseViewModel(dispatchers) {
    var signInStatus by mutableStateOf<SignInStatus>(SignInStatus.NotDefined)
        private set

    fun signInAnonymously() {
        launchInBackground(onError = {
            signInStatus = SignInStatus.Failed(it)
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
