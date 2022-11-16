package xyz.shop.plan.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import xyz.shop.plan.extensions.withExceptionHandler
import xyz.shop.plan.utils.coroutines.AppDispatchers
import xyz.shop.plan.utils.logging.logError

abstract class BaseViewModel(
    private val dispatchers: AppDispatchers
) : ViewModel() {

    protected fun launchInBackground(
        onError: (Throwable) -> Unit = {},
        block: suspend CoroutineScope.() -> Unit
    ) {
        viewModelScope.launch(dispatchers.background.withExceptionHandler {
            logError(it)
            onError(it)
        }, block = block)
    }

}
