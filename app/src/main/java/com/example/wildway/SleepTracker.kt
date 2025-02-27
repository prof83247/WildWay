package com.example.wildway

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.Nullable
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
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
import com.example.wildway.ui.theme.Shadow
import com.example.wildway.ui.theme.TextFieldColor
import com.example.wildway.ui.theme.montserratFamily

class SleepTracker : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SleepTrack()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SleepTrack() {

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
            Text("Трекер сна",
                fontSize = 16.sp,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.Bold    ,
                fontFamily = montserratFamily)
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
        Spacer(Modifier.padding(bottom = 44.dp))
        Column(Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Image(painterResource(R.drawable.graphicsleep),
                contentDescription = null,
                Modifier.size(319.dp, 172.dp))
            Spacer(Modifier.padding(bottom = 14.dp))
            Card(Modifier
                .size(116.dp, 35.dp)
                .shadow(elevation = 12.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                shape = RoundedCornerShape(8.dp)) {
                Column(Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally) {
                    Text("Увеличено на 43% ",
                        fontSize = 10.sp,
                        fontStyle = FontStyle.Normal,
                        fontWeight = FontWeight.Normal,
                        fontFamily = montserratFamily,
                        color = CianGreen)
                }
            }
            Spacer(Modifier.padding(bottom = 15.dp))
            Image(painterResource(R.drawable.cheat), contentDescription = null,
                modifier = Modifier
                    .size(315.dp, 148.dp)
                    .clickable { context.startActivity(Intent(context, SleepShedule::class.java)) })
            Spacer(Modifier.padding(bottom = 30.dp))
            Card(
                onClick = {},
                Modifier
                    .fillMaxWidth()
                    .height(57.dp)
                    .clip(CircleShape)
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
                            "Трафик сна",
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.Medium,
                            fontFamily = montserratFamily,
                            fontSize = 14.sp
                        )
                        Button(
                            onClick = {},
                            Modifier.clip(CircleShape)
                                .background(brush2)
                                .size(96.dp, 28.dp),
                            colors = ButtonDefaults.buttonColors(Color.Transparent),
                            contentPadding = PaddingValues(0.dp)
                        ) {
                            Text(
                                "Проверить",
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
            Column(Modifier.fillMaxSize()) {
                Text("Расписание на сегодня",
                    fontSize = 16.sp,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = montserratFamily)
                Spacer(Modifier.padding(bottom = 15.dp))

                Column(Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally) {

                    Card(
                        Modifier
                            .fillMaxWidth()
                            .height(93.dp)
                            .shadow(elevation = 40.dp, spotColor = Shadow)
                            .clip(RoundedCornerShape(20.dp))

                    ) {
                        Box(
                            Modifier
                                .fillMaxSize()
                                .background(Color.White)
                        ) {
                            Row(
                                Modifier
                                    .fillMaxSize()
                                    .padding(vertical = 20.dp, horizontal = 15.dp),
                                verticalAlignment = Alignment.CenterVertically,
                            ) {
                                Image(
                                    painterResource(R.drawable.bed), contentDescription = null,
                                    Modifier.size(30.dp)
                                )
                                Spacer(Modifier.padding(end = 15.dp))
                                Column(Modifier.fillMaxHeight(),
                                    verticalArrangement = Arrangement.Center) {
                                    Row {
                                        Text(
                                            "Сон,",
                                            fontStyle = FontStyle.Normal,
                                            fontWeight = FontWeight.Medium,
                                            fontFamily = montserratFamily,
                                            fontSize = 14.sp
                                        )
                                        Text(
                                            " 21:00",
                                            fontStyle = FontStyle.Normal,
                                            fontWeight = FontWeight.Normal,
                                            fontFamily = montserratFamily,
                                            fontSize = 14.sp,
                                            color = SecondAnotherJustOneTime
                                        )
                                    }
                                    Spacer(Modifier.padding(bottom = 5.dp))
                                    Text(
                                        "через 6 часов 22 минуты",
                                        fontStyle = FontStyle.Normal,
                                        fontWeight = FontWeight.Normal,
                                        fontFamily = montserratFamily,
                                        fontSize = 14.sp,
                                        color = SecondAnotherJustOneTime
                                    )
                                }
                                Column(Modifier.fillMaxSize(),
                                    horizontalAlignment = Alignment.End) {
                                    Image(painterResource(R.drawable.dots), contentDescription = null,
                                        Modifier.size(14.dp))
                                    Spacer(Modifier.padding(bottom = 20.dp))
                                    Image(painterResource(R.drawable.toggle), contentDescription = null,
                                        Modifier.wrapContentSize().size(44.dp, 24.dp))
                                }
                            }
                        }
                    }
                    Spacer(Modifier.padding(15.dp))
                    Card(
                        Modifier
                            .fillMaxWidth()
                            .height(93.dp)
                            .shadow(elevation = 40.dp, spotColor = Shadow)
                            .clip(RoundedCornerShape(20.dp))

                    ) {
                        Box(
                            Modifier
                                .fillMaxSize()
                                .background(Color.White)
                        ) {
                            Row(
                                Modifier
                                    .fillMaxSize()
                                    .padding(vertical = 20.dp, horizontal = 15.dp),
                                verticalAlignment = Alignment.CenterVertically,
                            ) {
                                Image(
                                    painterResource(R.drawable.realwatch), contentDescription = null,
                                    Modifier.size(30.dp)
                                )
                                Spacer(Modifier.padding(end = 15.dp))
                                Column(Modifier.fillMaxHeight(),
                                    verticalArrangement = Arrangement.Center) {
                                    Row {
                                        Text(
                                            "Будильник, ",
                                            fontStyle = FontStyle.Normal,
                                            fontWeight = FontWeight.Medium,
                                            fontFamily = montserratFamily,
                                            fontSize = 14.sp
                                        )
                                        Text(
                                            "05:10",
                                            fontStyle = FontStyle.Normal,
                                            fontWeight = FontWeight.Normal,
                                            fontFamily = montserratFamily,
                                            fontSize = 14.sp,
                                            color = SecondAnotherJustOneTime
                                        )
                                    }
                                    Spacer(Modifier.padding(bottom = 5.dp))
                                    Text(
                                        "через 10 часов 40 минуты",
                                        fontStyle = FontStyle.Normal,
                                        fontWeight = FontWeight.Normal,
                                        fontFamily = montserratFamily,
                                        fontSize = 14.sp,
                                        color = SecondAnotherJustOneTime
                                    )
                                }
                                Column(Modifier.fillMaxSize(),
                                    horizontalAlignment = Alignment.End) {
                                    Image(painterResource(R.drawable.dots), contentDescription = null,
                                        Modifier.size(14.dp))
                                    Spacer(Modifier.padding(bottom = 20.dp))
                                    Image(painterResource(R.drawable.toggle), contentDescription = null,
                                        Modifier.wrapContentSize().size(44.dp, 24.dp))
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}