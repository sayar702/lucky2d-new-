package com.example.lucky2d

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var isThai by remember { mutableStateOf(false) }
            val redColor = Color(0xFFB71C1C)
            val goldColor = Color(0xFFFFD700)

            Surface(modifier = Modifier.fillMaxSize(), color = Color(0xFFFFF8E1)) {
                Column(
                    modifier = Modifier.fillMaxSize().padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Button(
                        onClick = { isThai = !isThai },
                        colors = ButtonDefaults.buttonColors(containerColor = redColor)
                    ) {
                        Text(if (isThai) "မြန်မာ (Myanmar)" else "ภาษาไทย (Thai)", color = goldColor, fontWeight = Bold)
                    }
                    Spacer(modifier = Modifier.height(24.dp))
                    Text(
                        text = if (isThai) "LUCKY 2D (เดโม)" else "LUCKY 2D Demo",
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Bold,
                        color = redColor
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Card(
                        colors = CardDefaults.cardColors(containerColor = redColor),
                        modifier = Modifier.fillMaxWidth().height(120.dp)
                    ) {
                        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                            Text(
                                text = if (isThai) "ผลรางวัล: 79" else "ထွက်ဂဏန်း: 79",
                                fontSize = 32.sp,
                                fontWeight = FontWeight.Bold,
                                color = goldColor
                            )
                        }
                    }
                }
            }
        }
    }
}
