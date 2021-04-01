package com.example.Pratodos

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_pao_de_queijo.*

class PaoDeQueijo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pao_de_queijo)

        go_back_button.setOnClickListener{
            finish()
        }
    }

    fun encerrarActivity(){
        finish()
    }
}