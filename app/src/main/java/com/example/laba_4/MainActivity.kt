package com.example.laba_4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.laba_4.ui.CityApp
import com.example.laba_4.ui.theme.Laba4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Laba4Theme {
                CityApp(activity = this)
            }
        }
    }
}
