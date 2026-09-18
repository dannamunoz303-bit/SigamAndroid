package com.example.ssigam
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class InicioConductor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio_conductor)

        // ESTE ES EL QUE PEDISTE: Disponible -> Nueva Emergencia
        findViewById<android.view.View>(R.id.tvEstadoDisponible).setOnClickListener {
            startActivity(Intent(this, NuevaEmergencia::class.java))
        }

        // Barra abajo
        findViewById<android.view.View>(R.id.btnNavHistorial).setOnClickListener {
            startActivity(Intent(this, HistorialServicios::class.java))
        }
        findViewById<android.view.View>(R.id.btnNavPerfil).setOnClickListener {
            startActivity(Intent(this, PerfilConductor::class.java))
        }
    }
}