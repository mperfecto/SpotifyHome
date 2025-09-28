package com.example.spotifyhome.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.spotifyhome.R
import com.example.spotifyhome.viewModel.MainActivityVM
import com.example.spotifyhome.myComponents.Header
import com.example.spotifyhome.myComponents.PlaylistData
import com.example.spotifyhome.myComponents.RecentlyPlayedGrid
import com.example.spotifyhome.ui.theme.SpotifyHomeTheme

@Composable
fun SpotifyHome(vm: MainActivityVM) {

    val playlistsState by vm.playlists.observeAsState(initial = emptyList())

    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Header(stringResource(id = R.string.good_morning))
        RecentlyPlayedGrid(playlists = playlistsState)

        Spacer(modifier = Modifier.size(15.dp))

        Header(stringResource(id = R.string.made_for_you))


    }

}


@Preview
@Composable
fun SpotifyHomePreview() {

    val fakeVM = object : MainActivityVM() {
        init {
            playlists.value = listOf(
                (PlaylistData(name = "Playlist 1", img = R.drawable.playlist1, description = "Playlist de canciones que te gustan")),
                (PlaylistData(name = "Playlist 2", img = R.drawable.playlist2, description = "Playlist de canciones que te gustan")),
                (PlaylistData(name = "Playlist 3", img = R.drawable.playlist3, description = "Playlist de canciones que te gustan")),
                (PlaylistData(name = "Playlist 4", img = R.drawable.playlist4, description = "Playlist de canciones que te gustan")),
                (PlaylistData(name = "Playlist 5", img = R.drawable.playlist5, description = "Playlist de canciones que te gustan")),
                (PlaylistData(name = "Playlist 6", img = R.drawable.playlist6, description = "Playlist de canciones que te gustan")),
                (PlaylistData(name = "Playlist 7", img = R.drawable.playlist7, description = "Playlist de canciones que te gustan")),
                (PlaylistData(name = "Playlist 8", img = R.drawable.playlist8, description = "Playlist de canciones que te gustan"))
            )
        }
    }

    SpotifyHomeTheme {

        SpotifyHome(fakeVM)

    }
}