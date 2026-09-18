package com.example.ssigam
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class PerfilConductor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil_conductor)

        // Abajo -> Inicio
        findViewById<android.view.View>(R.id.btnNavInicio).setOnClickListener {
            startActivity(Intent(this, InicioConductor::class.java))
        }

        // Abajo -> Historial
        findViewById<android.view.View>(R.id.btnNavHistorial).setOnClickListener {
            startActivity(Intent(this, HistorialServicios::class.java))
        }

        // Abajo -> Perfil (ya estás acá)
        findViewById<android.view.View>(R.id.btnNavPerfilActivo).setOnClickListener {
            // no hace nada
        }

        // Cerrar sesión -> vuelve al Login
        findViewById<android.view.View>(R.id.btnCerrarSesion).setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}