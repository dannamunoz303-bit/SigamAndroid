package com.example.ssigam

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class AdjuntarFotos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adjuntar_fotos)

        // ENVIAR REPORTE -> ConfirmacionReporte
        findViewById<View>(R.id.btnEnviar).setOnClickListener {
            startActivity(Intent(this, ReporteExitoso::class.java))
        }

        // CANCELAR -> vuelve al inicio
        findViewById<View>(R.id.btnCancelar).setOnClickListener {
            startActivity(Intent(this, InicioUsuario::class.java))
            finish()
        }

        findViewById<View>(R.id.tvBack).setOnClickListener { finish() }

        // Para el video, que al tocar la cámara no haga nada (o abra galería después)
        findViewById<View>(R.id.btnTomarFoto).setOnClickListener {
            // Aquí después puedes poner abrir cámara
        }
    }
}