package com.example.android_vizhener.state

import com.example.android_vizhener.viewModel.Errors

/**
 * @author Lapoushko
 */
interface MainScreenState {
    val message: Input
    val key: Input
    val cypher: String
}

data class Input(
    val text: String,
    val error: Errors?
)