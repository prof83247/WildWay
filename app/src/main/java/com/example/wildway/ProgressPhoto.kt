package com.example.wildway

import android.content.Intent
import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
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
import androidx.compose.ui.text.style.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.wildway.ui.theme.BluePurple
import com.example.wildway.ui.theme.CianBlue
import com.example.wildway.ui.theme.SecondAnotherJustOneTime
import com.example.wildway.ui.theme.TextFieldColor
import com.example.wildway.ui.theme.ThirdAnotherJustOneTime
import com.example.wildway.ui.theme.montserratFamily

@Preview(showBackground = true)
@Composable
fun ProgressPhoto() {
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
    val brush3 = Brush.linearGradient(
        listOf(Color.Red, Color.Red)
    )

    Column(
        Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(30.dp, 40.dp),
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
                    .clickable {
                        context.startActivity(
                            Intent(
                                context,
                                SleepShedule::class.java
                            )
                        )
                    }) {
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
                            painterResource(R.drawable.arrowleft), contentDescription = null,
                            Modifier.size(5.dp, 10.dp)
                        )
                    }
                }
            }
            Text(
                "Фото прогресса",
                fontSize = 16.sp,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.Bold,
                fontFamily = montserratFamily
            )
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

        Card(
            Modifier
                .fillMaxWidth()
                .height(90.dp)
                .clip(RoundedCornerShape(20.dp))
                .background(Color.Transparent)) {
            Box(
                Modifier
                    .fillMaxSize()
                    .background(brush3, alpha = 0.1f)
            ) {
                Row(
                    Modifier.fillMaxSize()
                        .padding(15.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painterResource(R.drawable.calendarnew), contentDescription = null,
                        Modifier.size(60.dp)
                    )
                    Spacer(Modifier.padding(end = 10.dp))
                    Column {
                        Text(
                            "Напоминание!",
                            fontSize = 12.sp,
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.Normal,
                            fontFamily = montserratFamily,
                            color = Color.Red
                        )
                        Spacer(Modifier.padding(bottom = 6.dp))
                        Text(
                            "Следующие фото 8 июля",
                            fontSize = 14.sp,
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.Medium,
                            fontFamily = montserratFamily
                        )
                    }
                    Column(
                        Modifier.fillMaxSize(),
                        Arrangement.Top,
                        horizontalAlignment = Alignment.End
                    ) {
                        Image(
                            painterResource(R.drawable.cross2), contentDescription = null,
                            Modifier.size(16.dp)
                        )
                    }
                }
            }
        }
        Spacer(Modifier.padding(bottom = 20.dp))
        Card(onClick = { context.startActivity(Intent(context, PhotoScreen::class.java)) },
            Modifier
                .fillMaxWidth()
                .height(137.dp)
                .clip(shape = RoundedCornerShape(22.dp))
        ) {
            Box(
                Modifier
                    .fillMaxSize()
                    .background(brush2, alpha = 0.2f)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(vertical = 25.dp, horizontal = 20.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column {
                        Text(
                            "Отслеживайте свой\nпрогресс каждый месяц ",
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.Medium,
                            fontFamily = montserratFamily,
                            fontSize = 12.sp
                        )
                        Spacer(Modifier.padding(bottom = 15.dp))
                        Button(
                            onClick = { context.startActivity(Intent(context, PhotoScreen::class.java)) },
                            modifier = Modifier
                                .background(brush = brush2, shape = CircleShape)
                                .size(95.dp, 35.dp),
                            shape = CircleShape,
                            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)
                        ) {
                            Text(
                                "Больше",
                                fontStyle = FontStyle.Normal,
                                fontWeight = FontWeight.SemiBold,
                                fontFamily = montserratFamily,
                                fontSize = 10.sp,
                                color = Color.White
                            )
                        }
                    }
                    Image(
                        painter = painterResource(R.drawable.manwithcal),
                        contentDescription = null,
                        Modifier.size(116.dp, 76.dp)
                    )
                }
            }
        }
        Spacer(Modifier.padding(bottom = 30.dp))
        Card(
            onClick = {},
            Modifier
                .fillMaxWidth()
                .height(57.dp)
                .clip(RoundedCornerShape(16.dp))
        ) {
            Box(
                Modifier
                    .fillMaxSize()
            ) {
                Row(
                    Modifier
                        .fillMaxSize()
                        .padding(vertical = 14.dp, horizontal = 15.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        "Сравните свое фото",
                        fontStyle = FontStyle.Normal,
                        fontWeight = FontWeight.Medium,
                        fontFamily = montserratFamily,
                        fontSize = 14.sp
                    )
                    Button(
                        onClick = { context.startActivity(Intent(context, Comparison::class.java)) },
                        Modifier.clip(CircleShape)
                            .background(brush2)
                            .size(88.dp, 28.dp),
                        colors = ButtonDefaults.buttonColors(Color.Transparent),
                        contentPadding = PaddingValues(0.dp)
                    ) {
                        Text(
                            "Сравнивать",
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.Normal,
                            fontFamily = montserratFamily,
                            fontSize = 11.sp,
                            color = Color.White,
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
        }
        Spacer(Modifier.padding(bottom = 30.dp))
        Column (Modifier.fillMaxSize()){
            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Absolute.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    "Галлерея",
                    fontSize = 16.sp,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = montserratFamily
                )
                Text(
                    "Больше",
                    fontSize = 12.sp,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight.Medium,
                    fontFamily = montserratFamily,
                    color = ThirdAnotherJustOneTime
                )
            }
            Spacer(Modifier.padding(bottom = 15.dp))
            Text(
                "2 Июня",
                fontSize = 12.sp,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.Normal,
                fontFamily = montserratFamily,
                color = SecondAnotherJustOneTime
            )
            Spacer(Modifier.padding(bottom = 13.dp))
            Row(Modifier.fillMaxWidth()
                .horizontalScroll(rememberScrollState())) {
                Image(painterResource(R.drawable.girlgantela), contentDescription = null,
                    Modifier.size(100.dp))
                Spacer(Modifier.padding(end = 10.dp))
                Image(painterResource(R.drawable.rungirlrun), contentDescription = null,
                    Modifier.size(100.dp))
                Spacer(Modifier.padding(end = 10.dp))
                Image(painterResource(R.drawable.potygushki), contentDescription = null,
                    Modifier.size(100.dp))
                Spacer(Modifier.padding(end = 10.dp))
                Image(painterResource(R.drawable.girlonroad), contentDescription = null,
                    Modifier.size(100.dp))
            }
            Spacer(Modifier.padding(bottom = 15.dp))
            Text(
                "5 Мая",
                fontSize = 12.sp,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.Normal,
                fontFamily = montserratFamily,
                color = SecondAnotherJustOneTime
            )
            Spacer(Modifier.padding(bottom = 13.dp))
            Row(Modifier.fillMaxWidth()
                .horizontalScroll(rememberScrollState())) {
                Image(painterResource(R.drawable.upping), contentDescription = null,
                    Modifier.size(100.dp))
                Spacer(Modifier.padding(end = 10.dp))
                Image(painterResource(R.drawable.downing), contentDescription = null,
                    Modifier.size(100.dp))
                Spacer(Modifier.padding(end = 10.dp))
                Image(painterResource(R.drawable.preskachat), contentDescription = null,
                    Modifier.size(100.dp))
                Spacer(Modifier.padding(end = 10.dp))
                Image(painterResource(R.drawable.knotjumping), contentDescription = null,
                    Modifier.size(100.dp))
            }
        }
    }
}