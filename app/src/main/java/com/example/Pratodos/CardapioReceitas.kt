package com.example.Pratodos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cardapio_receitas.*

class CardapioReceitas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cardapio_receitas)

        receita_pao_de_queijo.setOnClickListener {
            abrirPaoDeQueijo()
        }

        receita_bolo_de_chocolate.setOnClickListener {
            abrirBoloDeChocolate()
        }
        receita_bolo_de_banana.setOnClickListener {
            abrirBoloDeBanana()
        }



    }

    fun abrirPaoDeQueijo() {
        var intent = Intent(this, PaoDeQueijo::class.java)
        startActivity(intent)
    }

    fun abrirBoloDeChocolate() {
        var intent = Intent(this, BoloDeChocolate::class.java)
        startActivity(intent)
    }

    fun abrirBoloDeBanana() {
        var intent = Intent(this, BoloDeBanana::class.java)
        startActivity(intent)
    }

}