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
        playlistMock.add(PlaylistData(name = "Today's Top Hits", img = R.drawable.cinta))
        playlistMock.add(PlaylistData(name = "Canciones que te gustan", img = R.drawable.cinta))
        playlistMock.add(PlaylistData(name = "Pop", img = R.drawable.cinta))
    }






}