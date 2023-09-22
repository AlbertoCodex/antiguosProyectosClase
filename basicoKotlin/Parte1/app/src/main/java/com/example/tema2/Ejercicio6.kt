package com.example.tema2

fun main() {
    pares()
}

fun pares() {
    println("¿Hasta qué número quieres obtener los pares?")
    val n = readLine()!!.toInt()
    var lista = mutableListOf<Int>()

    if (n > 0) {
        for (n in 1..n) {
            if (n % 2 == 0) {
                lista.add(n)
            }
        }

        println(lista)

    } else {
        println("Inserta un número positivo")
        pares()
    }
}