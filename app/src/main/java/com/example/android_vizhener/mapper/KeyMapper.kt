package com.example.android_vizhener.mapper

/**
 * @author Lapoushko
 */
class KeyMapper {
    fun invoke(message: String, key: String): String{
        var res = ""
        message.toList().forEachIndexed{ index, _ ->
            res += key[index % key.length]
        }
        return validate(res)
    }

    fun validate(input: String) : String{
        return input.uppercase()
            .replace(Regex("[^А-Яа-яЁё]"), "")
            .replace(Regex("[Ёё]"), "")
    }
}