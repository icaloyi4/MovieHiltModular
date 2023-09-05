package id.lunartechno.moviehiltmodular.routes

import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import id.lunartechno.features.home.view.HomeScreen
import id.lunartechno.moviehiltmodular.core.routes.RoutesModel

@ExperimentalLayoutApi
@Composable
fun NavigationGraph(navController: NavHostController) {

    NavHost(navController = navController, startDestination = RoutesModel.home) {
        composable(RoutesModel.home) {
            HomeScreen(navController)
        }
    }
}