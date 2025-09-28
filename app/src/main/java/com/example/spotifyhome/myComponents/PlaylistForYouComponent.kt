package com.example.spotifyhome.myComponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.spotifyhome.R
import com.example.spotifyhome.ui.theme.SpotifyHomeTheme

@Composable
fun PlaylistForYou(playlist: PlaylistData, modifier: Modifier = Modifier) {

    Box(
        modifier = modifier
            .width(100.dp)
            .height(160.dp)
            .background(MaterialTheme.colorScheme.background)
    ) {
        Column(
            horizontalAlignment = Alignment.Start
        ) {
            Image(
                painter = painterResource(id = playlist.img),
                modifier = Modifier
                    .size(100.dp),
                contentDescription = playlist.name
            )

            Text(
                text = playlist.name,
                color = MaterialTheme.colorScheme.onSurface,
                fontWeight = FontWeight.Bold,
                fontSize = 9.sp,
                modifier = Modifier
            )

            Text(
                text = playlist.description,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                fontWeight = FontWeight.Bold,
                fontSize = 8.sp,
                lineHeight = 12.sp,
                modifier = Modifier
            )
        }
    }
}


@Preview
@Composable
fun PlaylistForYouPreview() {

    SpotifyHomeTheme {
        PlaylistForYou(
            playlist = PlaylistData(
                name = "On Repeat",
                img = R.drawable.playlist1,
                description = "Playlist de canciones que te gustan"
            )
        )
    }
}