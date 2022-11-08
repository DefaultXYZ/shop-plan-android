package xyz.shop.plan.utils.coroutines

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppDispatchers @Inject constructor() {
    val ui: CoroutineDispatcher = Dispatchers.Main
    val background: CoroutineDispatcher = Dispatchers.IO
}
