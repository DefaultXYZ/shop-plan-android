package xyz.shop.plan.presentation.plan.create

import dagger.hilt.android.lifecycle.HiltViewModel
import xyz.shop.plan.base.BaseViewModel
import xyz.shop.plan.utils.coroutines.AppDispatchers
import javax.inject.Inject

@HiltViewModel
class CreatePlanViewModel @Inject constructor(
    dispatchers: AppDispatchers
) : BaseViewModel(dispatchers)
