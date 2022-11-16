package xyz.shop.plan.presentation.plan

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import dagger.hilt.android.lifecycle.HiltViewModel
import xyz.shop.plan.base.BaseViewModel
import xyz.shop.plan.utils.coroutines.AppDispatchers
import javax.inject.Inject

@HiltViewModel
class PlanViewModel @Inject constructor(
    dispatchers: AppDispatchers
) : BaseViewModel(dispatchers) {
    var items: List<PlanListItem> by mutableStateOf(emptyList())
        private set
}
