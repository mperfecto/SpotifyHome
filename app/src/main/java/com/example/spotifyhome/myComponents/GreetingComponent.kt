package com.example.spotifyhome.myComponents

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Greeting() {

    Box(modifier = Modifier
        .fillMaxWidth()
        .background(Color.Transparent)
        .padding(10.dp),
        contentAlignment = Alignment.CenterStart
    ) {
        Text(
            text = "Good Morning!",
            color = Color.White,
            fontSize = 20.sp)
    }

}

@Preview
@Composable
fun GreetingPreview() {
    Greeting()
}