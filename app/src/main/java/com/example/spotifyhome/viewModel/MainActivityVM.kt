package com.example.spotifyhome.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.spotifyhome.myComponents.PlaylistData
import com.example.spotifyhome.repo.IPlaylistsRepo
import com.example.spotifyhome.repo.PlaylistsRepo

open class MainActivityVM: ViewModel() {

    val playlists: MutableLiveData<List<PlaylistData>> = MutableLiveData()
    val repo: IPlaylistsRepo = PlaylistsRepo()

    fun getAllPlaylists() {
        playlists.postValue(repo.getPlaylists())
    }



}