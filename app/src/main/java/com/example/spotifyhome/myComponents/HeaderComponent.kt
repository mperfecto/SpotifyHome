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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.spotifyhome.R

@Composable
fun Header(text: String) {

    Box(modifier = Modifier
        .fillMaxWidth()
        .background(Color.Transparent)
        .padding(start = 8.dp, top = 8.dp, bottom = 8.dp, end = 24.dp),
        contentAlignment = Alignment.CenterStart
    ) {
        Text(
            text = text,
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp)
    }

}

@Preview
@Composable
fun GreetingPreview() {
    Header(stringResource(id = R.string.good_morning))
}