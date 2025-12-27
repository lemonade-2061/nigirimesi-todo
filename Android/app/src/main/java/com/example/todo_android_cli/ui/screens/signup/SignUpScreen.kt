package com.example.todo_android_cli.ui.screens.signup

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.todo_android_cli.ui.components.UnderlineTextField

@Composable
fun SignUpScreen() {
    val gradientColor = listOf(
        Color(0xFF6075FE),
        Color(0xFF090760),
        Color(0xFFA13EF8)
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    colors = gradientColor,
                    start = Offset(0f,0f),
                    end = Offset(0f, Float.POSITIVE_INFINITY)
                )
            )
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            "SignUp",
            fontSize = 48.sp,
            color = Color.White
        )
        Spacer(modifier = Modifier.height(60.dp))
        UnderlineTextField(
            value = "",
            onValueChange = {},
            labelText = "Username"
        )
        UnderlineTextField(
            value = "",
            onValueChange = {},
            labelText = "Password"
        )
        UnderlineTextField(
            value = "",
            onValueChange = {},
            labelText = "Confirm Password"
        )
        Spacer(modifier = Modifier.height(200.dp))
        Button(
            onClick = {},
            shape = RoundedCornerShape(percent = 50),
            elevation = ButtonDefaults.buttonElevation(defaultElevation = 8.dp),
            modifier = Modifier
                .width(157.dp)
                .height(59.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White,
                contentColor = Color.White
            )

        ) {
            Text(
                "Sign Up",
                color = Color.Black,
                fontSize = 24.sp
            )
        }
    }





}
@Preview(showBackground = true, name = "サインアップ画面プレビュー")
@Composable
fun SignUpScreenPreview() {
    SignUpScreen()
}






