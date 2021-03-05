package com.example.Pratodos

import android.content.Intent
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_pao_de_queijo.*

class PaoDeQueijo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pao_de_queijo)

        go_back_button.setOnClickListener{
            abrirCardapioReceitas()
        }
    }
    fun abrirCardapioReceitas(){
        val intent = Intent(
            this, CardapioReceitas:: class.java
        )
        startActivity(intent)
    }
}