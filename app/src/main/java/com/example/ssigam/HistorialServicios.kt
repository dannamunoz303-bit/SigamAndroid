package com.example.ssigam

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class HistorialServicios : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_historial_servicios)

        val abrirDetalle = View.OnClickListener {
            startActivity(Intent(this, DetalleServicio::class.java))
        }

        findViewById<View>(R.id.layoutCard1)?.setOnClickListener(abrirDetalle)
        findViewById<View>(R.id.layoutCard2)?.setOnClickListener(abrirDetalle)
        findViewById<View>(R.id.layoutCard3)?.setOnClickListener(abrirDetalle)

        // Abajo -> Inicio
        findViewById<View>(R.id.btnNavInicio)?.setOnClickListener {
            startActivity(Intent(this, InicioConductor::class.java))
        }

        // Abajo -> Perfil
        findViewById<View>(R.id.btnNavPerfil)?.setOnClickListener {
            startActivity(Intent(this, PerfilConductor::class.java))
        }

        // Abajo -> Historial (ya estás acá)
        findViewById<View>(R.id.btnNavHistorialActivo)?.setOnClickListener {
            // no hace nada
        }
    }
}
