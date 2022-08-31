package com.deeppowercrew.fca

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun myItemRow(item: ItemRowModel) {
    var isExpanded by remember {
        mutableStateOf(false)
    }

    Row(

        modifier = Modifier
            .padding(5.dp)
            .fillMaxWidth()
            .background(Color.White)
    ) {
        Image(
            painter = painterResource(id = item.imageId), contentDescription = "image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(5.dp)
                .size(180.dp)
                .clip(CircleShape)
        )
        Column(
            modifier = Modifier
                .padding(start = 12.dp, top = 5.dp)
        ) {
            Text(
                text = item.title,
                style = TextStyle(fontSize = 25.sp, fontStyle = FontStyle.Italic)
            )

            Text(
                modifier = Modifier.clickable { isExpanded = !isExpanded },
                maxLines = if (isExpanded) Int.MAX_VALUE else 1,
                text = item.content,
                style = TextStyle(fontSize = 16.sp, fontStyle = FontStyle.Normal)
            )
        }

    }
}