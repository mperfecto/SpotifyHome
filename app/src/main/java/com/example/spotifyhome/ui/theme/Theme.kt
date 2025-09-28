package com.example.spotifyhome.ui.theme

import android.os.Build
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext


private val SpotifyColorScheme = darkColorScheme(
    primary = SpotifyGreen,
    secondary = SpotifyDarkGray,
    background = SpotifyBlack,
    surface = SpotifyDarkGray,
    onPrimary = SpotifyBlack,
    onSecondary = SpotifyWhite,
    onBackground = SpotifyWhite,
    onSurface = SpotifyWhite
)

@Composable
fun SpotifyHomeTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = SpotifyColorScheme,
        typography = Typography,
        content = content
    )
}