package com.example.android_vizhener.mapper.util

import com.example.android_vizhener.util.Constants

/**
 * @author Lapoushko
 */
class TextValidator {
    private val letters = Constants.alph
    fun validate(input: String): String {
        val normalizedInput = input
            .uppercase()
            .replace("Ё", "Е")

        return normalizedInput.filter { it in letters }
    }
}