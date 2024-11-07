package com.example.android_vizhener.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android_vizhener.viewModel.VizhenerViewModel

/**
 * @author Lapoushko
 */

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(viewModel: VizhenerViewModel) {

    val message by viewModel.message.collectAsState()
    val key by viewModel.key.collectAsState()
    val cypher by viewModel.cypher.collectAsState()

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text("Шифр Виженера") }
            )
        }
    ) { innerPadding ->
        Column(
            Modifier.padding(innerPadding).verticalScroll(rememberScrollState())
        ) {
            TextFieldOption(
                text = message,
                onTextChange = {
                    viewModel.updateMessage(it)
                },
                label = "Ваш текст"
            )

            TextFieldOption(
                text = key,
                onTextChange = {
                    viewModel.updateKey(it)
                },
                label = "Ваш ключ"
            )

            Button(onClick = {
                viewModel.encrypt()
            }, modifier = Modifier.fillMaxWidth().padding(horizontal = 50.dp) ) {
                Text(text = "Зашифровать")
            }

            Button(onClick = {
                viewModel.decrypt()
            }, modifier = Modifier.fillMaxWidth().padding(horizontal = 50.dp) ) {
                Text(text = "Расшифровать")
            }
            Text(modifier = Modifier
                .padding(horizontal = 10.dp),
                text = cypher)
        }
    }
}

@Composable
fun TextFieldOption(
    text: String,
    onTextChange: (String) -> Unit,
    imageVector: ImageVector = Icons.Outlined.Edit,
    keyboardType: KeyboardType = KeyboardType.Text,
    label: String
) {
    TextField(modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 20.dp, vertical = 10.dp)
        .clip(RoundedCornerShape(20.dp)),
        value = text,
        onValueChange = {
            onTextChange(it)
        },
        placeholder = {
            Text(
                text = label, fontSize = 15.sp
            )
        },
        keyboardOptions = KeyboardOptions(keyboardType = keyboardType),
        leadingIcon = {
            Icon(
                imageVector = imageVector, contentDescription = null
            )
        }
    )
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview(){
    MainScreen(viewModel = VizhenerViewModel())
}