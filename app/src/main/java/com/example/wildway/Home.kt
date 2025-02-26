package com.example.wildway

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
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
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
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
import com.example.wildway.ui.theme.GreyNo
import com.example.wildway.ui.theme.SecondAnotherJustOneTime
import com.example.wildway.ui.theme.ThirdAnotherJustOneTime
import com.example.wildway.ui.theme.montserratFamily
import kotlinx.coroutines.launch
import kotlin.math.round

class Home : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {


            val pagerState = rememberPagerState { 5 }
            val coroutineScope = rememberCoroutineScope()
            BottomBarPages(pagerState)

            Column(
                Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Bottom
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(80.dp)
                ) {
                    Column(
                        Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Bottom
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxSize()
                                .height(80.dp),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {

                            IconButton(onClick = { /*coroutineScope.launch(pagerState.currentPage){}*/ }) {
                                Icon(
                                    painterResource(R.drawable.homeunselected),
                                    contentDescription = null
                                )
                            }
                            IconButton(onClick = {}) {
                                Icon(
                                    painterResource(R.drawable.witunselected),
                                    contentDescription = null
                                )
                            }
                            IconButton(onClick = {}) {
                                Icon(
                                    painterResource(R.drawable.searchuns),
                                    contentDescription = null
                                )
                            }
                            IconButton(onClick = {}) {
                                Icon(
                                    painterResource(R.drawable.photouns),
                                    contentDescription = null
                                )
                            }
                            IconButton(onClick = {}) {
                                Icon(
                                    painterResource(R.drawable.profileuns),
                                    contentDescription = null
                                )
                            }
                        }
                    }
                }
            }
        }
    }

    @Composable
    fun BottomBarPages(pagerState: PagerState) {
        HorizontalPager(pagerState) { page ->
            when (page) {
                1 -> HomeScreen()

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreen() {

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
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 40.dp, horizontal = 30.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Row(
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(horizontalAlignment = AbsoluteAlignment.Left) {
                Text(
                    "Добро пожаловать,",
                    fontSize = 12.sp,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight.Normal,
                    fontFamily = montserratFamily
                )
                Spacer(Modifier.padding(bottom = 5.dp))
                Text(
                    "Юрий",
                    fontSize = 20.sp,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight.Bold,
                    fontFamily = montserratFamily
                )
            }
            IconButton(onClick = {}) {
                Icon(
                    painterResource(R.drawable.notification), contentDescription = null,
                    modifier = Modifier.size(18.dp, 21.21.dp)
                )
            }
        }
        Spacer(Modifier.padding(bottom = 30.dp))
        Column(
            Modifier.fillMaxSize(),
        ) {
            Card(
                onClick = {},
                Modifier
                    .fillMaxWidth()
                    .height(146.dp)
                    .clip(shape = RoundedCornerShape(22.dp))
            ) {
                Box(
                    Modifier
                        .fillMaxSize()
                        .background(brush = brush1)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(vertical = 26.dp, horizontal = 20.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Column {
                            Text(
                                "ИМТ (индекс массы тела)",
                                fontStyle = FontStyle.Normal,
                                fontWeight = FontWeight.SemiBold,
                                fontFamily = montserratFamily,
                                fontSize = 13.sp,
                                color = Color.White
                            )
                            Spacer(Modifier.padding(bottom = 5.dp))
                            Text(
                                "У тебя нормальный вес",
                                fontStyle = FontStyle.Normal,
                                fontWeight = FontWeight.Normal,
                                fontFamily = montserratFamily,
                                fontSize = 12.sp,
                                color = Color.White
                            )
                            Spacer(Modifier.padding(bottom = 15.dp))
                            Button(
                                onClick = {},
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
                        Image(painter = painterResource(R.drawable.imt), contentDescription = null)
                    }
                }
            }
            Spacer(Modifier.padding(20.dp))
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
                            "Сегодняшняя цель",
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.SemiBold,
                            fontFamily = montserratFamily,
                            fontSize = 14.sp
                        )
                        Button(
                            onClick = {},
                            Modifier.size(96.dp, 28.dp),
                            colors = ButtonDefaults.buttonColors(CianGreen),
                            contentPadding = PaddingValues(0.dp)
                        ) {
                            Text(
                                "Проверить",
                                fontStyle = FontStyle.Normal,
                                fontWeight = FontWeight.Normal,
                                fontFamily = montserratFamily,
                                fontSize = 10.sp,
                                color = Color.White,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                }
            }
            Spacer(Modifier.padding(27.dp))
            Text(
                "Статус активности",
                fontSize = 16.sp,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.SemiBold,
                fontFamily = montserratFamily
            )
            Spacer(Modifier.padding(16.dp))
            Card(
                onClick = {},
                Modifier
                    .fillMaxWidth()
                    .height(176.dp)
                    .clip(shape = RoundedCornerShape(22.dp))
            ) {
                Box(
                    Modifier
                        .fillMaxSize()
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(vertical = 12.dp, horizontal = 20.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Column(
                            Modifier
                                .fillMaxSize()
                                .padding(top = 11.dp)
                        ) {
                            Text(
                                "Частота сердечных сокращений",
                                fontSize = 12.sp,
                                fontStyle = FontStyle.Normal,
                                fontWeight = FontWeight.Medium,
                                fontFamily = montserratFamily
                            )
                            Image(
                                painterResource(R.drawable.graphicactivity),
                                contentDescription = null,
                                modifier = Modifier.size(279.dp, 81.dp)
                            )
                            Spacer(Modifier.padding(14.dp))
                            Row(
                                Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.Center
                            ) {
                                Text(
                                    "78 BPM",
                                    fontSize = 14.sp,
                                    fontStyle = FontStyle.Normal,
                                    fontWeight = FontWeight.SemiBold,
                                    fontFamily = montserratFamily,
                                    color = BluePurple
                                )
                            }
                        }
                    }
                }
            }
            Spacer(Modifier.padding(bottom = 21.dp))
            Row(Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Absolute.SpaceBetween) {
                Card(
                    onClick = {},
                    Modifier
                        .size(150.dp, 315.dp)
                        .clip(shape = RoundedCornerShape(20.dp))
                ) {
                    Box(
                        Modifier
                            .fillMaxSize()
                            .background(color = Color.White)
                    ) {
                        Row(
                            Modifier
                                .fillMaxSize()
                                .padding(start = 20.dp, end = 14.dp, top = 20.dp, bottom = 20.dp)
                        ) {
                            Box(
                                Modifier
                                    .size(20.dp, 275.dp)
                                    .clip(RoundedCornerShape(30.dp))
                                    .background(GreyNo)
                            )
                            Spacer(Modifier.padding(end = 10.dp))
                            Column(Modifier.fillMaxSize()) {
                                Text(
                                    "Вода",
                                    fontSize = 12.sp,
                                    fontStyle = FontStyle.Normal,
                                    fontWeight = FontWeight.Medium,
                                    fontFamily = montserratFamily
                                )
                                Spacer(Modifier.padding(bottom = 5.dp))
                                Text(
                                    "4 Литра",
                                    fontSize = 14.sp,
                                    fontStyle = FontStyle.Normal,
                                    fontWeight = FontWeight.SemiBold,
                                    fontFamily = montserratFamily,
                                    color = BluePurple
                                )
                                Spacer(Modifier.padding(bottom = 10.dp))
                                Text(
                                    "В реал. времени",
                                    fontSize = 10.sp,
                                    fontStyle = FontStyle.Normal,
                                    fontWeight = FontWeight.Normal,
                                    fontFamily = montserratFamily,
                                    color = SecondAnotherJustOneTime
                                )
                                Spacer(Modifier.padding(bottom = 5.dp))
                                Row(
                                    Modifier.fillMaxWidth(),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Box(
                                        Modifier
                                            .size(6.dp)
                                            .clip(RoundedCornerShape(30.dp))
                                            .background(brush2)
                                    )
                                    Spacer(Modifier.padding(end = 8.dp))
                                    Text(
                                        "6:00 - 8:00",
                                        fontSize = 12.sp,
                                        fontStyle = FontStyle.Normal,
                                        fontWeight = FontWeight.Normal,
                                        fontFamily = montserratFamily,
                                        color = ThirdAnotherJustOneTime
                                    )
                                }
                            }
                        }
                    }
                }

                Card(
                    onClick = {},
                    Modifier
                        .size(150.dp)
                        .clip(shape = RoundedCornerShape(20.dp))
                ) {
                    Box(
                        Modifier
                            .fillMaxSize()
                            .background(color = Color.White)
                    ) {
                        Column(Modifier.fillMaxSize().padding(20.dp)) {
                            Text(
                                "Сон",
                                fontSize = 12.sp,
                                fontStyle = FontStyle.Normal,
                                fontWeight = FontWeight.Medium,
                                fontFamily = montserratFamily
                            )
                            Spacer(Modifier.padding(bottom = 5.dp))
                            Text("8 ч. 20 мин.",
                                fontSize = 14.sp,
                                fontStyle = FontStyle.Normal,
                                fontWeight = FontWeight.SemiBold,
                                fontFamily = montserratFamily,
                                color = BluePurple)
                            Spacer(Modifier.padding(bottom = 5.dp))
                            Image(painterResource(R.drawable.dnk), contentDescription = null)
                        }
                    }
                }
            }
        }
    }
}