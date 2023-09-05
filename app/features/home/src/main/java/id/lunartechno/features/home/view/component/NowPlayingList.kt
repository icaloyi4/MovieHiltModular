package id.lunartechno.features.home.view.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import id.lunartechno.moviehiltmodular.core.network.response.ResultMovie
import id.lunartechno.moviehiltmodular.core.ui.theme.h5
@Composable
fun NowPlayingList(value: List<ResultMovie>) {
    Column {
        Text(text = "Now Playing", style = h5)
        Spacer(modifier = Modifier.height(20.dp))
        LazyVerticalGrid(columns = GridCells.Fixed(count = 2)) {
            items(value) {
                CardItem(modifierCard = Modifier.fillMaxWidth(), it)
            }
        }
    }
}
