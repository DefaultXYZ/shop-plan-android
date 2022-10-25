package xyz.shop.plan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import xyz.shop.plan.navigation.AsBottomBarScreen
import xyz.shop.plan.navigation.AsToolbarScreen
import xyz.shop.plan.presentation.AppNavigationHost
import xyz.shop.plan.presentation.AppToolbar
import xyz.shop.plan.presentation.BottomBar
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
                    }
                ) { innerPadding ->
                    AppNavigationHost(
                        navController = navController,
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
