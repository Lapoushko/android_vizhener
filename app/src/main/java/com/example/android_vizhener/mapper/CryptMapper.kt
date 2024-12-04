package com.example.android_vizhener.mapper

class CryptMapper {
    fun invoke(crypt: String): String{
        val result = StringBuilder()

        crypt.forEachIndexed { index, char ->
            result.append(char)
            // После каждой 6-й буквы добавляем пробел
            if ((index + 1) % 6 == 0 && index != crypt.lastIndex) {
                result.append(' ')
            }
        }

        return result.toString()
    }
}
