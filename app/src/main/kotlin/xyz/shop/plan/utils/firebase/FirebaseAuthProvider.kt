package xyz.shop.plan.utils.firebase

import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.tasks.await
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FirebaseAuthProvider @Inject constructor(
    private val firebaseAuth: FirebaseAuth
) {

    fun isUserLoggedIn(): Boolean = firebaseAuth.currentUser != null

    fun isUserAnonymous(): Boolean = firebaseAuth.currentUser?.isAnonymous ?: true

    suspend fun signInAnonymously() {
        firebaseAuth.signInAnonymously().await()
    }
}
