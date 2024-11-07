package com.example.android_vizhener.mapper

/**
 * @author Lapoushko
 */
class KeyMapper {
    fun mapper(message: String, key: String): String{
        var res = ""
        message.toList().forEachIndexed{ index, _ ->
            res += key[index % key.length]
        }
        return res.uppercase().replace(Regex("[^А-Яа-яЁё]"), "")
    }
}