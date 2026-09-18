package com.example.ssigam
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class NuevaEmergencia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nueva_emergencia)

        findViewById<android.view.View>(R.id.btnAceptarServicio).setOnClickListener {
            startActivity(Intent(this, DetalleIncidente::class.java))
        }

        findViewById<android.view.View>(R.id.btnReportarDificultad).setOnClickListener {
            startActivity(Intent(this, ReportarNovedad::class.java))
        }
    }
}