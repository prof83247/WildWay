package com.example.wildway

import android.content.Intent
import android.os.Bundle
import android.widget.Space
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
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
            .fillMaxSize()
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
        Modifier
            .fillMaxSize()
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
                .height(1300.dp)
                .clip(RoundedCornerShape(40.dp))
                .background(Color.White)
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
                    .fillMaxWidth()
                    .height(50.dp)
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
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
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
                            }
                            Row(verticalAlignment = Alignment.CenterVertically) {
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
                }
                Spacer(Modifier.padding(bottom = 15.dp))
                Card(Modifier
                    .fillMaxWidth()
                    .height(50.dp)
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
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
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
                            }
                            Row(verticalAlignment = Alignment.CenterVertically) {
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
                }
                Spacer(Modifier.padding(bottom = 30.dp))
                Column(Modifier.fillMaxSize()) {
                    Row(
                        Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Absolute.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            "Вам понадобится",
                            fontSize = 16.sp,
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.SemiBold,
                            fontFamily = montserratFamily
                        )
                        Text(
                            "5 предметов",
                            fontSize = 12.sp,
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.Medium,
                            fontFamily = montserratFamily,
                            color = ThirdAnotherJustOneTime
                        )
                    }

                    //Создание дополнительных card для отображения предметов
                    Spacer(Modifier.padding(bottom = 15.dp))
                    Row(
                        Modifier
                            .fillMaxWidth()
                            .horizontalScroll(rememberScrollState())
                    ) {

                        Column(Modifier.size(130.dp, 158.dp)) {
                            Card(Modifier
                                .size(130.dp)
                                .clip(RectangleShape)
                                .clickable { }) {
                                Box(
                                    Modifier
                                        .size(130.dp)
                                        .background(TextFieldColor)
                                ) {
                                    Column(
                                        Modifier.fillMaxSize(),
                                        verticalArrangement = Arrangement.Center,
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {
                                        Image(
                                            painterResource(R.drawable.ganteli),
                                            contentDescription = null,
                                            Modifier.size(66.dp, 53.dp),
                                        )
                                    }
                                }
                            }
                            Spacer(Modifier.padding(bottom = 10.dp))
                            Text(
                                "Гантели",
                                fontSize = 12.sp,
                                fontStyle = FontStyle.Normal,
                                fontWeight = FontWeight.Normal,
                                fontFamily = montserratFamily
                            )
                        }
                        Spacer(Modifier.padding(end = 15.dp))
                        Column(Modifier.size(130.dp, 158.dp)) {
                            Card(Modifier
                                .size(130.dp)
                                .clip(RectangleShape)
                                .clickable { }) {
                                Box(
                                    Modifier
                                        .size(130.dp)
                                        .background(TextFieldColor)
                                ) {
                                    Column(
                                        Modifier.fillMaxSize(),
                                        verticalArrangement = Arrangement.Center,
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {
                                        Image(
                                            painterResource(R.drawable.knot),
                                            contentDescription = null,
                                            Modifier.size(66.dp, 53.dp),
                                        )
                                    }
                                }
                            }
                            Spacer(Modifier.padding(bottom = 10.dp))
                            Text(
                                "Скакалка",
                                fontSize = 12.sp,
                                fontStyle = FontStyle.Normal,
                                fontWeight = FontWeight.Normal,
                                fontFamily = montserratFamily
                            )
                        }
                        Spacer(Modifier.padding(end = 15.dp))

                        Column(Modifier.size(130.dp, 158.dp)) {
                            Card(Modifier
                                .size(130.dp)
                                .clip(RectangleShape)
                                .clickable { }) {
                                Box(
                                    Modifier
                                        .size(130.dp)
                                        .background(TextFieldColor)
                                ) {
                                    Column(
                                        Modifier.fillMaxSize(),
                                        verticalArrangement = Arrangement.Center,
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {
                                        Image(
                                            painterResource(R.drawable.bottle),
                                            contentDescription = null,
                                            Modifier.size(26.dp, 57.dp),
                                        )
                                    }
                                }
                            }
                            Spacer(Modifier.padding(bottom = 10.dp))
                            Text(
                                "Бутылка",
                                //могла бы тут быть, но картинка урезана
                                fontSize = 12.sp,
                                fontStyle = FontStyle.Normal,
                                fontWeight = FontWeight.Normal,
                                fontFamily = montserratFamily
                            )
                        }
                        Spacer(Modifier.padding(end = 15.dp))

                        Card(Modifier
                            .size(130.dp)
                            .clip(RectangleShape)
                            .background(Color.Transparent)
                            .clickable { }) {
                            Box(
                                Modifier
                                    .size(130.dp)
                                    .background(TextFieldColor)
                            ) {
                                Column(
                                    Modifier.fillMaxSize(),
                                    verticalArrangement = Arrangement.Center,
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ) {
                                    Image(
                                        painterResource(R.drawable.heart),
                                        contentDescription = null,
                                        Modifier.size(16.dp),
                                    )
                                }
                            }
                        }
                        Spacer(Modifier.padding(end = 15.dp))

                        Card(Modifier
                            .size(130.dp)
                            .clip(RectangleShape)
                            .background(Color.Transparent)
                            .clickable { }) {
                            Box(
                                Modifier
                                    .size(130.dp)
                                    .background(TextFieldColor)
                            ) {
                                Column(
                                    Modifier.fillMaxSize(),
                                    verticalArrangement = Arrangement.Center,
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ) {
                                    Image(
                                        painterResource(R.drawable.heart),
                                        contentDescription = null,
                                        Modifier.size(16.dp),
                                    )
                                }
                            }
                        }
                    }
                    Spacer(Modifier.padding(bottom = 30.dp))
                    Row(
                        Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Absolute.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            "Упражнения",
                            fontSize = 16.sp,
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.SemiBold,
                            fontFamily = montserratFamily
                        )
                        Text(
                            "3 подхода",
                            fontSize = 12.sp,
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.Medium,
                            fontFamily = montserratFamily,
                            color = ThirdAnotherJustOneTime
                        )
                    }
                    Spacer(Modifier.padding(bottom = 20.dp))
                    Text(
                        "Подход 1",
                        fontSize = 12.sp,
                        fontStyle = FontStyle.Normal,
                        fontWeight = FontWeight.Medium,
                        fontFamily = montserratFamily
                    )
                    Spacer(Modifier.padding(bottom = 15.dp))

                    //создание упражнений подхода 1
                    Row(
                        Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Image(
                                painterResource(R.drawable.girlonroad), contentDescription = null,
                                Modifier.size(60.dp)
                            )
                            Spacer(Modifier.padding(end = 10.dp))
                            Column {
                                Text(
                                    "Бег",
                                    fontSize = 14.sp,
                                    fontStyle = FontStyle.Normal,
                                    fontWeight = FontWeight.Medium,
                                    fontFamily = montserratFamily
                                )
                                Spacer(Modifier.padding(bottom = 5.dp))
                                Text(
                                    "05:00",
                                    fontSize = 12.sp,
                                    fontStyle = FontStyle.Normal,
                                    fontWeight = FontWeight.Medium,
                                    fontFamily = montserratFamily,
                                    color = SecondAnotherJustOneTime
                                )
                            }
                        }
                        IconButton(
                            onClick = {},
                            Modifier.size(24.dp)
                        ) {
                            Image(
                                painterResource(R.drawable.arrowincircle),
                                contentDescription = null
                            )
                        }
                    }
                    Spacer(Modifier.padding(bottom = 15.dp))

                    Row(
                        Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Image(
                                painterResource(R.drawable.jumps), contentDescription = null,
                                Modifier.size(60.dp)
                            )
                            Spacer(Modifier.padding(end = 10.dp))
                            Column {
                                Text(
                                    "Прыжки",
                                    fontSize = 14.sp,
                                    fontStyle = FontStyle.Normal,
                                    fontWeight = FontWeight.Medium,
                                    fontFamily = montserratFamily
                                )
                                Spacer(Modifier.padding(bottom = 5.dp))
                                Text(
                                    "12x",
                                    fontSize = 12.sp,
                                    fontStyle = FontStyle.Normal,
                                    fontWeight = FontWeight.Medium,
                                    fontFamily = montserratFamily,
                                    color = SecondAnotherJustOneTime
                                )
                            }
                        }
                        IconButton(
                            onClick = {},
                            Modifier.size(24.dp)
                        ) {
                            Image(
                                painterResource(R.drawable.arrowincircle),
                                contentDescription = null
                            )
                        }
                    }
                    Spacer(Modifier.padding(bottom = 15.dp))

                    Row(
                        Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Image(
                                painterResource(R.drawable.knotjumping), contentDescription = null,
                                Modifier.size(60.dp)
                            )
                            Spacer(Modifier.padding(end = 10.dp))
                            Column {
                                Text(
                                    "Скакалка",
                                    fontSize = 14.sp,
                                    fontStyle = FontStyle.Normal,
                                    fontWeight = FontWeight.Medium,
                                    fontFamily = montserratFamily
                                )
                                Spacer(Modifier.padding(bottom = 5.dp))
                                Text(
                                    "15x",
                                    fontSize = 12.sp,
                                    fontStyle = FontStyle.Normal,
                                    fontWeight = FontWeight.Medium,
                                    fontFamily = montserratFamily,
                                    color = SecondAnotherJustOneTime
                                )
                            }
                        }
                        IconButton(
                            onClick = {},
                            Modifier.size(24.dp)
                        ) {
                            Image(
                                painterResource(R.drawable.arrowincircle),
                                contentDescription = null
                            )
                        }
                    }
                    Spacer(Modifier.padding(bottom = 15.dp))

                    Row(
                        Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Image(
                                painterResource(R.drawable.sitting), contentDescription = null,
                                Modifier.size(60.dp)
                            )
                            Spacer(Modifier.padding(end = 10.dp))
                            Column {
                                Text(
                                    "Приседания",
                                    fontSize = 14.sp,
                                    fontStyle = FontStyle.Normal,
                                    fontWeight = FontWeight.Medium,
                                    fontFamily = montserratFamily
                                )
                                Spacer(Modifier.padding(bottom = 5.dp))
                                Text(
                                    "20x",
                                    fontSize = 12.sp,
                                    fontStyle = FontStyle.Normal,
                                    fontWeight = FontWeight.Medium,
                                    fontFamily = montserratFamily,
                                    color = SecondAnotherJustOneTime
                                )
                            }
                        }
                        IconButton(
                            onClick = {},
                            Modifier.size(24.dp)
                        ) {
                            Image(
                                painterResource(R.drawable.arrowincircle),
                                contentDescription = null
                            )
                        }
                    }
                    Spacer(Modifier.padding(bottom = 15.dp))

                    Row(
                        Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Image(
                                painterResource(R.drawable.upping), contentDescription = null,
                                Modifier.size(60.dp)
                            )
                            Spacer(Modifier.padding(end = 10.dp))
                            Column {
                                Text(
                                    "Подъемы рук",
                                    fontSize = 14.sp,
                                    fontStyle = FontStyle.Normal,
                                    fontWeight = FontWeight.Medium,
                                    fontFamily = montserratFamily
                                )
                                Spacer(Modifier.padding(bottom = 5.dp))
                                Text(
                                    "00:53",
                                    fontSize = 12.sp,
                                    fontStyle = FontStyle.Normal,
                                    fontWeight = FontWeight.Medium,
                                    fontFamily = montserratFamily,
                                    color = SecondAnotherJustOneTime
                                )
                            }
                        }
                        IconButton(
                            onClick = {},
                            Modifier.size(24.dp)
                        ) {
                            Image(
                                painterResource(R.drawable.arrowincircle),
                                contentDescription = null
                            )
                        }
                    }
                    Spacer(Modifier.padding(bottom = 15.dp))

                    Row(
                        Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Image(
                                painterResource(R.drawable.drinking), contentDescription = null,
                                Modifier.size(60.dp)
                            )
                            Spacer(Modifier.padding(end = 10.dp))
                            Column {
                                Text(
                                    "Отдых и напитки",
                                    fontSize = 14.sp,
                                    fontStyle = FontStyle.Normal,
                                    fontWeight = FontWeight.Medium,
                                    fontFamily = montserratFamily
                                )
                                Spacer(Modifier.padding(bottom = 5.dp))
                                Text(
                                    "02:00",
                                    fontSize = 12.sp,
                                    fontStyle = FontStyle.Normal,
                                    fontWeight = FontWeight.Medium,
                                    fontFamily = montserratFamily,
                                    color = SecondAnotherJustOneTime
                                )
                            }
                        }
                        IconButton(
                            onClick = {},
                            Modifier.size(24.dp)
                        ) {
                            Image(
                                painterResource(R.drawable.arrowincircle),
                                contentDescription = null
                            )
                        }
                    }
                    Spacer(Modifier.padding(bottom = 15.dp))

                    Spacer(Modifier.padding(bottom = 20.dp))
                    Text(
                        "Подход 2",
                        fontSize = 12.sp,
                        fontStyle = FontStyle.Normal,
                        fontWeight = FontWeight.Medium,
                        fontFamily = montserratFamily
                    )
                    Spacer(Modifier.padding(bottom = 15.dp))

                    //создание упражнений подхода 2
                    Row(
                        Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Image(
                                painterResource(R.drawable.ygolotzim), contentDescription = null,
                                Modifier.size(60.dp)
                            )
                            Spacer(Modifier.padding(end = 10.dp))
                            Column {
                                Text(
                                    "Отжимания на наклоне",
                                    fontSize = 14.sp,
                                    fontStyle = FontStyle.Normal,
                                    fontWeight = FontWeight.Medium,
                                    fontFamily = montserratFamily
                                )
                                Spacer(Modifier.padding(bottom = 5.dp))
                                Text(
                                    "12x",
                                    fontSize = 12.sp,
                                    fontStyle = FontStyle.Normal,
                                    fontWeight = FontWeight.Medium,
                                    fontFamily = montserratFamily,
                                    color = SecondAnotherJustOneTime
                                )
                            }
                        }
                        IconButton(
                            onClick = {},
                            Modifier.size(24.dp)
                        ) {
                            Image(
                                painterResource(R.drawable.arrowincircle),
                                contentDescription = null
                            )
                        }
                    }
                    Spacer(Modifier.padding(bottom = 15.dp))

                    Row(
                        Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Image(
                                painterResource(R.drawable.prostotzim), contentDescription = null,
                                Modifier.size(60.dp)
                            )
                            Spacer(Modifier.padding(end = 10.dp))
                            Column {
                                Text(
                                    "Отжимания",
                                    fontSize = 14.sp,
                                    fontStyle = FontStyle.Normal,
                                    fontWeight = FontWeight.Medium,
                                    fontFamily = montserratFamily
                                )
                                Spacer(Modifier.padding(bottom = 5.dp))
                                Text(
                                    "15x",
                                    fontSize = 12.sp,
                                    fontStyle = FontStyle.Normal,
                                    fontWeight = FontWeight.Medium,
                                    fontFamily = montserratFamily,
                                    color = SecondAnotherJustOneTime
                                )
                            }
                        }
                        IconButton(
                            onClick = {},
                            Modifier.size(24.dp)
                        ) {
                            Image(
                                painterResource(R.drawable.arrowincircle),
                                contentDescription = null
                            )
                        }
                    }
                    Spacer(Modifier.padding(bottom = 15.dp))
                    Button(
                        onClick = { context.startActivity(Intent(context, WorkoutDetails2::class.java)) },
                        Modifier
                            .fillMaxWidth()
                            .background(brush = brush2, shape = CircleShape)
                            .height(60.dp)
                            .clip(shape = CircleShape),
                        colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)
                    ) {
                        Text(
                            "Начать",
                            fontSize = 16.sp,
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.Bold,
                            fontFamily = montserratFamily,
                            color = Color.White
                        )
                    }
                }
            }
        }
    }
}


