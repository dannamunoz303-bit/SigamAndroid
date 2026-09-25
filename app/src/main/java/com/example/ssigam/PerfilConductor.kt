package com.example.ssigam

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class PerfilConductor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil_conductor)

        // Editar perfil -> ActualizarPerfil
        findViewById<View>(R.id.btnEditarPerfil)?.setOnClickListener {
            startActivity(Intent(this, ActualizarPerfil::class.java))
        }

        // Datos personales y ambulancia
        findViewById<View>(R.id.btnDatosPersonales)?.setOnClickListener {
            startActivity(Intent(this, DatosPersonalesAmbulancia::class.java))
        }

        // Servicios realizados
        findViewById<View>(R.id.btnServiciosRealizados)?.setOnClickListener {
            startActivity(Intent(this, ServiciosRealizados::class.java))
        }

        // Estadisticas de tiempos
        findViewById<View>(R.id.btnEstadisticasTiempos)?.setOnClickListener {
            startActivity(Intent(this, EstadisticasTiempos::class.java))
        }

        // Abajo -> Inicio
        findViewById<View>(R.id.btnNavInicio)?.setOnClickListener {
            startActivity(Intent(this, InicioConductor::class.java))
        }

        // Abajo -> Historial
        findViewById<View>(R.id.btnNavHistorial)?.setOnClickListener {
            startActivity(Intent(this, HistorialServicios::class.java))
        }

        // Abajo -> Perfil (ya estás acá)
        findViewById<View>(R.id.btnNavPerfilActivo)?.setOnClickListener {
            // no hace nada
        }

        // Cerrar sesión -> vuelve al Login
        findViewById<View>(R.id.btnCerrarSesion)?.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}
