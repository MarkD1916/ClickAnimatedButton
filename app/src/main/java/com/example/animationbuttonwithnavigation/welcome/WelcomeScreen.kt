package com.example.vocabularytrainer.presentation.welcome

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.animationbuttonwithnavigation.R
import com.example.vocabularytrainer.navigation.Route
import com.example.vocabularytrainer.presentation.welcome.components.ImageWithSmallText
import com.example.vocabularytrainer.presentation.welcome.components.StartButton
import com.vmakd1916gmail.com.core.util.UiEvent

@Composable
fun WelcomeScreen(
    onNavigate: (UiEvent.Navigate) -> Unit,
    viewModel: WelcomeViewModel = hiltViewModel()
) {


    DisposableEffect(Unit) {
        viewModel.job = null
        onDispose {
            
        }
    }
    Box(modifier = Modifier
        .fillMaxSize()
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .clip(
                    RoundedCornerShape(
                        bottomEnd = 50.dp,
                        bottomStart = 50.dp
                    )
                )
                .background(MaterialTheme.colors.primary)
                .padding(
                    horizontal = 15.dp,
                    vertical = 15.dp
                )
        ) {
            Row(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
            ) {
                Text(
                    text = "Welcome to Vocabulary Trainer APP",
                    color = Color(0xFFFFFFFF)
                )
            }
            Spacer(modifier = Modifier.height(15.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.Start)
                    .padding(
                        horizontal = 15.dp
                    )
            ) {

                ImageWithSmallText(
                    imageId = R.drawable.github_logo_white,
                    text = "My GitHub"
                )

                ImageWithSmallText(
                    imageId = R.drawable.ic_baseline_web_24,
                    text = "Web version"
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
        }
        Column(modifier =
        Modifier
            .padding(horizontal = 15.dp)
            .align(Alignment.Center)) {
            val scope by mutableStateOf(rememberCoroutineScope())

            StartButton(
                modifier = Modifier,
                text = "I already have an Account",
                imageId = R.drawable.ic_baseline_insert_emoticon_24,
                onNavigate = onNavigate,
                route = Route.LOGIN,
                scope = scope,
                viewModel = viewModel
            )
            Spacer(modifier = Modifier.height(15.dp))
            StartButton(
                modifier = Modifier,
                text = "Create new one",
                imageId = R.drawable.ic_baseline_add_reaction_24,
                onNavigate = onNavigate,
                route = Route.REGISTER,
                scope = scope,
                viewModel = viewModel
            )
        }


        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp)
                .align(Alignment.BottomCenter)
                .clip(
                    RoundedCornerShape(
                        topEnd = 50.dp,
                        topStart = 50.dp
                    )
                )
                .background(MaterialTheme.colors.primary)
                .padding(
                    horizontal = 15.dp,
                    vertical = 15.dp
                )
        ){
            Row(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
            ) {
                Text(
                    text = "Made by vmakd1916@gmail.com in 2022",
                    color = Color(0xFFFFFFFF),
                    style = TextStyle(
                        fontFamily = FontFamily.Default,
                        fontWeight = FontWeight.Normal,
                        fontSize = 12.sp
                    )
                )
            }
        }
    }
}