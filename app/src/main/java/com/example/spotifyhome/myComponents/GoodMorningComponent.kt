package com.example.spotifyhome.myComponents

import android.text.Layout
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun GoodMorning() {

    Box(modifier = Modifier
        .width(150.dp)
        .height(30.dp)
        .background(Color.Transparent),
        contentAlignment = Alignment.CenterStart
    ) {
        Text(text = "Good Morning!", color = Color.White)
    }

}

@Preview
@Composable
fun GoodMorningPreview() {
    GoodMorning()
}