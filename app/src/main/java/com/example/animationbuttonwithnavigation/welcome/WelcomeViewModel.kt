package com.example.vocabularytrainer.presentation.welcome

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Job
import javax.inject.Inject

@HiltViewModel
class WelcomeViewModel@Inject constructor(): ViewModel() {
    var job: Job? by mutableStateOf(null)
    var isButtonDoAction: Boolean? by mutableStateOf(false)

    override fun onCleared() {
        Log.d("LOL", "onCleared: ")
        super.onCleared()
    }
}