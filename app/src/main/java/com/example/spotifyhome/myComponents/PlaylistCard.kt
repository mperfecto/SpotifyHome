package com.example.spotifyhome.myComponents

import com.example.spotifyhome.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PlaylistCard(texto: String, img: Int, modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .background(Color.DarkGray, shape = RoundedCornerShape(percent = 7))
    ) {
        Row(
            modifier = Modifier
                .width(160.dp)
                .height(40.dp)
                .padding(end = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(
                painter = painterResource(id = img),
                modifier = Modifier
                    .size(40.dp)
                    .clip(RoundedCornerShape(percent = 10)),
                contentDescription = texto
            )

            Text(
                text = texto,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 11.sp,
                modifier = Modifier
                    .padding(start = 8.dp)
            )
        }
    }
}


@Preview
@Composable
fun PlaylistCardPreview() {

    PlaylistCard(texto = "Canciones que te gustan", img = R.drawable.cinta)

}