package com.example.android_vizhener.calculate

import com.example.android_vizhener.mapper.KeyMapper
import com.example.android_vizhener.mapper.MessageMapper

/**
 * @author Lapoushko
 */
class Decryptor(
    private val sheet: Map<Char, List<Char>>,
    private val keyMapper: KeyMapper,
    private val messageMapper: MessageMapper
){
    fun decrypt(crypt: String, key: String) : String{
        var res = ""
        val newKey = keyMapper.invoke(message = crypt, key = key)
        val newCrypt = messageMapper.invoke(crypt)
        val header = sheet.values.toList()[0]
        for (index in newCrypt.toList().indices){
            res += header[sheet[newKey[index]]?.indexOf(newCrypt[index]) ?: 0]
        }
        return res
    }
}