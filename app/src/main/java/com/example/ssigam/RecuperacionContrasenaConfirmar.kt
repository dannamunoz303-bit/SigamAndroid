package com.example.ssigam
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
class RecuperacionContrasenaConfirmar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recuperacion_contrasena_confirmar)
        window.decorView.setOnClickListener {
            startActivity(Intent(this, InicioConductor::class.java))
        }
    }
}