package com.example.ssigam
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class DetalleIncidente : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_incidente)

        findViewById<android.view.View>(R.id.btnBack).setOnClickListener {
            finish()
        }

        // INICIAR NAVEGACION -> Mapa
        findViewById<android.view.View>(R.id.btnIniciarNavegacion).setOnClickListener {
            startActivity(Intent(this, NavegacionIncidente::class.java))
        }
    }
}