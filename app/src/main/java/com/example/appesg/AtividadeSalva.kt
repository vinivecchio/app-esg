package com.example.appesg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AtividadeSalva : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.hide();
        setContentView(R.layout.activity_atividade_salva)
    }
}