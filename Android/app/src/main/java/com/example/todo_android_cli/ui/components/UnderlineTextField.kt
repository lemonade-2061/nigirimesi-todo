package com.example.todo_android_cli.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun UnderlineTextField(
    value: String,
    onValueChange: (String) -> Unit,
    labelText: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.padding(vertical = 0.dp, horizontal = 0.dp)
            .heightIn(min = 0.dp)
    ) {
        TextField(
            value = value,
            textStyle = TextStyle(
                color = Color.White.copy(alpha = 0.5f),
                fontSize = 20.sp
            ),
            onValueChange = onValueChange,
            placeholder = {
                Text(
                    text = labelText,
                    color = Color.White.copy(alpha = 0.5f),
                    fontSize = 20.sp
                )
            },

            colors = TextFieldDefaults.colors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent,
                errorIndicatorColor = Color.Transparent,
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent,
                focusedTextColor = Color.White.copy(alpha = 0.5f),
                unfocusedTextColor = Color.White.copy(alpha = 0.5f),
                focusedPlaceholderColor = Color.White.copy(alpha = 0.5f),
                unfocusedPlaceholderColor = Color.White.copy(alpha = 0.5f),
                cursorColor = White
            ),

            modifier = Modifier.fillMaxWidth()
                .offset(y = (13).dp)
        )
        HorizontalDivider(
            modifier = Modifier.fillMaxWidth(),
            thickness = 1.dp,
            color = Color.White.copy(alpha = 0.5f)
        )

    }
}

@Preview(showBackground = true, name = "入力欄")
@Composable
fun UnderlineTextFieldPreview() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    )
    Column() {
        UnderlineTextField(
            value = "lemonade",
            onValueChange = {},
            labelText = "Username",
            modifier = Modifier.padding(top = 16.dp)
        )
        UnderlineTextField(
            value = "",
            onValueChange = {},
            labelText = "Password",
            modifier = Modifier.padding(top = 16.dp)
        )
    }

}