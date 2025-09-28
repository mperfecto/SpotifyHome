package com.example.spotifyhome.repo

import com.example.spotifyhome.R
import com.example.spotifyhome.myComponents.PlaylistData

class PlaylistsRepo : IPlaylistsRepo {
    val playlistMock = ArrayList<PlaylistData>()

    override fun addPlaylist(playlist: PlaylistData): PlaylistData {
        playlistMock.add(playlist)
        return playlist
    }

    override fun getPlaylists(): List<PlaylistData> {
        return playlistMock
    }

    init {
        playlistMock.add(PlaylistData(name = "Playlist 1", img = R.drawable.playlist1))
        playlistMock.add(PlaylistData(name = "Playlist 2", img = R.drawable.playlist2))
        playlistMock.add(PlaylistData(name = "Playlist 3", img = R.drawable.playlist3))
    }






}