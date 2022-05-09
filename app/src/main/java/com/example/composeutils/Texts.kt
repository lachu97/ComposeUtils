package com.example.composeutils

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun NormalText() {
    Text(
        text = "Some Random Text",
        textAlign = TextAlign.Center,
        maxLines = 2,
        overflow = TextOverflow.Ellipsis,
        fontFamily = FontFamily.Monospace,
        fontWeight = FontWeight.ExtraBold,
        fontStyle = FontStyle.Normal,
        fontSize = 24.sp
    )
}

@Composable
fun ScrollText() {
    var scroll = rememberScrollState(0)
    Text(
        text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book",
        textAlign = TextAlign.Start,
        maxLines = 9,
        overflow = TextOverflow.Ellipsis,
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Light,
        fontStyle = FontStyle.Normal,
        fontSize = 19.sp,
        modifier = Modifier.verticalScroll(state = scroll)
    )
}

@Composable
fun Paragraphy() {
    Text(
        text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book",
        textAlign = TextAlign.Start,
        maxLines = 5,
        overflow = TextOverflow.Ellipsis,
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Light,
        fontStyle = FontStyle.Normal,
        fontSize = 19.sp
    )
}
@Preview(showBackground = true)
@Composable
fun Revolver() {
    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        backgroundColor = Color.White.copy(0.5f)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(25.dp)
        ) {
            NormalText()
            NormalText()
            Paragraphy()
            ScrollText()
        }
    }
}