package com.example.wildway

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Canvas
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.wildway.ui.theme.BluePurple
import com.example.wildway.ui.theme.CianBlue
import com.example.wildway.ui.theme.CianGreen
import com.example.wildway.ui.theme.GreyNo
import com.example.wildway.ui.theme.OpacityBlack
import com.example.wildway.ui.theme.SecondAnotherJustOneTime
import com.example.wildway.ui.theme.TextFieldColor
import com.example.wildway.ui.theme.ThirdAnotherJustOneTime
import com.example.wildway.ui.theme.montserratFamily

class WorkoutDetails1 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WorkoutDet1()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WorkoutDet1() {

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
            .fillMaxSize(1f)
            .background(brush1)
            .padding(30.dp, 40.dp)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Absolute.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Card(Modifier
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
                        Icon(
                            painterResource(R.drawable.arrowleft), contentDescription = null,
                            Modifier.size(5.dp, 10.dp)
                        )
                    }
                }
            }
            Card(Modifier
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
    }
    Column(
        Modifier.fillMaxSize(1f)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painterResource(R.drawable.man), contentDescription = null,
            Modifier.size(315.dp, 415.dp)
        )
        Spacer(Modifier.padding(bottom = 10.dp))
        Box(
            Modifier
                .fillMaxWidth()
                .height(1500.dp)
                .clip(RoundedCornerShape(40.dp))
                .background(TextFieldColor)
                .padding(30.dp, 10.dp)
        ) {
            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Box(
                    Modifier
                        .size(50.dp, 5.dp)
                        .clip(RoundedCornerShape(50.dp))
                        .background(OpacityBlack)
                )
            }
            Column(Modifier.fillMaxSize()) {
                Spacer(Modifier.padding(bottom = 25.dp))
                Row(
                    Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        "Все тело",
                        fontSize = 16.sp,
                        fontStyle = FontStyle.Normal,
                        fontWeight = FontWeight.Bold,
                        fontFamily = montserratFamily
                    )

                    Card(Modifier
                        .size(32.dp)
                        .clip(RectangleShape)
                        .background(Color.Transparent)
                        .clickable { }) {
                        Box(
                            Modifier
                                .fillMaxSize()
                                .background(Color.White)
                        ) {
                            Column(
                                Modifier.fillMaxSize(),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Image(
                                    painterResource(R.drawable.heart), contentDescription = null,
                                    Modifier.size(16.dp),
                                )
                            }
                        }
                    }
                }
                Text(
                    "11 упражнений | 32 мин. | 320 Калорий",
                    fontSize = 12.sp,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight.Normal,
                    fontFamily = montserratFamily,
                    color = SecondAnotherJustOneTime
                )
                Spacer(Modifier.padding(20.dp))

                //Card время тренировки и сложность
                Card(Modifier
                    .size(315.dp, 50.dp)
                    .clip(RectangleShape)
                    .background(Color.Transparent)
                    .clickable { }) {
                    Box(
                        Modifier
                            .fillMaxSize()
                            .background(CianGreen)
                            .padding(15.dp, 14.dp)
                    ) {
                        Row(
                            Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painterResource(R.drawable.kalendar), contentDescription = null,
                                Modifier.size(22.dp),
                            )
                            Spacer(Modifier.padding(end = 10.dp))
                            Text(
                                "Время тренировки",
                                fontSize = 12.sp,
                                fontStyle = FontStyle.Normal,
                                fontWeight = FontWeight.Normal,
                                fontFamily = montserratFamily,
                                color = BluePurple
                            )
                            Spacer(Modifier.padding(end = 39.dp))
                            Text(
                                "27 мая, 09:00",
                                fontSize = 10.sp,
                                fontStyle = FontStyle.Normal,
                                fontWeight = FontWeight.Normal,
                                fontFamily = montserratFamily,
                                color = BluePurple
                            )
                            Spacer(Modifier.padding(end = 10.dp))
                            Image(
                                painterResource(R.drawable.arrowright),
                                contentDescription = null,
                                Modifier.size(16.dp)
                            )
                        }
                    }
                }
                Spacer(Modifier.padding(bottom = 15.dp))
                Card(Modifier
                    .size(315.dp, 50.dp)
                    .clip(RectangleShape)
                    .background(Color.Transparent)
                    .clickable { }) {
                    Box(
                        Modifier
                            .fillMaxSize()
                            .background(CianGreen)
                            .padding(15.dp, 14.dp)
                    ) {
                        Row(
                            Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painterResource(R.drawable.twoarrows), contentDescription = null,
                                Modifier.size(22.dp),
                            )
                            Spacer(Modifier.padding(end = 10.dp))
                            Text(
                                "Сложность",
                                fontSize = 12.sp,
                                fontStyle = FontStyle.Normal,
                                fontWeight = FontWeight.Normal,
                                fontFamily = montserratFamily,
                                color = BluePurple
                            )
                            Spacer(Modifier.padding(end = 87.dp))
                            Text(
                                "Начинающий",
                                fontSize = 10.sp,
                                fontStyle = FontStyle.Normal,
                                fontWeight = FontWeight.Normal,
                                fontFamily = montserratFamily,
                                color = BluePurple
                            )
                            Spacer(Modifier.padding(end = 10.dp))
                            Image(
                                painterResource(R.drawable.arrowright),
                                contentDescription = null,
                                Modifier.size(16.dp)
                            )
                        }
                    }
                }
                Spacer(Modifier.padding(bottom = 30.dp))
                Column(Modifier.fillMaxSize()) {
                    Row(Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Absolute.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically) {
                        Text("Вам понадобится",
                            fontSize = 16.sp,
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.SemiBold,
                            fontFamily = montserratFamily)
                        Text("5 предметов",
                            fontSize = 12.sp,
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.Medium,
                            fontFamily = montserratFamily,
                            color = ThirdAnotherJustOneTime)
                    }

                    //Создание дополнительных card для отображения предметов
                    Spacer(Modifier.padding(bottom = 15.dp))
                    Row(Modifier.fillMaxWidth()
                        .horizontalScroll(rememberScrollState())) {

                        Card(Modifier
                            .size(130.dp, 158.dp)
                            .clip(RectangleShape)
                            .background(Color.Transparent)
                            .clickable {  }) {
                            Box(
                                Modifier
                                    .size(130.dp)
                                    .background(Color.White)
                            ) {
                                Column(
                                    Modifier.fillMaxSize(),
                                    verticalArrangement = Arrangement.Center,
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ) {
                                    Image(
                                        painterResource(R.drawable.ganteli), contentDescription = null,
                                        Modifier.size(66.dp, 53.dp),
                                    )
                                }
                            }
                            Text("Гантели",
                                fontSize = 12.sp,
                                fontStyle = FontStyle.Normal,
                                fontWeight = FontWeight.Normal,
                                fontFamily = montserratFamily)
                        }
                        Spacer(Modifier.padding(15.dp))
                        Card(Modifier
                            .size(130.dp, 158.dp)
                            .clip(RectangleShape)
                            .background(Color.Transparent)
                            .clickable {  }) {
                            Box(
                                Modifier
                                    .size(130.dp)
                                    .background(Color.White)
                            ) {
                                Column(
                                    Modifier.fillMaxSize(),
                                    verticalArrangement = Arrangement.Center,
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ) {
                                    Image(
                                        painterResource(R.drawable.knot), contentDescription = null,
                                        Modifier.size(61.dp, 77.dp),
                                    )
                                }
                            }
                        }
                        Spacer(Modifier.padding(15.dp))

                        Card(Modifier
                            .size(130.dp, 158.dp)
                            .clip(RectangleShape)
                            .background(Color.Transparent)
                            .clickable {  }) {
                            Box(
                                Modifier
                                    .size(130.dp)
                                    .background(Color.White)
                            ) {
                                Column(
                                    Modifier.fillMaxSize(),
                                    verticalArrangement = Arrangement.Center,
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ) {
                                    Image(
                                        painterResource(R.drawable.heart), contentDescription = null,
                                        Modifier.size(16.dp),
                                    )
                                }
                            }
                        }
                        Spacer(Modifier.padding(15.dp))

                        Card(Modifier
                            .size(130.dp, 158.dp)
                            .clip(RectangleShape)
                            .background(Color.Transparent)
                            .clickable {  }) {
                            Box(
                                Modifier
                                    .size(130.dp)
                                    .background(Color.White)
                            ) {
                                Column(
                                    Modifier.fillMaxSize(),
                                    verticalArrangement = Arrangement.Center,
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ) {
                                    Image(
                                        painterResource(R.drawable.heart), contentDescription = null,
                                        Modifier.size(16.dp),
                                    )
                                }
                            }
                        }
                        Spacer(Modifier.padding(15.dp))

                        Card(Modifier
                            .size(130.dp, 158.dp)
                            .clip(RectangleShape)
                            .background(Color.Transparent)
                            .clickable {  }) {
                            Box(
                                Modifier
                                    .size(130.dp)
                                    .background(Color.White)
                            ) {
                                Column(
                                    Modifier.fillMaxSize(),
                                    verticalArrangement = Arrangement.Center,
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ) {
                                    Image(
                                        painterResource(R.drawable.heart), contentDescription = null,
                                        Modifier.size(16.dp),
                                    )
                                }
                            }
                        }
                        Spacer(Modifier.padding(15.dp))
                    }
                }
            }
        }
    }
}

