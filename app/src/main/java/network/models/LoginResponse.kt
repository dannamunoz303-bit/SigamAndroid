package com.example.ssigam.network.models

data class LoginResponse(
    val access: String,
    val refresh: String,
    val usuario: UsuarioResponse
)

data class UsuarioResponse(
    val id: Int,
    val nombre: String,
    val email: String,
    val rol: Int?,
    val rol_nombre: String?,
    val is_active: Boolean
)