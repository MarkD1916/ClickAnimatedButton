package com.example.vocabularytrainer.presentation.welcome.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ImageWithSmallText(
    imageId: Int,
    text: String,
) {
    Row{
        Image(
            painterResource(imageId),
            contentDescription = "",
            contentScale = ContentScale.Fit,
            modifier = Modifier.size(20.dp)
        )
        Spacer(modifier = Modifier.width(3.dp))
        Text(
            modifier = Modifier.align(Alignment.Top),
            style = TextStyle(
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.Normal,
                fontSize = 10.sp
            ),
            text = text,
            color = Color(0xFFFFFFFF)
        )
    }
}