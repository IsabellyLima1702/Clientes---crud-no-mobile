package br.senai.sp.jandira.clientesappdsa.service

import br.senai.sp.jandira.clientesappdsa.model.Cliente
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface ClienteService {

    @POST("clientes")
    fun cadastrarCliente(@Body cliente: Cliente): Call<Cliente>

    @GET("clientes")
    fun listarTodos(): Call<List<Cliente>>

    @GET("clientes/{id}")
    fun buscarPorId(@Path("id") codigo: Long): Call<List<Cliente>>

    @DELETE("clientes/{id}")
    fun deletarPorId(@Path("id") codigo: Long): Call<List<Cliente>>

}