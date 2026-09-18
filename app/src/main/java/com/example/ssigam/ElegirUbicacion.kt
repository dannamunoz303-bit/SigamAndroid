package com.example.ssigam

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ElegirUbicacion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elegir_ubicacion)

        // Con solo tocar la pantalla pasa a TipoEmergencia
        window.decorView.setOnClickListener {
            startActivity(Intent(this, TipoEmergencia::class.java))
        }
    }
}