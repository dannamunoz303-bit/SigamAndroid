package com.example.ssigam

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class InicioSesion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio_sesion)

        val btnUsuario = findViewById<Button>(R.id.btnUsuario)
        val btnConductor = findViewById<Button>(R.id.btnConductor)
        val tvOlvido = findViewById<TextView>(R.id.tvOlvido)

        btnUsuario.setOnClickListener {
            startActivity(Intent(this, InicioUsuario::class.java))
        }

        btnConductor.setOnClickListener {
            startActivity(Intent(this, InicioConductor::class.java))
        }

        tvOlvido.setOnClickListener {
            startActivity(Intent(this, RecuperacionContrasenaCorreo::class.java))



        }
    }
}