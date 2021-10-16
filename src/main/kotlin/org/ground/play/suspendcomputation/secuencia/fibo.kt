package org.ground.play.suspendcomputation.secuencia

fun fibonacci(): Sequence<Int> = sequence {
    TODO()
}

fun generateNFibo(n: Int): List<Int> {
    return fibonacci().take(n).toList().also { println(it) }
}

fun main() {
    generateNFibo(4)
    generateNFibo(10)
}