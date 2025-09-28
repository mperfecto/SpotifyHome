package com.example.spotifyhome

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.darkColorScheme
import com.example.spotifyhome.pages.SpotifyHome
import com.example.spotifyhome.ui.theme.SpotifyHomeTheme
import com.example.spotifyhome.viewModel.MainActivityVM

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val vm = MainActivityVM()
        vm.getAllPlaylists()

        enableEdgeToEdge()
        setContent {
            SpotifyHomeTheme {
                SpotifyHome(vm = vm)
            }
        }
    }
}