package com.example.tema2parte2

class Humano(var nombre: String = "", edad: Byte):SerVivo(edad) {

    fun equals(otro:Humano):Boolean {
        return this.nombre==otro.nombre&&this.edad==otro.edad
    }
    fun mayor(otro:Humano):Humano {
        return if(this.edad>otro.edad) this else otro
    }
    override fun toString():String {
        return "El humano más mayor es ${this.nombre} y tiene ${this.edad} años"
    }

}