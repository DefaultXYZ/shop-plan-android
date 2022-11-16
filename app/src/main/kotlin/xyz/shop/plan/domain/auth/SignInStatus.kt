package xyz.shop.plan.domain.auth

sealed class SignInStatus {
    sealed class Successful : SignInStatus() {
        object Success : Successful()
        object LoggedIn : Successful()
    }

    object NotDefined : SignInStatus()
    data class Failed(val exception: Throwable) : SignInStatus()
}
