package com.example.appesg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.hide();
        setContentView(R.layout.activity_main)

        val btnGoToMyActivities:Button = findViewById<Button>(R.id.btn_ver_atividades)
        btnGoToMyActivities.setOnClickListener{
            val i = Intent(this, MinhasAtividades::class.java)
            startActivity(i)
        }
    }

}