package com.thg.mvpkotlin.ui.main

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.thg.mvpkotlin.R
import com.thg.mvpkotlin.ui.frutas.FrutasActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(), LoginContrato.View {

    private val presenter: LoginPresenter = LoginPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginBtnEntrar.setOnClickListener {

            presenter.loginClicado(nome = loginEdtNome.text.toString(),
                                   senha = loginEdtSenha.text.toString())
        }

    }

    override fun mostrarToast(menssagem: String) {
        Toast.makeText(this, menssagem, Toast.LENGTH_SHORT).show()
    }

    override fun chamaActivityFrutas() {
        startActivity(Intent(this, FrutasActivity::class.java))
        finish()
    }
}
