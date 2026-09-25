package com.example.ssigam

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class EstadisticasTiempos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estadisticas_tiempos)

        findViewById<View>(R.id.btnBack).setOnClickListener {
            finish()
        }
    }
}
