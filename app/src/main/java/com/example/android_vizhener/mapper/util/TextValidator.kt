package com.example.android_vizhener.mapper.util

import com.example.android_vizhener.util.Constants

/**
 * @author Lapoushko
 */
class TextValidator {
    private val letters = Constants.alph
    fun validate(input: String): String {
        val alphabet = letters.uppercase()
        return input.filter { it in alphabet }.uppercase()
    }
}