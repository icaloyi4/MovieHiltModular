package id.lunartechno.features.home.view

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import id.lunartechno.features.home.view.component.NowPlayingList
import id.lunartechno.features.home.view.component.TopRatedList
import id.lunartechno.features.home.viewmodel.HomeViewModel

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(navController: NavController){
    val mv: HomeViewModel = hiltViewModel()
    Scaffold(modifier = Modifier.padding(15.dp)) {
        Column {
            TopRatedList(mv.topRatedList.value)
            Spacer(modifier = Modifier.height(20.dp))
            NowPlayingList(mv.nowPlayingList.value)
        }
    }
}