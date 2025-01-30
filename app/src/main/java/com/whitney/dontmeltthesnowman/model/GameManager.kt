package com.whitney.dontmeltthesnowman.model

import com.whitney.dontmeltthesnowman.R

class GameManager {

    private var lettersUsed: String = ""
    private lateinit var underscoreWord: String
    private lateinit var wordToGuess: String
    private val maxTries = 7
    private var currentTries = 0
    private var drawable: Int = R.drawable.game0

    //makes words into underscores
    fun generateWordUnderscore(word: String) {
        val stringBuilder = StringBuilder()

        word.forEach { char ->
            if (char == '/') {
                stringBuilder.append("_")
            } else {
                stringBuilder.append("_")
            }
        }
        underscoreWord = stringBuilder.toString()
    }
    private fun getSnowmanDrawable(): Int {
        return when (currentTries) {
            0 -> R.drawable.game0
            1 -> R.drawable.game1
            2 -> R.drawable.game2
            3 -> R.drawable.game3
            4 -> R.drawable.game4
            5 -> R.drawable.game5
            6 -> R.drawable.game6
            7 -> R.drawable.game7
            else -> R.drawable.game7

        }

    }
}