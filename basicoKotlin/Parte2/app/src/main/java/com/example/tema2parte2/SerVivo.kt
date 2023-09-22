package com.example.tema2parte2

open class SerVivo(var edad:Byte) {

    fun equals(otro:SerVivo):Boolean {
        return this.edad==otro.edad
    }
    fun mayor(otro:SerVivo):SerVivo {
        return if(this.edad>otro.edad) this else otro
    }
    override fun toString():String {
        return "El ser vivo más mayor tiene ${this.edad} años"
    }
}