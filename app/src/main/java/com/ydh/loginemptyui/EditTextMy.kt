package com.ydh.loginemptyui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.selection.LocalTextSelectionColors
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun EditTextMy(label: String, title: String, icon: Int) {


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
//                Basic(
//                    text = title,
//                    color = Color.White,
//                    style = MaterialTheme.typography.titleSmall,
//                    fontWeight = FontWeight.Bold,
//                    fontSize = 16.sp
//                )



                BasicTextField(
                    value = title,
                    onValueChange = {},
                    keyboardActions = KeyboardActions.Default,
                    modifier = Modifier.fillMaxWidth()
                ) {

                }


            }
        }
    }
}