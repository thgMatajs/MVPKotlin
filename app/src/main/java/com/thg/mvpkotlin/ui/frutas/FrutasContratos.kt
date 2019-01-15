package com.thg.mvpkotlin.ui.frutas

interface FrutasContratos {

    interface View {
        fun mostraFrutas(frutas: MutableList<String>)

    }

    interface Presenter {
        fun buscaFrutas()
    }
}