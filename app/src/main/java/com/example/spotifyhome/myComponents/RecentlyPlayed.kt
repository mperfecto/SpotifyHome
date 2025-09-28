package com.example.spotifyhome.myComponents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.spotifyhome.R

class PlaylistData(val name: String, val img: Int, val description: String)

@Composable
fun RecentlyPlayedGrid(playlists: List<PlaylistData>, modifier: Modifier = Modifier) {

    Box(modifier = Modifier
        .padding(start = 8.dp, top = 8.dp, bottom = 8.dp, end = 24.dp)
        ) {
        Column(
            modifier = Modifier,
            verticalArrangement = Arrangement.spacedBy(7.dp)
        ) {
            for (i in playlists.indices step 2) {
                Row(
                    modifier = Modifier,
                    horizontalArrangement = Arrangement.spacedBy(6.dp)
                ) {

                    PlaylistCard(
                        playlist = playlists[i],
                        modifier = Modifier.weight(1f)
                    )



                    if (i + 1 < playlists.size) {

                        PlaylistCard(
                            playlist = playlists[i + 1],
                            modifier = Modifier.weight(1f)
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

    playlists.add(PlaylistData(name = "Canciones que te gustan", img = R.drawable.playlist1, description = "Playlist de canciones que te gustan"))
    playlists.add(PlaylistData(name = "Playlist 2", img = R.drawable.playlist2, description = "Playlist de canciones que te gustan"))
    playlists.add(PlaylistData(name = "Playlist 3", img = R.drawable.playlist3, description = "Playlist de canciones que te gustan"))
    playlists.add(PlaylistData(name = "Playlist 4", img = R.drawable.playlist4, description = "Playlist de canciones que te gustan"))
    playlists.add(PlaylistData(name = "Playlist 5", img = R.drawable.playlist5, description = "Playlist de canciones que te gustan"))
    playlists.add(PlaylistData(name = "Playlist 6", img = R.drawable.playlist6, description = "Playlist de canciones que te gustan"))
    playlists.add(PlaylistData(name = "Playlist 7", img = R.drawable.playlist7, description = "Playlist de canciones que te gustan"))
    playlists.add(PlaylistData(name = "Playlist 8", img = R.drawable.playlist8, description = "Playlist de canciones que te gustan"))

    RecentlyPlayedGrid(playlists)
}