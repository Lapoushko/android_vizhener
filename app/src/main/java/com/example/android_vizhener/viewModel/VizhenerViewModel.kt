package com.example.android_vizhener.viewModel

import androidx.lifecycle.ViewModel
import com.example.android_vizhener.calculate.CreateSheet
import com.example.android_vizhener.calculate.Decryptor
import com.example.android_vizhener.calculate.Encryptor
import com.example.android_vizhener.mapper.CryptMapper
import com.example.android_vizhener.mapper.KeyMapper
import com.example.android_vizhener.mapper.MessageMapper
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

/**
 * @author Lapoushko
 */
class VizhenerViewModel() : ViewModel() {

    private val createSheet = CreateSheet()
    private val keyMapper = KeyMapper()
    private val messageMapper = MessageMapper()
    private val cryptMapper = CryptMapper()

    private val sheet = createSheet.create()

    private val encryptor: Encryptor = Encryptor(
        sheet = sheet,
        keyMapper = keyMapper,
        messageMapper = messageMapper
    )

    private val decryptor: Decryptor = Decryptor(
        sheet = sheet,
        messageMapper = messageMapper,
        keyMapper = keyMapper
    )

    private val _message: MutableStateFlow<String> = MutableStateFlow("")
    val message: StateFlow<String> = _message.asStateFlow()

    private val _key: MutableStateFlow<String> = MutableStateFlow("")
    val key: StateFlow<String> = _key.asStateFlow()

    private val _cypher: MutableStateFlow<String> = MutableStateFlow("")
    val cypher: StateFlow<String> = _cypher.asStateFlow()

    fun updateMessage(it: String) {
        _message.value = it
    }

    fun updateKey(it: String) {
        _key.value = it
    }

    fun encrypt() {
        _cypher.value =
            cryptMapper.mapper(encryptor.encrypt(message = message.value, key = key.value))
    }

    fun decrypt() {
        _cypher.value =
            cryptMapper.mapper(decryptor.decrypt(crypt = message.value, key = key.value))
    }
}