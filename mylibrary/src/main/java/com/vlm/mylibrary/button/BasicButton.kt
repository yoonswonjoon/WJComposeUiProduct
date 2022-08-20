package com.vlm.mylibrary.button

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vlm.mylibrary.clickedBasicOrange
import com.vlm.mylibrary.nonClickedBasicGray
import com.vlm.mylibrary.text.TextBodyFirst
import com.vlm.mylibrary.text.TextTitle

@Composable
fun BasicB1utton(
    modifier: Modifier = Modifier,
    onClick : () -> Unit,
    text : String?,
    shape: Shape = RoundedCornerShape(10.dp),
    padding : PaddingValues = PaddingValues(vertical = 5.dp, horizontal = 10.dp)
){
    Surface(
        shape = shape,
        modifier = modifier
            .clip(shape = shape)
            .clickable {
                onClick()
            }
    ) {
        TextBodyFirst(
            text = text,
            modifier = Modifier
                .padding(padding)
        )
    }
}

@Composable
fun GenderPickButton(
    onClick : () -> Unit,
    text : String?,
    clicked: Boolean = false,
    clickedColor : Color = clickedBasicOrange,
    nonClickedColor : Color = nonClickedBasicGray,
    shape: Shape = RoundedCornerShape(10.dp),
    padding : PaddingValues = PaddingValues(vertical = 10.dp, horizontal = 20.dp)
){
    val color = if(clicked) clickedColor else nonClickedColor
    Surface(
        shape = shape,
        modifier = Modifier
            .clip(shape = shape)
            .clickable {
                onClick()
            },
        color = color
    ) {
        TextTitle(
            text = text,
            modifier = Modifier
                .padding(padding)
        )
    }
}

@Composable
fun GenderPickSetButton(
    modifier : Modifier = Modifier,
    clickedGender : Int = 0,
    onClickGender : (Int) ->Unit
){

    Box(modifier = modifier.fillMaxWidth()){
        Row(horizontalArrangement = Arrangement.SpaceEvenly,modifier = Modifier.fillMaxWidth()) {
            GenderPickButton(
                onClick = { onClickGender(1) },
                text = "남",
                clicked = clickedGender == 1
            )
            GenderPickButton(
                onClick = { onClickGender(2) },
                text = "여",
                clicked = clickedGender == 2
            )
        }
    }
}

@Preview()
@Composable
fun BasicButtonPreview(){
//    BasicButton(onClick = {  }, text = "다음")
}

@Preview(name = "genderPick")
@Composable
fun GenderPickButtonPreview(){
    val (gender,setGender) = remember {
        mutableStateOf(0)
    }
    GenderPickSetButton(
        clickedGender = gender,
        onClickGender = setGender
    )
}