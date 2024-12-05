package com.example.android_vizhener.mapper

import com.example.android_vizhener.mapper.util.TextValidator

/**
 * @author Lapoushko
 */
class KeyMapper(
    private val validator: TextValidator
) {
    fun invoke(message: String, key: String): String {
        var res = ""
        message.toList().forEachIndexed { index, _ ->
            res += key[index % key.length]
        }
        return validator.validate(res)
    }
}