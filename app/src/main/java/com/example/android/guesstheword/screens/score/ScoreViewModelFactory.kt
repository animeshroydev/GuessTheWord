package com.example.android.guesstheword.screens.score

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

/**
 * When the user ends the game, the ScoreFragment does not show the score.
 * You want a ViewModel to hold the score to be displayed by the ScoreFragment.
 * You'll pass in the score value during the ViewModel initialization using the factory method pattern.
 *
 * This class will be responsible for instantiating the ScoreViewModel object
 */

class ScoreViewModelFactory(private val finalScore: Int): ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ScoreViewModel::class.java)) {
            return ScoreViewModel(finalScore) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }

}