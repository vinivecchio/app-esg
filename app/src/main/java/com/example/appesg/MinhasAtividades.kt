package com.example.appesg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MinhasAtividades : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.hide();
        setContentView(R.layout.activity_minhas_atividades)

        val btnAddNewActivity: Button = findViewById<Button>(R.id.btn_cadastrar_atividade)
        btnAddNewActivity.setOnClickListener{
            val i = Intent(this, CadastrarAtividade::class.java)
            startActivity(i)
        }
    }
}