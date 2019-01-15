package com.thg.mvpkotlin.ui.main

interface LoginContrato {

    interface View {

        fun mostrarToast(menssagem: String)

        fun chamaActivityFrutas()

    }

    interface Presenter {
        //sera chamado quando o botão de "Entrar" for clicado
        fun loginClicado(nome: String, senha: String)
    }
}