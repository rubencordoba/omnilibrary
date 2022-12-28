package com.rubencordoba.omnilibrary

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.rubencordoba.omnilibrary.features.bookdetails.OmniBookDetailsScreen
import com.rubencordoba.omnilibrary.features.error.OmniErrorScreen
import com.rubencordoba.omnilibrary.features.info.OmniInfoScreen
import com.rubencordoba.omnilibrary.features.main.OmniMainScreen
import com.rubencordoba.omnilibrary.features.searchlist.OmniSearchListScreen
import com.rubencordoba.omnilibrary.ui.theme.OmniLibraryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val navController = rememberNavController()

            OmniLibraryTheme {
                NavigationComponent(navController)
            }
        }

    }
}

@Composable
fun NavigationComponent(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "main") {
        composable("main") {
            OmniMainScreen(viewModel = viewModel(), navController = navController)
        }
        composable("searchlist") {
            OmniSearchListScreen(viewModel = viewModel(), navController = navController)
        }
        composable("bookdetails") {
            OmniBookDetailsScreen(viewModel = viewModel(), navController = navController)
        }
        composable("info") {
            OmniInfoScreen(navController = navController)
        }
        composable("error") {
            OmniErrorScreen(viewModel = viewModel(), navController = navController)
        }
    }
}