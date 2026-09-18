package com.example.ssigam

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class InicioUsuario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio_usuario)

        // Cualquier parte de la pantalla te lleva a UbicacionIncidente
        // Así no dependemos de botones con error
        findViewById<View>(R.id.layoutRoot).setOnClickListener {
            startActivity(Intent(this, UbicacionIncidente::class.java))
        }
    }
}