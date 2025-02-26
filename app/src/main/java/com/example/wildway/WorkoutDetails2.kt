package com.example.wildway

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.wildway.ui.theme.BluePurple
import com.example.wildway.ui.theme.CianBlue
import com.example.wildway.ui.theme.SecondAnotherJustOneTime
import com.example.wildway.ui.theme.TextFieldColor
import com.example.wildway.ui.theme.ThirdAnotherJustOneTime
import com.example.wildway.ui.theme.montserratFamily

class WorkoutDetails2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WorkoutDet2()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WorkoutDet2() {
    val context = LocalContext.current
    val brush1 = Brush.linearGradient(
        listOf(
            CianBlue,
            BluePurple
        )
    )
    val brush2 = Brush.linearGradient(
        listOf(
            BluePurple,
            CianBlue
        )
    )

    Column(
        Modifier
            .fillMaxSize()
            .padding(30.dp, 40.dp)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Absolute.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Card(
                Modifier
                    .size(32.dp)
                    .clip(RectangleShape)
                    .background(Color.Transparent)
                    .clickable { context.startActivity(Intent(context, WorkoutDetails1::class.java)) }) {
                Box(
                    Modifier
                        .fillMaxSize()
                        .background(TextFieldColor)
                ) {
                    Column(
                        Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Icon(
                            painterResource(R.drawable.cross), contentDescription = null,
                            Modifier.size(16.dp)
                        )
                    }
                }
            }
            Card(
                Modifier
                    .size(32.dp)
                    .clip(RectangleShape)
                    .background(Color.Transparent)
                    .clickable { context.startActivity(Intent(context, Home::class.java)) }) {
                Box(
                    Modifier
                        .fillMaxSize()
                        .background(TextFieldColor)
                ) {
                    Column(
                        Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Row {
                            Icon(
                                painterResource(R.drawable.verysmalldotdontloseit),
                                contentDescription = null,
                                Modifier.size(4.dp)
                            )
                            Spacer(Modifier.padding(end = 2.dp))
                            Icon(
                                painterResource(R.drawable.verysmalldotdontloseit),
                                contentDescription = null,
                                Modifier.size(4.dp)
                            )
                        }
                    }
                }
            }
        }

            Spacer(Modifier.padding(bottom = 30.dp))
            Image(
                painterResource(R.drawable.video), contentDescription = null,
                modifier = Modifier.size(315.dp, 150.dp)
            )
            Column(Modifier.fillMaxSize()) {
            Spacer(Modifier.padding(bottom = 20.dp))
            Text(
                "Прыжки на скакалке",
                fontSize = 16.sp,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.SemiBold,
                fontFamily = montserratFamily
            )
            Spacer(Modifier.padding(bottom = 5.dp))
            Text(
                "Просто | 390 калорий",
                fontSize = 12.sp,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.Normal,
                fontFamily = montserratFamily,
                color = SecondAnotherJustOneTime
            )
            Spacer(Modifier.padding(bottom = 18.dp))
            Text(
                "Описание",
                fontSize = 16.sp,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.SemiBold,
                fontFamily = montserratFamily
            )
            Spacer(Modifier.padding(bottom = 20.dp))
            Text(
                "Джампинг-джек, также известный как звездный прыжок и называемый " +
                        "в армии США прыжком в сторону, представляет собой физическое прыжковое " +
                        "упражнение, выполняемое путем прыжка в положение с широко расставленными ногами." +
                        " Прочитайте больше...",
                fontSize = 12.sp,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.Normal,
                fontFamily = montserratFamily,
                color = SecondAnotherJustOneTime
            )
                Spacer(Modifier.padding(bottom = 16.dp))
            Row(
                Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Absolute.SpaceBetween
            ) {

                Text("Как это сделать",
                    fontSize = 16.sp,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = montserratFamily)
                Text("4 Подхода",
                    fontSize = 12.sp,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight.Medium,
                    fontFamily = montserratFamily,
                    color = ThirdAnotherJustOneTime)
            }
        }
    }
}