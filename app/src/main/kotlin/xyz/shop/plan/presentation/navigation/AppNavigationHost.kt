package xyz.shop.plan.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import xyz.shop.plan.navigation.NavScreen
import xyz.shop.plan.presentation.plan.PlanScreen
import xyz.shop.plan.presentation.products.ProductsScreen
import xyz.shop.plan.presentation.profile.ProfileScreen
import xyz.shop.plan.presentation.splash.SplashScreen

@Composable
fun AppNavigationHost(
    modifier: Modifier = Modifier,
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = NavScreen.Splash.route,
        modifier = modifier
    ) {
        composable(NavScreen.Splash.route) {
            SplashScreen {
                navController.navigate(NavScreen.NavMain.route) {
                    popUpTo(navController.graph.findStartDestination().id) {
                        inclusive = true
                    }
                }
            }
        }

        navigation(
            startDestination = NavScreen.NavMain.PlanList.route,
            route = NavScreen.NavMain.route
        ) {
            composable(NavScreen.NavMain.PlanList.route) {
                PlanScreen(viewModel = hiltViewModel())
            }
            composable(NavScreen.NavMain.ProductList.route) {
                ProductsScreen(viewModel = hiltViewModel())
            }
            composable(NavScreen.NavMain.Profile.route) {
                ProfileScreen(viewModel = hiltViewModel())
            }
        }
    }
}
