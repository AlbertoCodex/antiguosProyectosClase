package com.example.tema2

import kotlin.io.readLine as readLine

fun main() {
    sumsu()
}

fun sumsu() {
    println("¿Cuántos números quieres sumar?")
    var n = readLine()!!.toInt()
    var resultado = 0
    val i = 1

    for (n in 1..n) {
        resultado += n
    }
    println("La suma de los números es = $resultado (for)")

    while (i==n) {
        resultado+=i
    }
    println("La suma de los números es = $resultado (while)")
}