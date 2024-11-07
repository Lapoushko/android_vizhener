package com.example.android_vizhener.calculate

/**
 * @author Lapoushko
 */
class CreateSheet {
    val alph: List<Char> =
        "ёйцукенгшщзхъэждлорпавыфячсмитьбю".uppercase().replace("Ё", "").toList().sorted()

    fun create(): Map<Char, List<Char>> {
        return HashMap<Char, List<Char>>().apply {
            alph.forEachIndexed { index, char ->
                this[char] = alph.drop(index) + alph.take(index)
            }
        }
    }
}