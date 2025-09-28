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
            .width(200.dp)
            .height(320.dp)
            .padding(8.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.Start,
            modifier = Modifier

        ) {
            Image(
                painter = painterResource(id = playlist.img),
                modifier = Modifier
                    .size(184.dp),
                contentDescription = playlist.name,
                alignment = Alignment.TopStart
            )

            Text(
                text = playlist.name,
                color = MaterialTheme.colorScheme.onSurface,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                modifier = Modifier
                    .padding(top = 10.dp, bottom = 10.dp)
            )

            Text(
                text = playlist.description,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                lineHeight = 27.sp,
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