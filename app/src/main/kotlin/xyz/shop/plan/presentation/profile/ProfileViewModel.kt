package xyz.shop.plan.presentation.profile

import dagger.hilt.android.lifecycle.HiltViewModel
import xyz.shop.plan.base.BaseViewModel
import xyz.shop.plan.utils.coroutines.AppDispatchers
import javax.inject.Inject

@HiltViewModel
class ProfileViewModel @Inject constructor(
    dispatchers: AppDispatchers
) : BaseViewModel(dispatchers)
