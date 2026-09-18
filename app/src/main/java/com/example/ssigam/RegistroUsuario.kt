package com.example.ssigam

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.ssigam.databinding.ActivityRegistroUsuarioBinding


class RegistroUsuario : AppCompatActivity() {

    private lateinit var binding: ActivityRegistroUsuarioBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityRegistroUsuarioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCrearUsuario.setOnClickListener {

            val nombre = binding.nombre.text.toString()
            val email = binding.email.text.toString()
            val usuario = binding.usuario.text.toString()
            val contraseña = binding.password.text.toString()
            Toast.makeText(
                this,
                "Nombre: $nombre\nEmail: $email\nUsuario: $usuario",
                Toast.LENGTH_SHORT
            ).show()
        }

        }
    }
