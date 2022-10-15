package xyz.shop.plan.ui

import androidx.compose.ui.graphics.vector.ImageVector

data class BottomBarIcon(
    val icon: ImageVector,
    val selectedIcon: ImageVector = icon
) {
    fun provideIcon(isSelected: Boolean) = if (isSelected) selectedIcon else icon
}
