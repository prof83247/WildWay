package com.example.wildway

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.input.nestedscroll.nestedScrollModifierNode
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.wildway.ui.theme.montserratFamily


@Composable
fun HorPag(){
    val pagerState = rememberPagerState(pageCount = { 4 })
    HorizontalPager(state = pagerState) { page ->
        Onboarding1()
        Onboarding2()
        Onboarding3()
        Onboarding4()
    }
}

@Composable
fun Onboarding1(){
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(R.drawable.onboarding1),
            contentDescription = null,
            modifier = Modifier.size(375.dp, 406.dp)
        )
        Text(
            "Отслеживайте свою цель",
            fontSize = 36.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Normal,
            fontFamily = montserratFamily
        )
        Text(
            "Не волнуйтесь, если у вас возникли проблемы с определением ваших целей. " +
                    "Мы можем помочь вам определить ваши цели и отслеживать их.",
            fontSize = 14.sp,
            fontStyle = FontStyle.Normal,
            fontFamily = montserratFamily,
            fontWeight = FontWeight.Normal
        )
        Row(modifier = Modifier.fillMaxSize()
            .padding(25.dp),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.Absolute.Right) {
            Button(onClick = {  },
                modifier = Modifier.size(50.dp)) {
                Text(">")
            }
        }
    }
}

@Composable
fun Onboarding2(){
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally){
        Image(painter = painterResource(R.drawable.onboarding1),
            contentDescription = null,
            modifier = Modifier.size(375.dp, 406.dp))
        Text("Сжигай лишнее",
            fontSize = 36.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Normal,
            fontFamily = montserratFamily)
        Text("Давайте продолжать заниматься, чтобы достичь своих целей, это больно только " +
                "временно, если ты сдашься сейчас, тебе будет больно навсегда.",
            fontSize = 14.sp,
            fontStyle = FontStyle.Normal,
            fontFamily = montserratFamily,
            fontWeight = FontWeight.Normal)
    }
}

@Composable
fun Onboarding3(){
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally){
        Image(painter = painterResource(R.drawable.onboarding1),
            contentDescription = null,
            modifier = Modifier.size(375.dp, 406.dp))
        Text("Питайся правильно",
            fontSize = 36.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Normal,
            fontFamily = montserratFamily)
        Text("Давайте начнем здоровый образ жизни вместе с нами, мы сможем определять ваш " +
                "рацион каждый день. Здоровое питание - это весело",
            fontSize = 14.sp,
            fontStyle = FontStyle.Normal,
            fontFamily = montserratFamily,
            fontWeight = FontWeight.Normal)
    }
}

@Composable
fun Onboarding4(){
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally){
        Image(painter = painterResource(R.drawable.onboarding1),
            contentDescription = null,
            modifier = Modifier.size(375.dp, 406.dp))
        Text("Улучшите качество сна",
            fontSize = 36.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Normal,
            fontFamily = montserratFamily)
        Text("Улучшайте качество своего сна вместе с нами, качественный сон может " +
                "   принести хорошее настроение с утра.",
            fontSize = 14.sp,
            fontStyle = FontStyle.Normal,
            fontFamily = montserratFamily,
            fontWeight = FontWeight.Normal)
    }
}