package id.lunartechno.moviehiltmodular.core.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )

    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)

val h1 : TextStyle = TextStyle (
    fontWeight = FontWeight.Bold,
    fontSize = 96.sp,
    letterSpacing = (-1.5).sp
)
val h2: TextStyle = TextStyle(
    fontWeight = FontWeight.Bold,
    fontSize = 60.sp,
    letterSpacing = (-0.5).sp
)
val h3 = TextStyle(
    fontWeight = FontWeight.Bold,
    fontSize = 48.sp,
    letterSpacing = 0.sp
)
val h4 = TextStyle(
    fontWeight = FontWeight.Bold,
    fontSize = 34.sp,
    letterSpacing = 0.25.sp
)
val h5 = TextStyle(
    fontWeight = FontWeight.Bold,
    fontSize = 24.sp,
    letterSpacing = 0.sp
)
val h6 = TextStyle(
    fontWeight = FontWeight.Bold,
    fontSize = 20.sp,
    letterSpacing = 0.15.sp
)
val subtitle1 = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = 16.sp,
    letterSpacing = 0.15.sp
)
val subtitle2 = TextStyle(
    fontWeight = FontWeight.Light,
    fontSize = 14.sp,
    letterSpacing = 0.1.sp
)
val body1 = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = 16.sp,
    letterSpacing = 0.5.sp
)
val body2 = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = 14.sp,
    letterSpacing = 0.25.sp
)
val button = TextStyle(
    fontWeight = FontWeight.Medium,
    fontSize = 14.sp,
    letterSpacing = 1.25.sp
)
val caption = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = 12.sp,
    letterSpacing = 0.4.sp
)
val overline = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = 10.sp,
    letterSpacing = 1.5.sp
)