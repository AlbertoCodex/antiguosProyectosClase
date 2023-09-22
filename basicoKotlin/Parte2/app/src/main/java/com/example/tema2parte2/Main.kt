package com.example.tema2parte2

fun main() {

    var x:SerVivo = SerVivo(3)
    var y:SerVivo = SerVivo(5)

    println(x.mayor(y))

    var xH:Humano = Humano("Homero",34)
    var yH:Humano = Humano("Bart", 9)

    println(xH.mayor(yH))
}