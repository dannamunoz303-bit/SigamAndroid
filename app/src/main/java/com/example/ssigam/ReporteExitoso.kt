package com.example.ssigam

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class ReporteExitoso : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reporte_exitoso)

        findViewById<View>(R.id.btnEnviar).setOnClickListener {
            startActivity(Intent(this, EstadoReporte::class.java))
        }

        findViewById<View>(R.id.btnVolverInicio).setOnClickListener {
            val intent = Intent(this, InicioUsuario::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
            startActivity(intent)
            finish()
        }
    }
}