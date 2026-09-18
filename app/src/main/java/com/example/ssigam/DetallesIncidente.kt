package com.example.ssigam

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetallesIncidente : AppCompatActivity() {
    private var personas = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalles_incidente)

        val txtNumero = findViewById<TextView>(R.id.txtNumero)

        findViewById<View>(R.id.btnMas).setOnClickListener {
            personas++
            txtNumero.text = personas.toString()
        }

        findViewById<View>(R.id.btnMenos).setOnClickListener {
            if (personas > 1) {
                personas--
                txtNumero.text = personas.toString()
            }
        }

        findViewById<View>(R.id.btnContinuar).setOnClickListener {
            startActivity(Intent(this, AdjuntarFotos::class.java))
        }

        findViewById<View>(R.id.tvBack).setOnClickListener { finish() }
    }
}