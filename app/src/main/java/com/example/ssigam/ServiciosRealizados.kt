package com.example.ssigam

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class ServiciosRealizados : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_servicios_realizados)

        findViewById<View>(R.id.btnBack).setOnClickListener {
            finish()
        }

        val abrirDetalle = View.OnClickListener {
            startActivity(Intent(this, DetalleServicio::class.java))
        }

        findViewById<View>(R.id.cardServicio1)?.setOnClickListener(abrirDetalle)
        findViewById<View>(R.id.cardServicio2)?.setOnClickListener(abrirDetalle)
        findViewById<View>(R.id.cardServicio3)?.setOnClickListener(abrirDetalle)
    }
}
