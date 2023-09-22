package com.example.tema2

fun main() {
    peliculas()
}

fun peliculas() {
    var pelicula:String? = null
    var longitud = 0
    var indice = 0
    val lista = listOf("Jumanji","ToyStory","Pulp Fiction","Batman: El caballero de la noche",
        "Kill Bill")
    println("Las películas que hay en la lista son = $lista")

    for (i in lista) {
        if(i.length > longitud) {
            pelicula = i
            longitud = i.length
            indice = lista.indexOf(i)
        }
    }
    println("El título de la película más larga es = Indice: $indice Pelicula: $pelicula")
}