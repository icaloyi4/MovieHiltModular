package id.lunartechno.features.home.view.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import id.lunartechno.moviehiltmodular.core.network.response.ResultMovie
import id.lunartechno.moviehiltmodular.core.ui.theme.h5

@Composable
fun TopRatedList(value: List<ResultMovie>) {
    Column {
        Text(text = "Top Rated", style = h5)
        Spacer(modifier = Modifier.height(20.dp))
        LazyRow() {
            items(value){
                CardItem(modifierCard = Modifier.width(200.dp), it)
            }
        }
    }
}
