package id.lunartechno.moviehiltmodular.core.shared.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp

@Composable
fun RateComponent(progress: Float, size: Dp){
    Box(
        modifier = Modifier
            .size(size).clip(CircleShape).background(Color.Black),
        contentAlignment = Alignment.Center
    ) {
        CircularProgressIndicator(
            progress = progress, modifier = Modifier
                .size(size)
        )
        Text(
            text = (progress*10).toString().substring(0,3), style = TextStyle(color = Color.White)
        )
    }
}