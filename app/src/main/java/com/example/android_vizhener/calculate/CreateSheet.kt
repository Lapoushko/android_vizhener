package com.example.android_vizhener.calculate

import com.example.android_vizhener.util.Constants

/**
 * @author Lapoushko
 */
class CreateSheet {
    private val alph: List<Char> =
        Constants.alph.toList()

    fun create(): Map<Char, List<Char>> {
        return HashMap<Char, List<Char>>().apply {
            alph.forEachIndexed { index, char ->
                this[char] = alph.drop(index) + alph.take(index)
            }
        }
    }
}