package com.example.ssigam

import android.content.Intent
import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import com.example.ssigam.databinding.ActivityInicioUsuarioBinding

class InicioUsuario : AppCompatActivity() {

    private lateinit var binding: ActivityInicioUsuarioBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        binding = ActivityInicioUsuarioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRegis.setOnClickListener {
            startActivity(Intent(this, RegistroUsuario::class.java))
        }
        }
    }
