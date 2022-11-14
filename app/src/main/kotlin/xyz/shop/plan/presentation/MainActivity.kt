package xyz.shop.plan.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import xyz.shop.plan.navigation.AsBottomBarScreen
import xyz.shop.plan.navigation.AsFloatingActionButtonScreen
import xyz.shop.plan.navigation.AsToolbarScreen
import xyz.shop.plan.presentation.navigation.AppNavigationHost
import xyz.shop.plan.presentation.navigation.BottomBar
import xyz.shop.plan.presentation.toolbar.AppToolbar
import xyz.shop.plan.ui.theme.ShopPlanTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()

            val backStackEntryState by navController.currentBackStackEntryAsState()
            val destination = backStackEntryState?.destination
            ShopPlanTheme {
                Scaffold(
                    topBar = {
                        destination?.AsToolbarScreen {
                            AppToolbar(stringResource(toolbarTitleRes))
                        }
                    },
                    bottomBar = {
                        destination?.AsBottomBarScreen {
                            BottomBar(navController = navController)
                        }
                    },
                    floatingActionButton = {
                        destination?.AsFloatingActionButtonScreen {
                            FloatingActionButton(onClick = {
                                navController.navigate(navigationScreen.route)
                            }) {
                                Icon(fabIcon, contentDescription = null)
                            }
                        }
                    }
                ) { innerPadding ->
                    AppNavigationHost(
                        navController = navController,
                        viewModel = hiltViewModel(),
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
