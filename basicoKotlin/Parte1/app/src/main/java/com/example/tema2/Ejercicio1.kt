package com.example.tema2

import kotlin.io.readLine as readLine

fun main() {
    pocion()
}

fun pocion() {
    println("¿Cuántos miligramos tiene la poción?")
    val pocion = readLine()!!
    if (pocion.toInt() > 100) {
        println("¡Felicidades, es una buena poción!")
    } else {
        println("La poción es mediocre, sangre sucia inmunda")
    }
}
