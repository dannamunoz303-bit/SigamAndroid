package com.example.ssigam

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ActualizarPerfil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actualizar_perfil)

        findViewById<View>(R.id.btnBack).setOnClickListener {
            finish()
        }

        findViewById<View>(R.id.btnGuardar).setOnClickListener {
            Toast.makeText(this, "Perfil actualizado correctamente", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}
