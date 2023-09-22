package com.example.tema2

import kotlin.io.readLine as readLine

fun main() {
    tiempo()
}

fun tiempo() {
    println("¿Cómo es el clima de hoy?")
    println("1 = Soleado")
    println("2 = Nublao")
    println("3 = Lluvioso")
    println("4 = Tormentoso")
    println("5 = Nevado")
    val n = readLine()!!.toInt()

    when(n) {
        1 -> {println("El clima es soleado")}
        2 -> {println("El clima es nublado")}
        3 -> {println("El clima es lluvioso")}
        4 -> {println("El clima es tormentoso")}
        5 -> {println("El clima es nevado")}
        else -> {println("Pregúntale a Google")}
    }
}