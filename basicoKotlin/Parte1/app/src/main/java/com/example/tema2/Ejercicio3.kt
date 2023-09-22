package com.example.tema2

import kotlin.io.readLine as readLine

fun main() {
    uber()
}

fun uber() {
    println("¿A qué distancia está el conductor? (Km, ej: 0.5, 1...)")
    val distancia = readLine()!!.toDouble()

    println("¿Está el conductor disponible? (True o False)")
    val disponible = readLine()!!.toBoolean()

    if (distancia<=0.5 && disponible) {
        println("Listo para iniciar recorrido")

    } else if (distancia<=0.5 && !disponible) {
        println("Conductor cercano, pero no disponible")
        uber()
    } else if (distancia>0.5 && disponible) {
        println("Conductor disponible pero muy lejos, aplicarán tarifas más altas")
        uber()
    } else if (distancia>0.5 && !disponible) {
        println("No hay conductores disponibles")
        uber()
    }
}