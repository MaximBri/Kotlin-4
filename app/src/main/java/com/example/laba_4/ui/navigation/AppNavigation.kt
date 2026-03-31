package com.example.laba_4.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.laba_4.ui.screens.AboutScreen
import com.example.laba_4.ui.screens.CategoryScreen
import com.example.laba_4.ui.screens.DetailScreen
import com.example.laba_4.ui.screens.HomeScreen
import com.example.laba_4.ui.screens.SettingsScreen
import com.example.laba_4.ui.viewmodel.CityViewModel

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Category : Screen("category/{categoryId}") {
        fun createRoute(categoryId: String) = "category/$categoryId"
    }
    object Detail : Screen("detail/{recommendationId}") {
        fun createRoute(recommendationId: String) = "detail/$recommendationId"
    }
    object About : Screen("about")
    object Settings : Screen("settings")
}

@Composable
fun AppNavHost(
    navController: NavHostController,
    viewModel: CityViewModel,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route,
        modifier = modifier
    ) {
        composable(Screen.Home.route) {
            HomeScreen(
                onCategoryClick = { categoryId ->
                    viewModel.selectCategory(categoryId)
                    navController.navigate(Screen.Category.createRoute(categoryId))
                }
            )
        }

        composable(
            route = Screen.Category.route,
            arguments = listOf(
                navArgument("categoryId") { type = NavType.StringType }
            )
        ) { backStackEntry ->
            val categoryId = backStackEntry.arguments?.getString("categoryId") ?: "coffee"
            CategoryScreen(
                categoryId = categoryId,
                onRecommendationClick = { recommendationId ->
                    navController.navigate(Screen.Detail.createRoute(recommendationId))
                },
                onBackClick = { navController.popBackStack() }
            )
        }

        composable(
            route = Screen.Detail.route,
            arguments = listOf(
                navArgument("recommendationId") { type = NavType.StringType }
            )
        ) { backStackEntry ->
            val recommendationId = backStackEntry.arguments?.getString("recommendationId") ?: ""
            DetailScreen(
                recommendationId = recommendationId,
                onBackClick = { navController.popBackStack() }
            )
        }

        composable(Screen.About.route) {
            AboutScreen(onBackClick = { navController.popBackStack() })
        }

        composable(Screen.Settings.route) {
            SettingsScreen(onBackClick = { navController.popBackStack() })
        }
    }
}
