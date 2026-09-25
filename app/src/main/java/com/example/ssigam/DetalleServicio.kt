package com.example.ssigam

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class DetalleServicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_servicio)

        findViewById<View>(R.id.btnBack).setOnClickListener {
            finish()
        }
    }
}
