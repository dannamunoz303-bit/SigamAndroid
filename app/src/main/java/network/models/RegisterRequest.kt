package com.example.ssigam.network.models

data class RegisterRequest(
    val nombre: String,
    val apellido: String,
    val documento: String,
    val telefono: String,
    val correo: String,
    val rol: String,
    val password: String,
    val confirmar_password: String,
    val acepta_terminos: Boolean
)

data class RegisterResponse(
    val mensaje: String
)