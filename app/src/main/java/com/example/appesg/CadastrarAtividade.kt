package com.example.appesg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class CadastrarAtividade : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.hide();
        setContentView(R.layout.activity_cadastrar_atividade)
    }
}