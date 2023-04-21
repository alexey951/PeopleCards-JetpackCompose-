package com.example.composelessenone

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.detectDragGesturesAfterLongPress
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.interaction.DragInteraction
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
                ListItem("Скарлетт Йоханссон", "Актриса, родилась в США, г.Нью-Йорк, 38 лет.")
                ListItem("Скарлетт Йоханссон", "Актриса, родилась в США, г.Нью-Йорк, 38 лет.")
                ListItem("Скарлетт Йоханссон", "Актриса, родилась в США, г.Нью-Йорк, 38 лет.")
                ListItem("Скарлетт Йоханссон", "Актриса, родилась в США, г.Нью-Йорк, 38 лет.")
                ListItem("Скарлетт Йоханссон", "Актриса, родилась в США, г.Нью-Йорк, 38 лет.")
                ListItem("Скарлетт Йоханссон", "Актриса, родилась в США, г.Нью-Йорк, 38 лет.")
                ListItem("Скарлетт Йоханссон", "Актриса, родилась в США, г.Нью-Йорк, 38 лет.")
                ListItem("Скарлетт Йоханссон", "Актриса, родилась в США, г.Нью-Йорк, 38 лет.")
                ListItem("Скарлетт Йоханссон", "Актриса, родилась в США, г.Нью-Йорк, 38 лет.")
                ListItem("Скарлетт Йоханссон", "Актриса, родилась в США, г.Нью-Йорк, 38 лет.")
            }
        }
    }
}

@Composable
private fun ListItem(name: String, prof: String) {
    Card(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
        ,
        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp
    ) {
        Box() {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.img1),
                    contentDescription = "image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(5.dp)
                        .size(64.dp)
                        .clip(CircleShape)
                )
                Column(
                    modifier = Modifier.padding(start = 16.dp)
                ) {
                    Text(text = name)
                    Text(text = prof)
                }
            }
        }
    }
}

