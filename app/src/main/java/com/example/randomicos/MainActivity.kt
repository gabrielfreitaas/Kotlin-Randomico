package com.example.randomicos

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random


class MainActivity : AppCompatActivity() { // Adicionado elemento View para instancia elementos do XML
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Identifica os elementos do XML
        val buttonRandom = findViewById<Button>(R.id.button_random)
        val textViewNumber = findViewById<TextView>(R.id.textView_number)

        // Identifica as ações de click

        buttonRandom.setOnClickListener(View.OnClickListener {
            textViewNumber.setText(random().toString())
        })


    }


    fun random (): Int{ //Int para retornar um valor inteiro
        // 0 - 49 acrescido de + 1
        return Random.nextInt(50) + 1
    }
}