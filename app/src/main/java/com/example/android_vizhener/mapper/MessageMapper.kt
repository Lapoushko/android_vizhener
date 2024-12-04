package com.example.android_vizhener.mapper

/**
 * @author Lapoushko
 */
class MessageMapper {
    fun mapper(message: String): String {
        return message
            .uppercase()
            .replace(Regex("[^А-Яа-яЁё]"), "")
            .replace(Regex("[Ёё]"), "")
    }
}