package com.example.appesg

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView

private const val REQUEST_IMAGE_CAPTURE = 1
class CadastrarAtividade : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.hide();
        setContentView(R.layout.activity_cadastrar_atividade)
        val btn_adicionar_foto:Button = findViewById<Button>(R.id.btn_adicionar_foto)
        btn_adicionar_foto.setOnClickListener{
            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE)
        }
        val btnSalvarAtividade:Button = findViewById<Button>(R.id.btn_salvar_atividade)
        btnSalvarAtividade.setOnClickListener{
            val i = Intent(this, AtividadeSalva::class.java)
            startActivity(i)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        val image:ImageView = findViewById<ImageView>(R.id.image)
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            val imageBitmap = data?.extras?.get("data") as Bitmap
            image.setImageBitmap(imageBitmap)
        }
    }
}