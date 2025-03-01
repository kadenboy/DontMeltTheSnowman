package com.whitney.dontmeltthesnowman.viewmodel

import android.graphics.drawable.Drawable

sealed class GameState {
    class Running (val lettersUsed: String,
        val underscoreWord: String,
        val drawable: Int) : GameState()
    class Lost(val wordToGuess: String) : GameState()
    class Won(val wordToGuess: String) : GameState()
}