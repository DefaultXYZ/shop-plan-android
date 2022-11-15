package xyz.shop.plan.navigation

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavDestination
import xyz.shop.plan.R
import xyz.shop.plan.ui.BottomBarIcon

fun NavDestination.findScreen(): NavScreen? = screens.find { it.route == route }

@Composable
fun NavDestination.AsToolbarScreen(body: @Composable ToolbarScreen.() -> Unit) =
    (findScreen() as? ToolbarScreen)?.let { body(it) }

@Composable
fun NavDestination.AsBottomBarScreen(body: @Composable BottomBarScreen.() -> Unit) =
    (findScreen() as? BottomBarScreen)?.let { body(it) }

@Composable
fun NavDestination.AsFloatingActionButtonScreen(body: @Composable FloatingActionButtonScreen.() -> Unit) =
    (findScreen() as? FloatingActionButtonScreen)?.let { body(it) }

val screens = setOf(
    NavScreen.NavMain.PlanList,
    NavScreen.NavMain.ProductList,
    NavScreen.NavMain.Profile,
    NavScreen.Splash,
    NavScreen.CreatePlan
)

val mainScreens = setOf(
    NavScreen.NavMain.PlanList,
    NavScreen.NavMain.ProductList,
    NavScreen.NavMain.Profile
)

sealed class NavScreen(
    private val finalRoute: String,
    private val navigationRoute: String? = null
) {

    sealed class NavMain(
        route: String,
        @StringRes override val toolbarTitleRes: Int,
        @StringRes override val bottomBarTitleRes: Int,
        override val icon: BottomBarIcon
    ) : NavScreen(route, NavMain.route), BottomBarScreen, ToolbarScreen {
        companion object {
            const val route = NavPath.main
        }

        object PlanList : NavMain(
            route = NavPath.planList,
            toolbarTitleRes = R.string.toolbar_plan_list,
            bottomBarTitleRes = R.string.nav_plan_list,
            icon = BottomBarIcon(
                icon = Icons.Outlined.Edit,
                selectedIcon = Icons.Filled.Edit
            )
        ), FloatingActionButtonScreen {
            override val navigationScreen: NavScreen = CreatePlan
            override val fabIcon: ImageVector = Icons.Outlined.Add
        }

        object ProductList : NavMain(
            route = NavPath.productList,
            toolbarTitleRes = R.string.toolbar_product_list,
            bottomBarTitleRes = R.string.nav_product_list,
            icon = BottomBarIcon(
                icon = Icons.Outlined.ShoppingCart,
                selectedIcon = Icons.Filled.ShoppingCart
            )
        )

        object Profile : NavMain(
            route = NavPath.profile,
            toolbarTitleRes = R.string.toolbar_profile,
            bottomBarTitleRes = R.string.nav_profile,
            icon = BottomBarIcon(
                icon = Icons.Outlined.Person,
                selectedIcon = Icons.Filled.Person
            )
        )
    }

    object Splash : NavScreen(NavPath.splash)

    object CreatePlan : NavScreen(NavPath.createPlan), ToolbarScreen {
        override val toolbarTitleRes: Int = R.string.toolbar_create_plan
        override val displayNavigateUpIcon: Boolean = true
    }

    val route: String
        get() = listOfNotNull(navigationRoute, finalRoute).joinToString(separator = "")
}

interface BottomBarScreen {
    val bottomBarTitleRes: Int
    val icon: BottomBarIcon
}

interface ToolbarScreen {
    val toolbarTitleRes: Int
    val displayNavigateUpIcon: Boolean
        get() = false
}

interface FloatingActionButtonScreen {
    val fabIcon: ImageVector
    val navigationScreen: NavScreen
}
