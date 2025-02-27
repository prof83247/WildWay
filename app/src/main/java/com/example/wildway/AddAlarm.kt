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
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.wildway.ui.theme.BluePurple
import com.example.wildway.ui.theme.CianBlue
import com.example.wildway.ui.theme.CianGreen
import com.example.wildway.ui.theme.SecondAnotherJustOneTime
import com.example.wildway.ui.theme.TextFieldColor
import com.example.wildway.ui.theme.ThirdAnotherJustOneTime
import com.example.wildway.ui.theme.montserratFamily

class AddAlarm : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AddAlarmScreen()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AddAlarmScreen() {
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
                    .clickable { context.startActivity(Intent(context, SleepShedule::class.java)) }) {
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
                "Добавить часы",
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
        Card(Modifier
            .fillMaxWidth()
            .height(50.dp)
            .clip(RectangleShape)
            .background(Color.Transparent)
            .clickable { }) {
            Box(
                Modifier
                    .fillMaxSize()
                    .background(TextFieldColor)
                    .padding(15.dp, 14.dp)
            ) {
                Row(
                    Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Image(
                            painterResource(R.drawable.bedtwo), contentDescription = null,
                            Modifier.size(20.dp),
                        )
                        Spacer(Modifier.padding(end = 10.dp))
                        Text(
                            "Сон",
                            fontSize = 12.sp,
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.Normal,
                            fontFamily = montserratFamily,
                            color = SecondAnotherJustOneTime
                        )
                    }
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            "21:00",
                            fontSize = 10.sp,
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.Normal,
                            fontFamily = montserratFamily,
                            color = ThirdAnotherJustOneTime
                        )
                        Spacer(Modifier.padding(end = 5.dp))
                        Image(
                            painterResource(R.drawable.arrowright),
                            contentDescription = null,
                            Modifier.size(20.dp)
                        )
                    }
                }
            }
        }
        Spacer(Modifier.padding(bottom = 10.dp))
        Card(Modifier
            .fillMaxWidth()
            .height(50.dp)
            .clip(RectangleShape)
            .background(Color.Transparent)
            .clickable { }) {
            Box(
                Modifier
                    .fillMaxSize()
                    .background(TextFieldColor)
                    .padding(15.dp, 14.dp)
            ) {
                Row(
                    Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Image(
                            painterResource(R.drawable.watchtwo), contentDescription = null,
                            Modifier.size(20.dp),
                        )
                        Spacer(Modifier.padding(end = 10.dp))
                        Text(
                            "Часов для сна",
                            fontSize = 12.sp,
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.Normal,
                            fontFamily = montserratFamily,
                            color = SecondAnotherJustOneTime
                        )
                    }
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            "8часов 30минут",
                            fontSize = 10.sp,
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.Normal,
                            fontFamily = montserratFamily,
                            color = ThirdAnotherJustOneTime
                        )
                        Spacer(Modifier.padding(end = 5.dp))
                        Image(
                            painterResource(R.drawable.arrowright),
                            contentDescription = null,
                            Modifier.size(20.dp)
                        )
                    }
                }
            }
        }
        Spacer(Modifier.padding(bottom = 10.dp))
        Card(Modifier
            .fillMaxWidth()
            .height(50.dp)
            .clip(RectangleShape)
            .background(Color.Transparent)
            .clickable { }) {
            Box(
                Modifier
                    .fillMaxSize()
                    .background(TextFieldColor)
                    .padding(15.dp, 14.dp)
            ) {
                Row(
                    Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Image(
                            painterResource(R.drawable.repeate), contentDescription = null,
                            Modifier.size(20.dp),
                        )
                        Spacer(Modifier.padding(end = 10.dp))
                        Text(
                            "Повтор",
                            fontSize = 12.sp,
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.Normal,
                            fontFamily = montserratFamily,
                            color = SecondAnotherJustOneTime
                        )
                    }
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            "Пон по Пят",
                            fontSize = 10.sp,
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.Normal,
                            fontFamily = montserratFamily,
                            color = ThirdAnotherJustOneTime
                        )
                        Spacer(Modifier.padding(end = 5.dp))
                        Image(
                            painterResource(R.drawable.arrowright),
                            contentDescription = null,
                            Modifier.size(20.dp)
                        )
                    }
                }
            }
        }
        Spacer(Modifier.padding(bottom = 10.dp))
        Card(Modifier
            .fillMaxWidth()
            .height(50.dp)
            .clip(RectangleShape)
            .background(Color.Transparent)
            .clickable { }) {
            Box(
                Modifier
                    .fillMaxSize()
                    .background(TextFieldColor)
                    .padding(15.dp, 14.dp)
            ) {
                Row(
                    Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Image(
                            painterResource(R.drawable.vibration), contentDescription = null,
                            Modifier.size(20.dp),
                        )
                        Spacer(Modifier.padding(end = 10.dp))
                        Text(
                            "Вибрировать при звуке",
                            fontSize = 12.sp,
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.Normal,
                            fontFamily = montserratFamily,
                            color = SecondAnotherJustOneTime
                        )
                    }
                    Image(painterResource(R.drawable.toggle),
                        contentDescription = null,
                        Modifier.size(44.dp, 24.dp))
                }
            }
        }
        Column(Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Button(onClick = {  context.startActivity(Intent(context, SleepShedule::class.java))  },
                Modifier.fillMaxWidth()
                    .height(60.dp)
                    .clip(CircleShape)
                    .background(brush2),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)) {
                Text("Добавить",
                    fontSize = 16.sp,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight.Bold,
                    fontFamily = montserratFamily,
                    color = Color.White)
            }
        }
    }
}