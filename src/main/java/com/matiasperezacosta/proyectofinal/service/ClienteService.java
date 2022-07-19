package com.matiasperezacosta.proyectofinal.service;

import com.matiasperezacosta.proyectofinal.entity.Cliente;

import java.util.List;

public interface ClienteService {
    List<Cliente> mostrarClientes();
    ClienteService buscarPorCuit(int cuit);
    List<ClienteService> buscarTodos();
    ClienteService crear(ClienteService cliente) throws Exception;
    ClienteService actualizar(ClienteService cliente) throws Exception;

    Cliente actualizar(Cliente cliente) throws Exception;
}
