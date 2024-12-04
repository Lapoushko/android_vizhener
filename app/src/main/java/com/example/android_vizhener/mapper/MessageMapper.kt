package com.example.android_vizhener.mapper

import com.example.android_vizhener.mapper.util.TextValidator

/**
 * @author Lapoushko
 */
class MessageMapper {
    private val validator = TextValidator()

    fun invoke(message: String): String {
        return validator.validate(message)
    }
}