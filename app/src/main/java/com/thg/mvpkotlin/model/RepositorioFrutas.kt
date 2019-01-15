package com.thg.mvpkotlin.model

class RepositorioFrutas {

    private val listaFrutas = mutableListOf<String>()

    fun getFrutas(): MutableList<String> {

        var qtd = 100
        for (i in 1..qtd) {
            listaFrutas.add("Fruta - $i")
            qtd++
        }
        return listaFrutas
    }
}