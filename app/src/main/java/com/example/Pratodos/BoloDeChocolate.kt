package com.example.Pratodos

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_bolo_de_chocolate.*

class BoloDeChocolate : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bolo_de_chocolate)

        go_voltar2_button.setOnClickListener {
            finish()
        }
    }

}