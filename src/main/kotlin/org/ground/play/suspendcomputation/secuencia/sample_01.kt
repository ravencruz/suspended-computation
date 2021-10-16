package org.ground.play.suspendcomputation.secuencia


import kotlin.random.Random


val seq = sequence {
    println("-- Generating first")
    yield(1)
    println("-- Generating second")
    yieldAll(3..5)
    println("-- yield a list")
    yieldAll(listOf(7, 9))
    println("-- Done")
}

fun main() {
    println("Secuencias")

    for (num in seq) {
        println("Next number is $num")
    }

    val seq = generateSequence { Random.nextInt(5).takeIf {it > 0} }
    val random5 = seq.toList()
    println(random5.size)
    println(random5)

    val numbers = generateSequence(0) { it + 1 }
    println(numbers.take(10).toList())

    val ns = generateSequence(3) { n ->
        println("Generating element")
        (n + 1).takeIf { it < 7 }
    }
    println(ns.first())

    val ns1 = sequence {
        var x = 100
        while (true) {
            yield(x++)
        }
    }
    println(ns1.take(5).toList())

//    println(mySequence()
//        .map { it * it }
//        .filter { it > 10 }
//        //.take(1)) // take is not a terminal operatino
//        .first())

}