package com.example.spotifyhome.myComponents

import com.example.spotifyhome.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.spotifyhome.ui.theme.SpotifyHomeTheme


@Composable
fun PlaylistCard(playlist: PlaylistData, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .background(MaterialTheme.colorScheme.surface, shape = RoundedCornerShape(percent = 7))
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically

        ) {

            Image(
                painter = painterResource(id = playlist.img),
                modifier = Modifier
                    .size(45.dp)
                    .clip(RoundedCornerShape(percent = 10)),
                contentDescription = playlist.name
            )

            Text(
                text = playlist.name,
                color = MaterialTheme.colorScheme.onSurface,
                fontWeight = FontWeight.Bold,
                fontSize = 13.sp,
                modifier = Modifier
                    .padding(start = 8.dp, end = 8.dp)
            )
        }
    }
}


@Preview(showBackground = false)
@Composable
fun PlaylistCardPreview() {

    SpotifyHomeTheme {
        PlaylistCard(
            playlist = PlaylistData(
                name = "Canciones que te gustan",
                img = R.drawable.cinta,
                description =  "Playlist de canciones que te gustan"))
    }
}