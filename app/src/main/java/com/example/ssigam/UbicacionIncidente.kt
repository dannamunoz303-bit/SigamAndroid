package com.example.ssigam

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class UbicacionIncidente : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ubicacion_incidente)

        // Botón CONTINUAR -> TipoEmergencia (PASO 2)
        findViewById<View>(R.id.btnContinuar).setOnClickListener {
            startActivity(Intent(this, TipoEmergencia::class.java))
        }

        // Botón Elegir otra ubicación -> ElegirUbicacion
        findViewById<View>(R.id.btnElegirOtraUbicacion).setOnClickListener {
            startActivity(Intent(this, ElegirUbicacion::class.java))
        }

        // Flecha atrás
        findViewById<View>(R.id.btnBack).setOnClickListener {
            finish()
        }
    }
}