package com.thg.mvpkotlin.ui.main

import com.thg.mvpkotlin.model.RepositorioSessao

class LoginPresenter(private val view: LoginContrato.View) : LoginContrato.Presenter {

    private val repositorioSessao = RepositorioSessao()

    override fun loginClicado(nome: String, senha: String) {
        if (nome.isEmpty()) {
            view.mostrarToast("Por favor digite um nome.")
            return
        }

        if (senha.isEmpty()) {
            view.mostrarToast("Por favor digite uma senha.")
            return
        }

        val loginComSucesso = repositorioSessao.login(nome, senha)

        if (loginComSucesso) {
            view.mostrarToast("Sucesso!!")
            view.chamaActivityFrutas()
        } else
            view.mostrarToast("Erro ao efetuar o login!!")
    }
}