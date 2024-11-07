package com.example.android_vizhener.screen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.android_vizhener.ui.theme.Android_vizhenerTheme
import com.example.android_vizhener.viewModel.VizhenerViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Android_vizhenerTheme {
                MainScreen(viewModel = VizhenerViewModel())
            }
        }
    }
}