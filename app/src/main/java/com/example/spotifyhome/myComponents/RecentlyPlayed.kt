package com.example.spotifyhome.myComponents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.spotifyhome.R

class PlaylistData(var name: String, var img: Int)

@Composable
fun RecentlyPlayedGrid(playlists: List<PlaylistData>) {

    Box(modifier = Modifier.padding(8.dp)) {
        Column(
            modifier = Modifier,
            verticalArrangement = Arrangement.spacedBy(6.dp)
        ) {
            for (i in playlists.indices step 2) {
                Row(
                    modifier = Modifier,
                    horizontalArrangement = Arrangement.spacedBy(15.dp)
                ) {

                    PlaylistCard(
                        texto = playlists[i].name,
                        img = playlists[i].img,
                        modifier = Modifier.weight(1f)
                    )



                    if (i + 1 < playlists.size) {

                        PlaylistCard(
                            texto = playlists[i + 1].name, img = playlists[i + 1].img
                        )
                    }
                }
            }
        }
    }
}


@Preview
@Composable
fun RecentlyPlayedPreview() {
    val playlists = ArrayList<PlaylistData>()

    playlists.add(PlaylistData(name = "Today's Top Hits", img = R.drawable.cinta))
    playlists.add(PlaylistData(name = "Canciones que te gustan", img = R.drawable.cinta))
    playlists.add(PlaylistData(name = "Pop", img = R.drawable.cinta))
    playlists.add(PlaylistData(name = "Today's Top Hits", img = R.drawable.cinta))
    playlists.add(PlaylistData(name = "Canciones que te gustan", img = R.drawable.cinta))
    playlists.add(PlaylistData(name = "Pop", img = R.drawable.cinta))
    playlists.add(PlaylistData(name = "Today's Top Hits", img = R.drawable.cinta))
    playlists.add(PlaylistData(name = "Canciones que te gustan", img = R.drawable.cinta))

    RecentlyPlayedGrid(playlists)
}