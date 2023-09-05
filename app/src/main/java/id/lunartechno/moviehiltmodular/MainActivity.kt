package id.lunartechno.moviehiltmodular

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import id.lunartechno.moviehiltmodular.core.ui.theme.MovieHiltModularTheme
import id.lunartechno.moviehiltmodular.routes.NavigationGraph

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @ExperimentalLayoutApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MovieHiltModularTheme {
                // A surface container using the 'background' color from the theme
                RootScreen()
            }
        }
    }
}

@ExperimentalLayoutApi
@Composable
fun RootScreen() {
    val navController = rememberNavController()
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        NavigationGraph(navController = navController)
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MovieHiltModularTheme {
        RootScreen()
    }
}