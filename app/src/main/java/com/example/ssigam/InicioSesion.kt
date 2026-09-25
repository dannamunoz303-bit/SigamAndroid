package com.example.ssigam

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.ssigam.network.RetrofitClient
import com.example.ssigam.network.TokenManager
import com.example.ssigam.network.models.LoginRequest
import kotlinx.coroutines.launch

class InicioSesion : AppCompatActivity() {

    private lateinit var tokenManager: TokenManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio_sesion)

        tokenManager = TokenManager(this)

        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etPass = findViewById<EditText>(R.id.etPass)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val tvOlvido = findViewById<TextView>(R.id.tvOlvido)

        tvOlvido.setOnClickListener {
            startActivity(Intent(this, RecuperacionContrasenaCorreo::class.java))
        }

        btnLogin.setOnClickListener {
            val email = etEmail.text.toString().trim()
            val password = etPass.text.toString().trim()

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Completa email y contraseña", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            doLogin(email, password)
        }
    }

    private fun doLogin(email: String, password: String) {
        lifecycleScope.launch {
            try {
                val api = RetrofitClient.create(this@InicioSesion)
                val response = api.login(LoginRequest(email, password))

                if (response.isSuccessful && response.body() != null) {
                    val body = response.body()!!
                    tokenManager.saveTokens(body.access, body.refresh)

                    val destino = when {
                        body.usuario.rol_nombre.equals("Conductor de Ambulancia", ignoreCase = true) ->
                            InicioConductor::class.java
                        body.usuario.rol_nombre.equals("Usuario", ignoreCase = true) ->
                            InicioUsuario::class.java
                        else -> {
                            Toast.makeText(
                                this@InicioSesion,
                                "Rol no reconocido: ${body.usuario.rol_nombre}",
                                Toast.LENGTH_LONG
                            ).show()
                            return@launch
                        }
                    }

                    Toast.makeText(
                        this@InicioSesion,
                        "Bienvenido, ${body.usuario.nombre}",
                        Toast.LENGTH_SHORT
                    ).show()

                    startActivity(Intent(this@InicioSesion, destino))
                    finish()

                } else {
                    val errorMsg = response.errorBody()?.string() ?: "Email o contraseña incorrectos"
                    Toast.makeText(this@InicioSesion, errorMsg, Toast.LENGTH_LONG).show()
                }
            } catch (e: Exception) {
                Toast.makeText(this@InicioSesion, "Error de conexión: ${e.message}", Toast.LENGTH_SHORT).show()
            }
        }
    }
}