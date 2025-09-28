package com.example.spotifyhome.pages

import androidx.compose.runtime.Composable
import com.example.spotifyhome.viewModel.MainActivityVM

@Composable
fun SpotifyHome(vm: MainActivityVM) {

    val playlistsState by vm.playlists.observeAsState(initial = emptyList())

}