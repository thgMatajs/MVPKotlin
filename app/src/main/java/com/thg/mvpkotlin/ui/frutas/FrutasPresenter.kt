package com.thg.mvpkotlin.ui.frutas

import com.thg.mvpkotlin.model.RepositorioFrutas

class FrutasPresenter(private val view: FrutasContratos.View): FrutasContratos.Presenter {

    private val repositorioFrutas = RepositorioFrutas()

    override fun buscaFrutas() {
        view.mostraFrutas(repositorioFrutas.getFrutas())
    }

}