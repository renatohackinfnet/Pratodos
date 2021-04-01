package com.example.Pratodos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bolo_de_banana.*

class BoloDeBanana : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bolo_de_banana)

        button.setOnClickListener {
            finish()
        }
    }

    fun abrirCardapioReceitas() {
        val intent = Intent(this, CardapioReceitas::class.java )
        startActivity(intent)
    }
}