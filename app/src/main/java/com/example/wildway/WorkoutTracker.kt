package com.example.wildway

import android.content.Intent
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
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
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
import com.example.wildway.ui.theme.GreyNo
import com.example.wildway.ui.theme.SecondAnotherJustOneTime
import com.example.wildway.ui.theme.TextFieldColor
import com.example.wildway.ui.theme.ThirdAnotherJustOneTime
import com.example.wildway.ui.theme.montserratFamily
import kotlin.math.sin

@Preview(showBackground = true)
@Composable
fun WorkoutTracker(){
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

    Column(Modifier.fillMaxSize()
        .verticalScroll(rememberScrollState())
        .background(brush1)
        .padding(30.dp, 40.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Row(Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically) {
            Card(Modifier
                .size(32.dp)
                .clip(RectangleShape)
                .background(Color.Transparent)
                .clickable { context.startActivity(Intent(context, Home::class.java)) }) {
                Box(Modifier.fillMaxSize()
                    .background(TextFieldColor)) {
                    Column(Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(painterResource(R.drawable.arrowleft), contentDescription = null,
                            Modifier.size(5.dp, 10.dp))
                    }
                }
            }
            Text("Трекер тренировок",
                fontSize = 16.sp,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.Bold,
                fontFamily = montserratFamily)
            Card(Modifier
                .size(32.dp)
                .clip(RectangleShape)
                .background(Color.Transparent)
                .clickable { context.startActivity(Intent(context, Home::class.java)) }) {
                Box(Modifier.fillMaxSize()
                    .background(TextFieldColor)) {
                    Column(Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally) {
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
        Spacer(Modifier.padding(bottom = 31.dp))
        Image(painterResource(R.drawable.graphicworkout), contentDescription = null,
            Modifier.fillMaxWidth().height(172.dp))
        Spacer(Modifier.padding(bottom = 21.dp))

        Card(Modifier
            .size(130.dp, 58.dp)
            .clip(RectangleShape)
            .background(Color.Transparent)
            .clickable { context.startActivity(Intent(context, Home::class.java)) }) {
            Box(Modifier.fillMaxSize()
                .background(TextFieldColor)) {
                Column(Modifier.fillMaxSize()
                    .padding(10.dp)) {
                    Text("Пят, 28 мая",
                        fontSize = 8.sp,
                        fontStyle = FontStyle.Normal,
                        fontWeight = FontWeight.Normal,
                        fontFamily = montserratFamily,
                        color = ThirdAnotherJustOneTime)
                    Text("Вверх тела",
                        fontSize = 10.sp,
                        fontStyle = FontStyle.Normal,
                        fontWeight = FontWeight.Normal,
                        fontFamily = montserratFamily,
                        color = SecondAnotherJustOneTime)
                    Spacer(Modifier.padding(bottom = 8.dp))
                    Box(
                        Modifier
                            .size(110.dp, 5.dp)
                            .clip(RoundedCornerShape(5.dp))
                            .background(GreyNo)
                    )

                }
            }
        }
        Text("всё тело",
            fontSize = 16.sp,
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.Bold,
            fontFamily = montserratFamily)
        Button(onClick = { context.startActivity(Intent(context, WorkoutDetails1::class.java)) }) {
            Text("Больше")
        }
    }
}