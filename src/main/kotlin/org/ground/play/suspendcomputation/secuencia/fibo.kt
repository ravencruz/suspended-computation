package org.ground.play.suspendcomputation.secuencia

fun fibonacci(): Sequence<Int> = sequence {
    var v1 = 0
    yield(v1)

    var v2 = 1
    yield(v2)

    while (true) {
        var next = v1 + v2
        yield(next)

        v1 = v2
        v2 = next
    }

}

fun main() {
    println("fibo")

    fibonacci().take(4).toList().also { println(it) }
//        .toString() eq "[0, 1, 1, 2]"

    fibonacci().take(10).toList().also { println(it) }
//        .toList().toString() eq "[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]"

}