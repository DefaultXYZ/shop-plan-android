package xyz.shop.plan.utils.logging

import timber.log.Timber

fun logVerbose(throwable: Throwable, message: String? = null) {
    Timber.v(throwable, message)
}

fun logVerbose(message: String) {
    Timber.v(message)
}

fun logDebug(throwable: Throwable, message: String? = null) {
    Timber.d(throwable, message)
}

fun logDebug(message: String) {
    Timber.d(message)
}

fun logInfo(throwable: Throwable, message: String? = null) {
    Timber.i(throwable, message)
}

fun logInfo(message: String) {
    Timber.i(message)
}

fun logWarning(throwable: Throwable, message: String? = null) {
    Timber.e(throwable, message)
}

fun logWarning(message: String) {
    Timber.e(message)
}

fun logError(throwable: Throwable, message: String? = null) {
    Timber.e(throwable, message)
}

fun logError(message: String) {
    Timber.e(message)
}
