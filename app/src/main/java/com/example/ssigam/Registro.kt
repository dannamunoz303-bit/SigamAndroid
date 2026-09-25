package com.example.ssigam

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.ssigam.network.RetrofitClient
import com.example.ssigam.network.models.RegisterRequest
import kotlinx.coroutines.launch

class Registro : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        val etNombre = findViewById<EditText>(R.id.etNombre)
        val etApellido = findViewById<EditText>(R.id.etApellido)
        val etDocumento = findViewById<EditText>(R.id.etDocumento)
        val etTelefono = findViewById<EditText>(R.id.etTelefono)
        val etCorreo = findViewById<EditText>(R.id.etCorreo)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val etConfirmarPassword = findViewById<EditText>(R.id.etConfirmarPassword)
        val cbTerminos = findViewById<CheckBox>(R.id.cbTerminos)
        val btnRegistrar = findViewById<Button>(R.id.btnRegistrar)

        btnRegistrar.setOnClickListener {
            val nombre = etNombre.text.toString().trim()
            val apellido = etApellido.text.toString().trim()
            val documento = etDocumento.text.toString().trim()
            val telefono = etTelefono.text.toString().trim()
            val correo = etCorreo.text.toString().trim()
            val password = etPassword.text.toString().trim()
            val confirmarPassword = etConfirmarPassword.text.toString().trim()
            val aceptaTerminos = cbTerminos.isChecked

            if (nombre.isEmpty() || apellido.isEmpty() || documento.isEmpty() ||
                telefono.isEmpty() || correo.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Completa todos los campos", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (!aceptaTerminos) {
                Toast.makeText(this, "Debes aceptar los términos", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            registrar(nombre, apellido, documento, telefono, correo, password, confirmarPassword, aceptaTerminos)
        }
    }

    private fun registrar(
        nombre: String, apellido: String, documento: String,
        telefono: String, correo: String, password: String,
        confirmarPassword: String, aceptaTerminos: Boolean
    ) {
        lifecycleScope.launch {
            try {
                val api = RetrofitClient.create(this@Registro)
                val response = api.register(
                    RegisterRequest(
                        nombre = nombre,
                        apellido = apellido,
                        documento = documento,
                        telefono = telefono,
                        correo = correo,
                        rol = "Usuario",
                        password = password,
                        confirmar_password = confirmarPassword,
                        acepta_terminos = aceptaTerminos
                    )
                )

                if (response.isSuccessful) {
                    Toast.makeText(this@Registro, "Registro exitoso, ya puedes iniciar sesión", Toast.LENGTH_LONG).show()
                    finish()
                } else {
                    val errorMsg = response.errorBody()?.string() ?: "Error al registrar"
                    Toast.makeText(this@Registro, errorMsg, Toast.LENGTH_LONG).show()
                }
            } catch (e: Exception) {
                Toast.makeText(this@Registro, "Error de conexión: ${e.message}", Toast.LENGTH_SHORT).show()
            }
        }
    }
}