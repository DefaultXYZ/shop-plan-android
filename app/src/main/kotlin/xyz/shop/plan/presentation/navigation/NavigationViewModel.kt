package xyz.shop.plan.presentation.navigation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import xyz.shop.plan.utils.firebase.FirebaseAuthProvider
import javax.inject.Inject

@HiltViewModel
class NavigationViewModel @Inject constructor(
    firebaseAuthProvider: FirebaseAuthProvider
) : ViewModel() {
    var isUserLoggedIn: Boolean by mutableStateOf(firebaseAuthProvider.isUserLoggedIn())
        private set
}
