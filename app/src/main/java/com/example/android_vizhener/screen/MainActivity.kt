package com.example.android_vizhener.screen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.android_vizhener.calculate.CreateSheet
import com.example.android_vizhener.mapper.CryptMapper
import com.example.android_vizhener.mapper.KeyMapper
import com.example.android_vizhener.mapper.MessageMapper
import com.example.android_vizhener.mapper.util.TextValidator
import com.example.android_vizhener.model.Mappers
import com.example.android_vizhener.ui.theme.AppTheme
import com.example.android_vizhener.viewModel.VizhenerViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val validator = TextValidator()
        val cryptMapper = CryptMapper()
        val sheet = CreateSheet().create()
        val keyMapper = KeyMapper(validator)
        val messageMapper = MessageMapper(validator)

        setContent {
            AppTheme {
                MainScreen(
                    viewModel = VizhenerViewModel(
                        validator = validator,
                        mappers = Mappers(cryptMapper, keyMapper, messageMapper),
                        sheet = sheet,
                    )
                )
            }
        }
    }
}