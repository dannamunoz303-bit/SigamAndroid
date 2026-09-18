package com.example.ssigam
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ReportarNovedad : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reportar_novedad)

        // Volver atrás
        findViewById<android.view.View>(R.id.btnBack).setOnClickListener {
            finish()
        }

        // Enviar reporte - por ahora solo vuelve atrás
        findViewById<android.view.View>(R.id.btnEnviarReporte).setOnClickListener {
            finish()
        }
    }
}