package com.example.spotifyhome.myComponents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.spotifyhome.R
import com.example.spotifyhome.ui.theme.SpotifyHomeTheme

@Composable
fun MadeForYouCarousel(playlists: List<PlaylistData>, modifier: Modifier = Modifier) {

    LazyRow(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(5.dp),
        content = {
            items(playlists) { playlist ->
                PlaylistForYou(playlist = playlist)
            }
        }
    )
}


@Preview
@Composable
fun MadeForYouCarouselPreview() {

    val samplePlaylists = listOf(
        PlaylistData(name = "Playlist 1", img = R.drawable.playlist1, description = "Playlist de canciones que te gustan"),
        PlaylistData(name = "Playlist 2", img = R.drawable.playlist2, description = "Playlist de canciones que te gustan"),
        PlaylistData(name = "Playlist 3", img = R.drawable.playlist3, description = "Playlist de canciones que te gustan"),
    )

    SpotifyHomeTheme {
        MadeForYouCarousel(samplePlaylists)

    }

}