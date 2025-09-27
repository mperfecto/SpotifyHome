package com.example.spotifyhome.repo

import com.example.spotifyhome.myComponents.PlaylistData

interface IPlaylistsRepo {

    fun addPlaylist(playlist: PlaylistData): PlaylistData
    fun getPlaylists(): List<PlaylistData>
}