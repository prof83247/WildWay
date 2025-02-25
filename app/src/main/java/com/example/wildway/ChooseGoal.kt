package com.example.wildway

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.wildway.ui.theme.AnotherJustOneTime
import com.example.wildway.ui.theme.montserratFamily
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.platform.LocalContext
import com.example.wildway.ui.theme.BluePurple
import com.example.wildway.ui.theme.CianBlue

class ChooseGoal : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Goal()
        }
    }
}

@Composable
fun Goal() {

    val context = LocalContext.current

    Column(
        modifier = androidx.compose.ui.Modifier
            .fillMaxSize()
            .padding(vertical = 45.dp, horizontal = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            "Какова ваша цель?",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = montserratFamily,
            fontStyle = FontStyle.Normal,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.padding(bottom = 5.dp))
        Text(
            "Это поможет нам подобрать\nдля вас лучшую программу.",
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            fontFamily = montserratFamily,
            fontStyle = FontStyle.Normal,
            color = AnotherJustOneTime
        )
        Spacer(modifier = Modifier.padding(bottom = 50.dp))

        Box(modifier = Modifier.size(275.dp, 478.dp)
            .background(Brush.linearGradient(listOf(BluePurple, CianBlue)))) {

        }
        Spacer(Modifier.padding(bottom = 75.dp))
        Button(
            onClick = { context.startActivity(Intent(context, SuccessReg::class.java)) },
            Modifier.size(315.dp, 60.dp)
        ) {
            Text(
                "Подтвердить",
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.Normal,
                fontFamily = montserratFamily,
                fontSize = 16.sp
            )
        }
    }
}