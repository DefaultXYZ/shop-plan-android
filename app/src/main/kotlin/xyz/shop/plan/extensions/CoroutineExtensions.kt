package xyz.shop.plan.extensions

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlin.coroutines.CoroutineContext

inline fun CoroutineDispatcher.withExceptionHandler(crossinline handler: (Throwable) -> Unit): CoroutineContext =
    this + CoroutineExceptionHandler { _, throwable -> handler(throwable) }
