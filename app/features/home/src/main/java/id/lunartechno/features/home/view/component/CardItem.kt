package id.lunartechno.features.home.view.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import coil.compose.SubcomposeAsyncImage
import id.lunartechno.moviehiltmodular.core.network.baseImageUrl
import id.lunartechno.moviehiltmodular.core.network.imageSizeW342
import id.lunartechno.moviehiltmodular.core.network.response.ResultMovie
import id.lunartechno.moviehiltmodular.core.shared.component.RateComponent
import id.lunartechno.moviehiltmodular.core.ui.theme.h6
import id.lunartechno.moviehiltmodular.core.ui.theme.subtitle2

@Composable
fun CardItem(modifierCard: Modifier, resultMovie: ResultMovie){
    Box(modifier = Modifier.padding(end = 10.dp, bottom = 10.dp)) {
        Card(modifier = modifierCard) {
            BoxWithConstraints(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp)
            ) {
                SubcomposeAsyncImage(
                    model = "$baseImageUrl$imageSizeW342${resultMovie.posterPath}",
                    contentDescription = null,
                    modifier = Modifier.height(250.dp),
                    contentScale = ContentScale.FillWidth
                )
                Box(modifier = Modifier.offset(5.dp, 180.dp)) {
                    RateComponent(progress = (resultMovie.voteAverage?:0).toFloat().div(10), size = 65.dp)
                }


            }
            Column(modifier = Modifier.padding(10.dp)) {
                Text(text = "${resultMovie.title}", style = h6,  maxLines = 1, overflow = TextOverflow.Ellipsis)
                Text(text = "${resultMovie.releaseDate}", style = subtitle2)
            }
        }
    }
}