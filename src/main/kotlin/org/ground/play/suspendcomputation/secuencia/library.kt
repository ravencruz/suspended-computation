package org.ground.play.suspendcomputation.secuencia

fun main(){
    val lista = listOf(1,2,3,4,5)

    val res = lista.filter { it > 2 }.size
    println(res)

    val res1 = lista.count { it > 2 }
    println(res1)




    val listaUnsorted = listOf(10,22,13,14,5)

    val sorted = listaUnsorted.sortedBy { it }.reversed()
    println(sorted)

    val sorted1 = listaUnsorted.sortedByDescending { it }
    println(sorted1)
}