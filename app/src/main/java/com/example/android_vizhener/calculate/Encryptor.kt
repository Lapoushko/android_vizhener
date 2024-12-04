package com.example.android_vizhener.calculate

import com.example.android_vizhener.mapper.KeyMapper
import com.example.android_vizhener.mapper.MessageMapper

/**
 * @author Lapoushko
 */
class Encryptor(
    private val sheet: Map<Char, List<Char>>,
    private val keyMapper: KeyMapper,
    private val messageMapper: MessageMapper
) {
    fun encrypt(message: String, key: String): String {
        var res = ""
        val newKey = keyMapper.invoke(message = message, key = key)
        val newMessage = messageMapper.invoke(message)
        val header = sheet.values.toList()[0]
        for (index in newMessage.toList().indices) {
            res += sheet[newKey[index]]?.get(header.indexOf(newMessage[index]))
        }
        return res
    }
}