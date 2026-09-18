package com.example.ssigam
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class HistorialServicios : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_historial_servicios)

        // Abajo -> Inicio
        findViewById<android.view.View>(R.id.btnNavInicio).setOnClickListener {
            startActivity(Intent(this, InicioConductor::class.java))
        }

        // Abajo -> Perfil
        findViewById<android.view.View>(R.id.btnNavPerfil).setOnClickListener {
            startActivity(Intent(this, PerfilConductor::class.java))
        }

        // Abajo -> Historial (ya estás acá)
        findViewById<android.view.View>(R.id.btnNavHistorialActivo).setOnClickListener {
            // no hace nada
        }
    }
}