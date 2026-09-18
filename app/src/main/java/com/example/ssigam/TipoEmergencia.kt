package com.example.ssigam

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class TipoEmergencia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tipo_emergencia)

        val irADetalle = View.OnClickListener {
            startActivity(Intent(this, DetallesIncidente::class.java))
        }

        // Todas las tarjetas llevan al mismo lugar
        findViewById<View>(R.id.cardAccidenteTransito).setOnClickListener(irADetalle)
        findViewById<View>(R.id.cardEmergenciaCardiaca).setOnClickListener(irADetalle)
        findViewById<View>(R.id.cardDificultadRespiratoria).setOnClickListener(irADetalle)
        findViewById<View>(R.id.cardTrauma).setOnClickListener(irADetalle)
        findViewById<View>(R.id.cardIncendio).setOnClickListener(irADetalle)
        findViewById<View>(R.id.cardParto).setOnClickListener(irADetalle)
        findViewById<View>(R.id.cardIntoxicacion).setOnClickListener(irADetalle)
        findViewById<View>(R.id.cardConvulsiones).setOnClickListener(irADetalle)
        findViewById<View>(R.id.cardCaidaFractura).setOnClickListener(irADetalle)
        findViewById<View>(R.id.cardViolencia).setOnClickListener(irADetalle)
        findViewById<View>(R.id.cardPsiquiatrica).setOnClickListener(irADetalle)
        findViewById<View>(R.id.cardOtro).setOnClickListener(irADetalle)

        findViewById<View>(R.id.btnContinuar).setOnClickListener(irADetalle)

        // Atrás
        findViewById<View>(R.id.tvBack).setOnClickListener { finish() }
    }
}