package com.example.ssigam
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
class RecuperacionContrasenaCodigo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recuperacion_contrasena_codigo)
        window.decorView.setOnClickListener {
            startActivity(Intent(this, RecuperacionContrasenaConfirmar::class.java))
        }
    }
}