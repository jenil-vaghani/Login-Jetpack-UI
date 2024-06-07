package com.ydh.loginemptyui

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ydh.loginemptyui.ui.theme.LoginEmptyUITheme
import com.ydh.loginemptyui.ui.theme.colorPrimary
import com.ydh.loginemptyui.ui.theme.colorTeal

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginEmptyUITheme {
                MainScreen()
            }
        }
    }
}

@Composable
@Preview
fun MainScreen() {
    val context = LocalContext.current
    val name by remember { mutableStateOf("") }
    val email by remember { mutableStateOf("") }
    val number by remember { mutableStateOf("") }
    val password by remember { mutableStateOf("") }


    Surface(modifier = Modifier.fillMaxSize(), color = colorPrimary) {
        Column() {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .weight(1f),
                contentAlignment = Alignment.CenterStart
            ) {
                Column(modifier = Modifier.padding(horizontal = 20.dp)) {
                    Text(
                        text = "Create an Account?",
                        color = Color.White,
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 38.sp
                    )
                    Text(
                        text = "Please fill the details below",
                        color = Color.White.copy(0.6f),
                        style = MaterialTheme.typography.titleSmall,
                        fontWeight = FontWeight.Medium,
                        fontSize = 16.sp
                    )
                }
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .weight(1.5f)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .padding(horizontal = 20.dp),
                    verticalArrangement = Arrangement.SpaceEvenly
                ) {
                    EditTextMy(
                        label = "Enter your name",
                        icon = R.drawable.user,
                        remember { mutableStateOf(name) }
                    )
                    EditTextMy(
                        label = "Enter your email",
                        icon = R.drawable.email,
                        name = remember { mutableStateOf(number) }
                    )
                    EditTextMy(
                        label = "Enter your number",
                        icon = R.drawable.phone,
                        name = remember { mutableStateOf(email) }
                    )
                    EditTextMy(
                        label = "Enter your password",
                        icon = R.drawable.lock,
                        name = remember { mutableStateOf(password) }
                    )
                }
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .weight(1f)
                    .padding(horizontal = 20.dp)
            ) {

                Column(
                    modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceEvenly
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp)
                            .clip(RoundedCornerShape(10.dp))
                            .background(colorTeal)
                            .clickable {
                                Toast
                                    .makeText(context, name, Toast.LENGTH_SHORT)
                                    .show()
                            },
                        contentAlignment = Alignment.Center,
                    ) {

                        Text(
                            text = "CREATE PROFILE",
                            color = Color.Black,
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.ExtraBold
                        )
                    }


                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        text = "Already have an account? Log In",
                        color = Color.White,
                        style = MaterialTheme.typography.titleSmall,
                        fontWeight = FontWeight.SemiBold
                    )
                }

            }
        }
    }
}
