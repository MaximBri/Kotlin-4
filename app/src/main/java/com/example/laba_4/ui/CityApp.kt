package com.example.laba_4.ui

import androidx.activity.ComponentActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ChildCare
import androidx.compose.material.icons.filled.Coffee
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Park
import androidx.compose.material.icons.filled.Restaurant
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingBag
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.PermanentDrawerSheet
import androidx.compose.material3.PermanentNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberDrawerState
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavBackStackEntry
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import com.example.laba_4.R
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.laba_4.data.DataSource
import com.example.laba_4.ui.navigation.AppNavHost
import com.example.laba_4.ui.navigation.Screen
import com.example.laba_4.ui.viewmodel.CityViewModel
import kotlinx.coroutines.launch

import androidx.annotation.StringRes

private data class BottomNavItem(
    val categoryId: String,
    @StringRes val labelResId: Int,
    val icon: ImageVector
)

private val bottomNavItems = listOf(
    BottomNavItem("coffee", R.string.nav_coffee, Icons.Filled.Coffee),
    BottomNavItem("restaurants", R.string.nav_restaurants, Icons.Filled.Restaurant),
    BottomNavItem("parks", R.string.nav_parks, Icons.Filled.Park),
    BottomNavItem("shopping", R.string.nav_shopping, Icons.Filled.ShoppingBag),
    BottomNavItem("kids", R.string.nav_kids, Icons.Filled.ChildCare)
)

@OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
@Composable
fun CityApp(activity: ComponentActivity) {
    val windowSizeClass = calculateWindowSizeClass(activity)
    val isExpanded = windowSizeClass.widthSizeClass == WindowWidthSizeClass.Expanded

    val navController = rememberNavController()
    val viewModel: CityViewModel = viewModel()

    if (isExpanded) {
        ExpandedLayout(navController = navController, viewModel = viewModel)
    } else {
        CompactLayout(navController = navController, viewModel = viewModel)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun ExpandedLayout(
    navController: NavHostController,
    viewModel: CityViewModel
) {
    val currentEntry by navController.currentBackStackEntryAsState()
    val currentRoute = currentEntry?.destination?.route
    val currentCategoryId = currentEntry?.arguments?.getString("categoryId")

    PermanentNavigationDrawer(
        drawerContent = {
            PermanentDrawerSheet(modifier = Modifier.width(dimensionResource(R.dimen.drawer_width))) {
                DrawerContent(
                    currentRoute = currentRoute,
                    currentCategoryId = currentCategoryId,
                    onCategoryClick = { id ->
                        viewModel.selectCategory(id)
                        navController.navigate(Screen.Category.createRoute(id))
                    },
                    onAboutClick = { navController.navigate(Screen.About.route) },
                    onSettingsClick = { navController.navigate(Screen.Settings.route) }
                )
            }
        }
    ) {
        val canNavigateBack = isDetailRoute(currentRoute)
        Scaffold(
            topBar = {
                CityTopAppBar(
                    title = getScreenTitle(currentRoute, currentEntry),
                    showHamburger = false,
                    onMenuClick = {},
                    canNavigateBack = canNavigateBack,
                    onBackClick = { navController.popBackStack() }
                )
            }
        ) { innerPadding ->
            AppNavHost(
                navController = navController,
                viewModel = viewModel,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun CompactLayout(
    navController: NavHostController,
    viewModel: CityViewModel
) {
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    val currentEntry by navController.currentBackStackEntryAsState()
    val currentRoute = currentEntry?.destination?.route
    val currentCategoryId = currentEntry?.arguments?.getString("categoryId")

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet {
                DrawerContent(
                    currentRoute = currentRoute,
                    currentCategoryId = currentCategoryId,
                    onCategoryClick = { id ->
                        viewModel.selectCategory(id)
                        navController.navigate(Screen.Category.createRoute(id))
                        scope.launch { drawerState.close() }
                    },
                    onAboutClick = {
                        navController.navigate(Screen.About.route)
                        scope.launch { drawerState.close() }
                    },
                    onSettingsClick = {
                        navController.navigate(Screen.Settings.route)
                        scope.launch { drawerState.close() }
                    }
                )
            }
        }
    ) {
        val canNavigateBack = isDetailRoute(currentRoute)
        Scaffold(
            topBar = {
                CityTopAppBar(
                    title = getScreenTitle(currentRoute, currentEntry),
                    showHamburger = !canNavigateBack,
                    onMenuClick = { scope.launch { drawerState.open() } },
                    canNavigateBack = canNavigateBack,
                    onBackClick = { navController.popBackStack() }
                )
            },
            bottomBar = {
                CityBottomNavBar(
                    navController = navController,
                    viewModel = viewModel,
                    currentRoute = currentRoute,
                    currentCategoryId = currentCategoryId
                )
            }
        ) { innerPadding ->
            AppNavHost(
                navController = navController,
                viewModel = viewModel,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
            )
        }
    }
}

@Composable
private fun DrawerContent(
    currentRoute: String?,
    currentCategoryId: String?,
    onCategoryClick: (String) -> Unit,
    onAboutClick: () -> Unit,
    onSettingsClick: () -> Unit
) {
    Column {
        Column(modifier = Modifier.padding(dimensionResource(R.dimen.spacing_lg))) {
            Text(
                text = stringResource(R.string.drawer_city_name),
                style = MaterialTheme.typography.headlineSmall,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary
            )
            Text(
                text = stringResource(R.string.drawer_city_subtitle),
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }

        HorizontalDivider(modifier = Modifier.padding(horizontal = dimensionResource(R.dimen.spacing_lg)))
        Spacer(modifier = Modifier.height(dimensionResource(R.dimen.spacing_sm)))

        Text(
            text = stringResource(R.string.drawer_section_categories),
            style = MaterialTheme.typography.labelSmall,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            modifier = Modifier.padding(
                horizontal = dimensionResource(R.dimen.spacing_xxxl),
                vertical = dimensionResource(R.dimen.spacing_xs)
            )
        )

        DataSource.categories.forEach { category ->
            NavigationDrawerItem(
                icon = { Icon(imageVector = category.icon, contentDescription = null) },
                label = { Text(stringResource(category.nameResId)) },
                selected = currentRoute == Screen.Category.route && currentCategoryId == category.id,
                onClick = { onCategoryClick(category.id) },
                modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding)
            )
        }

        Spacer(modifier = Modifier.height(dimensionResource(R.dimen.spacing_sm)))
        HorizontalDivider(modifier = Modifier.padding(horizontal = dimensionResource(R.dimen.spacing_lg)))
        Spacer(modifier = Modifier.height(dimensionResource(R.dimen.spacing_sm)))

        Text(
            text = stringResource(R.string.drawer_section_other),
            style = MaterialTheme.typography.labelSmall,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            modifier = Modifier.padding(
                horizontal = dimensionResource(R.dimen.spacing_xxxl),
                vertical = dimensionResource(R.dimen.spacing_xs)
            )
        )

        NavigationDrawerItem(
            icon = { Icon(Icons.Filled.Info, contentDescription = null) },
            label = { Text(stringResource(R.string.drawer_about)) },
            selected = currentRoute == Screen.About.route,
            onClick = onAboutClick,
            modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding)
        )

        NavigationDrawerItem(
            icon = { Icon(Icons.Filled.Settings, contentDescription = null) },
            label = { Text(stringResource(R.string.drawer_settings)) },
            selected = currentRoute == Screen.Settings.route,
            onClick = onSettingsClick,
            modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding)
        )
    }
}

@Composable
private fun CityBottomNavBar(
    navController: NavHostController,
    viewModel: CityViewModel,
    currentRoute: String?,
    currentCategoryId: String?,
    modifier: Modifier = Modifier
) {
    NavigationBar(modifier = modifier) {
        bottomNavItems.forEach { item ->
            val route = Screen.Category.createRoute(item.categoryId)
            NavigationBarItem(
                icon = { Icon(item.icon, contentDescription = stringResource(item.labelResId)) },
                label = { Text(stringResource(item.labelResId)) },
                selected = currentRoute == Screen.Category.route && currentCategoryId == item.categoryId,
                onClick = {
                    viewModel.selectCategory(item.categoryId)
                    navController.navigate(route)
                }
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun CityTopAppBar(
    title: String,
    showHamburger: Boolean,
    onMenuClick: () -> Unit,
    canNavigateBack: Boolean = false,
    onBackClick: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    TopAppBar(
        title = { Text(text = title) },
        navigationIcon = {
            when {
                canNavigateBack -> IconButton(onClick = onBackClick) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = stringResource(R.string.cd_back)
                    )
                }
                showHamburger -> IconButton(onClick = onMenuClick) {
                    Icon(
                        imageVector = Icons.Filled.Menu,
                        contentDescription = stringResource(R.string.cd_open_menu)
                    )
                }
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            titleContentColor = MaterialTheme.colorScheme.onPrimaryContainer,
            navigationIconContentColor = MaterialTheme.colorScheme.onPrimaryContainer
        ),
        modifier = modifier
    )
}

private fun isDetailRoute(route: String?): Boolean = route != null && (
    route == Screen.Detail.route ||
    route == Screen.About.route ||
    route == Screen.Settings.route
)

@Composable
private fun getScreenTitle(route: String?, currentEntry: NavBackStackEntry?): String {
    return when (route) {
        Screen.Home.route -> stringResource(R.string.screen_home)
        Screen.Category.route -> {
            val categoryId = currentEntry?.arguments?.getString("categoryId") ?: ""
            val category = DataSource.getCategory(categoryId)
            if (category != null) stringResource(category.nameResId) else ""
        }
        Screen.Detail.route -> stringResource(R.string.screen_detail)
        Screen.About.route -> stringResource(R.string.screen_about)
        Screen.Settings.route -> stringResource(R.string.screen_settings)
        else -> stringResource(R.string.app_name)
    }
}
