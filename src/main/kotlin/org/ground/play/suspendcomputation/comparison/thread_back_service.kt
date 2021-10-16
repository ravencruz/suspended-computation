package org.ground.play.suspendcomputation.comparison

import kotlin.concurrent.thread

fun main() {
    println("Hi")
    repeat(100_000) {
        thread {
            Thread.sleep(1000L)
            print(".")
        }
    }
}