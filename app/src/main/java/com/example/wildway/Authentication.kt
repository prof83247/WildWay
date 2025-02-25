package com.example.wildway

import android.content.Intent
import android.graphics.drawable.shapes.Shape
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.wildway.ui.theme.CianGreen
import com.example.wildway.ui.theme.TextFieldColor
import com.example.wildway.ui.theme.montserratFamily

class Authentication : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Registr()
        }
    }

    @Composable
    fun Registr() {

        val context = LocalContext.current
        var email by remember { mutableStateOf("") }
        var password by rememberSaveable { mutableStateOf("") }
        var phone by remember { mutableStateOf("") }
        var name by remember { mutableStateOf("") }
        var checked by remember { mutableStateOf(false) }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 45.dp, horizontal = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                "Привет,",
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal,
                fontFamily = montserratFamily,
                fontStyle = FontStyle.Normal
            )
            Spacer(modifier = Modifier.padding(5.dp))
            Text(
                "Создай аккаунт",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = montserratFamily,
                fontStyle = FontStyle.Normal
            )
            Spacer(modifier = Modifier.padding(30.dp))

            OutlinedTextField(
                value = name,
                onValueChange = { name = it },
                shape = CircleShape,
                modifier = Modifier.size(315.dp, 48.dp)
            )
            Spacer(modifier = Modifier.padding(15.dp))

            OutlinedTextField(
                value = phone,
                onValueChange = { phone = it },
                shape = CircleShape,
                modifier = Modifier.size(315.dp, 48.dp)
            )
            Spacer(modifier = Modifier.padding(15.dp))

            OutlinedTextField(
                value = email,
                onValueChange = { email = it },
                shape = CircleShape,
                modifier = Modifier.size(315.dp, 48.dp)
            )
            Spacer(modifier = Modifier.padding(15.dp))

            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                shape = CircleShape,
                modifier = Modifier.size(315.dp, 48.dp)
            )
            Spacer(modifier = Modifier.padding(10.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
            ) {
                Checkbox(
                    checked = checked,
                    onCheckedChange = { checked = it },
                    modifier = Modifier
                        .size(16.dp)
                        .padding(end = 10.dp)
                )
                Text(
                    "Продолжая, вы принимаете нашу Политику конфиденциальности и Условия использования.",
                    fontSize = 10.sp,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight.Normal,
                    fontFamily = montserratFamily
                )
            }
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(
                    onClick = { },
                    Modifier.size(315.dp, 60.dp)
                ) {
                    Text(
                        "Зарегистрироваться",
                        fontStyle = FontStyle.Normal,
                        fontWeight = FontWeight.Normal,
                        fontFamily = montserratFamily,
                        fontSize = 16.sp
                    )
                }
                Spacer(Modifier.padding(20.dp))
                Text(
                    "Или",
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight.Normal,
                    fontFamily = montserratFamily,
                    fontSize = 12.sp
                )
                Spacer(Modifier.padding(20.dp))
                Icon(painter = painterResource(R.drawable.googleicon), contentDescription = null)
                Spacer(Modifier.padding(30.dp))
                Row(modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center) {
                    Text(
                        "Имеете уже аккаунт?",
                        fontStyle = FontStyle.Normal,
                        fontWeight = FontWeight.SemiBold,
                        fontFamily = montserratFamily,
                        fontSize = 14.sp
                    )
                    TextButton(onClick = { context.startActivity(Intent(context, Login::class.java)) }){
                        Text(
                            "Войти",
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.SemiBold,
                            fontFamily = montserratFamily,
                            fontSize = 14.sp,
                            color = CianGreen
                        )
                    }
                }
            }
        }
    }
}
