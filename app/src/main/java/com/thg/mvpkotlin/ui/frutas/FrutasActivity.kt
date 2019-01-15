package com.thg.mvpkotlin.ui.frutas

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.thg.mvpkotlin.R
import kotlinx.android.synthetic.main.activity_frutas.*

class FrutasActivity : AppCompatActivity(), FrutasContratos.View {

    private val presenter = FrutasPresenter(this)

    private lateinit var adapter: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frutas)

        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_2, android.R.id.text2)

        rvFrutas.adapter = adapter

        presenter.buscaFrutas()
    }

    override fun mostraFrutas(frutas: MutableList<String>) {
        adapter.clear()
        frutas.forEach { fruta ->
            adapter.add(fruta)
        }
    }

}
