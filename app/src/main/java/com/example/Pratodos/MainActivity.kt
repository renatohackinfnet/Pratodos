package com.example.Pratodos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    data class DadosLogin(var email: String, var senha: String)
    var listaDeHashes = mutableListOf<Int>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val logInRenato = DadosLogin("renato", "hack")
        val hash = logInRenato.hashCode()
        listaDeHashes.add(hash)

    }

    fun clickBotaoEntrar(view: View){

        var button : Button = findViewById(R.id.button_login)
        var email : TextView = findViewById(R.id.email_login)
        var senha : TextView = findViewById(R.id.password_login)

        val dadosDeLogin = MainActivity.DadosLogin(email.text.toString(), password_login.text.toString())

        val hash = dadosDeLogin.hashCode()

        println(listaDeHashes)

        if(hash in listaDeHashes) {
            val intent = Intent(this, CardapioReceitas::class.java)
            startActivity(intent)
        }

    }

}



