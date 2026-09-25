package com.example.ssigam

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PantallaInicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_inicio)

        val btnIniciarSesion = findViewById<Button>(R.id.btnIniciarSesion)
        val tvRegistro = findViewById<TextView>(R.id.tvRegistro)

        btnIniciarSesion.setOnClickListener {
            startActivity(Intent(this, InicioSesion::class.java))
        }

        tvRegistro.setOnClickListener {
            startActivity(Intent(this, Registro::class.java))
        }
    }
}