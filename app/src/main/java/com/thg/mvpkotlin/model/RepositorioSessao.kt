package com.thg.mvpkotlin.model

class RepositorioSessao {

    val nome = "Thiago"
    val senha = "123456"

    fun login(mNome: String, mSenha: String) = (mNome == nome && mSenha == senha)
}