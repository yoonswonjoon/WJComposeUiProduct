package com.vlm.mylibrary.text

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


/*
* 제목 20
* 부제목 16 14
* 내용 16 14
* 경고 12
*
* */


@Composable
fun TextTitle(
    modifier : Modifier = Modifier,
    text : String?,
    color : Color = Color.Black,
    style : TextStyle = MaterialTheme.typography.h6,
    fontWeight : FontWeight = FontWeight.Normal,
    textAlign: TextAlign = TextAlign.Start,
    visible: Boolean = text != null
){
    if(visible && text!=null){
        Text(
            modifier = modifier,
            text = text,
            style = style,
            color = color,
            textAlign = textAlign,
            fontWeight =fontWeight
        )
    }
}

@Composable
fun TextSubTitleFirst(
    modifier : Modifier = Modifier,
    text : String?,
    color : Color = Color.Black,
    style : TextStyle = MaterialTheme.typography.subtitle1,
    fontWeight : FontWeight = FontWeight.Normal,
    textAlign: TextAlign = TextAlign.Start,
    visible: Boolean = text != null
){
    if(visible && text!=null){
        Text(
            modifier = modifier,
            text = text!!,
            style = style,
            color = color,
            textAlign = textAlign,
            fontWeight =fontWeight
        )
    }
}
@Composable
fun TextSubTitleSecond(
    modifier : Modifier = Modifier,
    text : String?,
    color : Color = Color.Black,
    style : TextStyle = MaterialTheme.typography.subtitle2,
    fontWeight : FontWeight = FontWeight.Normal,
    textAlign: TextAlign = TextAlign.Start,
    visible: Boolean = text != null
){
    if(visible && text!=null){
        Text(
            modifier = modifier,
            text = text,
            style = style,
            color = color,
            textAlign= textAlign,
            fontWeight =fontWeight
        )
    }
}
@Composable
fun TextBodyFirst(
    modifier : Modifier = Modifier,
    text : String?,
    color : Color = Color.Black,
    style : TextStyle = MaterialTheme.typography.body1,
    fontWeight : FontWeight = FontWeight.Normal,
    textAlign: TextAlign = TextAlign.Start,
    visible: Boolean = text != null
){
    if(visible && text!=null){
        Text(
            modifier = modifier,
            text = text,
            style = style,
            color = color,
            textAlign = textAlign,
            fontWeight =fontWeight
        )
    }
}
@Composable
fun TextBodySecond(
    modifier : Modifier = Modifier,
    text : String?,
    color : Color = Color.Black,
    style : TextStyle = MaterialTheme.typography.body2,
    fontWeight : FontWeight = FontWeight.Normal,
    textAlign: TextAlign = TextAlign.Start,
    visible: Boolean = text != null
){
    if(visible && text!=null){
        Text(
            modifier = modifier,
            text = text,
            style = style,
            color = color,
            textAlign = textAlign,
            fontWeight =fontWeight
        )
    }
}
@Composable
fun TextError(
    modifier : Modifier = Modifier,
    text : String?,
    color : Color = Color.Red,
    style : TextStyle = MaterialTheme.typography.caption,
    fontWeight : FontWeight = FontWeight.Normal,
    textAlign: TextAlign = TextAlign.Start,
    visible: Boolean = text != null
){
    if(visible && text!=null){
        Text(
            modifier = modifier,
            text = text,
            style = style,
            color = color,
            textAlign = textAlign,
            fontWeight =fontWeight
        )
    }
}

@Composable
fun LabelView(
    modifier : Modifier = Modifier,
    labelText : String,
    contents : @Composable ColumnScope.()->Unit
){
    Column(modifier = modifier) {
        TextBodySecond(text = labelText)
        Spacer(modifier = Modifier.height(5.dp))
        contents()
    }
}


@Preview
@Composable
fun TextTitlePreview(){
    TextTitle(text = "타이틀 1")
}
@Preview
@Composable
fun TextSubTitleFirstPreview(){
    TextSubTitleFirst(text = "서브 타이틀 1")
}
@Preview
@Composable
fun TextSubTitleSecondPreview(){
    TextSubTitleSecond(text = "서브 타이틀 2")
}
@Preview
@Composable
fun TextBodyFirstPreview(){
    TextBodyFirst(text = "바디 1")
}
@Preview
@Composable
fun TextBodySecondPreview(){
    TextBodySecond(text = "바디 2")
}
@Preview
@Composable
fun TextCautionPreview(){
    TextError(text = "에러 1")
}
