package com.example.ssigam

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class PantallaInicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_inicio)

        // Espera 2 segundos y pasa al login
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, InicioSesion::class.java))
            finish()
        }, 2000)
    }
}