package net.cristian2259.webdemo

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class Interacter {
    var currentValue by mutableStateOf(100.0)

    fun increment() {
        currentValue += 1.0
    }

    fun decrement() {
        currentValue -= 1.0
    }

}