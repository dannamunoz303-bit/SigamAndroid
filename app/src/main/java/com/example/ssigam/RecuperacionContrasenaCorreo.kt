package com.example.ssigam
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
class RecuperacionContrasenaCorreo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recuperacion_contrasena_correo)
        window.decorView.setOnClickListener {
            startActivity(Intent(this, RecuperacionContrasenaCodigo::class.java))
        }
    }
}