package com.vlm.mylibrary.button

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun BasicButton(
    title : String,
    onClick : () -> Unit
){
    Button(onClick = { onClick() }){
        Text(text = title)
    }
}