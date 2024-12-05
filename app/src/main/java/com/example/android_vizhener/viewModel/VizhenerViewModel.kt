package com.example.android_vizhener.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.android_vizhener.calculate.Decryptor
import com.example.android_vizhener.calculate.Encryptor
import com.example.android_vizhener.mapper.util.TextValidator
import com.example.android_vizhener.model.Mappers
import com.example.android_vizhener.state.Input
import com.example.android_vizhener.state.MainScreenState

/**
 * @author Lapoushko
 */
class VizhenerViewModel(
    private val validator: TextValidator,
    private val mappers: Mappers,
    sheet: Map<Char, List<Char>>,
) : ViewModel() {
    private val errors: MutableSet<Errors> = Errors.entries.toMutableSet()

    private val encryptor: Encryptor = Encryptor(
        sheet = sheet,
        keyMapper = mappers.keyMapper,
        messageMapper = mappers.messageMapper
    )

    private val decryptor: Decryptor = Decryptor(
        sheet = sheet,
        messageMapper = mappers.messageMapper,
        keyMapper = mappers.keyMapper
    )

    private var _state = MutableMainScreenState()
    val state = _state as MainScreenState

    fun updateMessage(it: String) {
        _state.message = checkErrorInput(
            input = it,
            error = Errors.MESSAGE_ERROR,
            (validator.validate(it).isNotEmpty())
        )
    }

    fun updateKey(it: String) {
        _state.key = checkErrorInput(
            input = it,
            error = Errors.KEY_ERROR,
            (validator.validate(it).isNotEmpty())
        )
    }

    fun encrypt() {
        if (errors.isEmpty()) {
            _state.cypher =
                mappers.cryptMapper.invoke(encryptor.encrypt(message = state.message.text, key = state.key.text))
        }
    }

    fun decrypt() {
        if (errors.isEmpty()) {
            _state.cypher =
                mappers.cryptMapper.invoke(decryptor.decrypt(crypt = state.message.text, key = state.key.text))
        }
    }

    private fun checkErrorInput(
        input: String,
        error: Errors,
        isCorrect: Boolean,
    ): Input {
        if (isCorrect) {
            errors.remove(error)
            return Input(text = input, error = null)
        } else {
            errors.add(error)
            return Input(text = input, error = error)
        }
    }

    private class MutableMainScreenState : MainScreenState {
        override var message: Input by mutableStateOf(Input("", Errors.MESSAGE_ERROR))
        override var key: Input by mutableStateOf(Input("", Errors.KEY_ERROR))
        override var cypher: String by mutableStateOf("")
    }
}

enum class Errors(val naming: String){
    MESSAGE_ERROR("Неправильное сообщение"),
    KEY_ERROR("Неправильный ключ")
}

