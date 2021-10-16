package org.ground.play.suspendcomputation.comparison

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {

    repeat(100_000) {
        launch {
            delay(1000L)
            print(".")
        }
    }
}