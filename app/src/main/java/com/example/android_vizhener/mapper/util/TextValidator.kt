package com.example.android_vizhener.mapper.util

/**
 * @author Lapoushko
 */
class TextValidator {
    private val letters = "йцукенгшщзхъэждлорпавыфячсмитьбю"
    fun validate(input: String): String {
        val alphabet = letters + letters.uppercase()

        return input.filter { it in alphabet }.uppercase()
    }
}