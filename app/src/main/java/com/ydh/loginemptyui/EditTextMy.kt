package com.ydh.loginemptyui

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
@Preview
fun PreviewEditTextMy() {
    EditTextMy(label = "Enter your name", icon = R.drawable.lock, name = remember {
        mutableStateOf("jenil")
    })
}

@Composable
fun EditTextMy(label: String, icon: Int, name: MutableState<String>) {
    Log.e("@@@@", "EditTextMy: Compose EDITEXT MY")
    Card(modifier = Modifier, shape = RoundedCornerShape(15.dp)) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color(0xff38304D).copy(0.5f))
                .padding(10.dp)
        ) {
            Icon(
                painterResource(icon),
                contentDescription = null,
                modifier = Modifier
                    .size(45.dp, 38.dp)
                    .padding(horizontal = 10.dp),
                tint = Color.White
            )
            Column() {
                Text(
                    text = label,
                    color = Color.White,
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.Medium,
                    fontSize = 10.sp
                )
                BasicTextField(value = name.value,
                    modifier = Modifier.fillMaxWidth(),
                    textStyle = TextStyle(color = Color.White, fontSize = 18.sp),
                    keyboardActions = KeyboardActions.Default,
                    onValueChange = {
                        name.value = it
                    })

            }
        }
    }
}

