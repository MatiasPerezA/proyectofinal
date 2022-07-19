package com.matiasperezacosta.proyectofinal.service;

import com.matiasperezacosta.proyectofinal.entity.Cliente;
import com.matiasperezacosta.proyectofinal.entity.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ClienteServiceImpl implements ClienteService
{
    //JpaRepository metodo listar, ordenar y eliminar. Revisar metodos con CTRL + Click sobre JpaRepository
    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> mostrarClientes()
    {
        return clienteRepository.findAll();
    }

    @Override
    public ClienteService buscarPorCuit(int cuit) {
        return null;
    }

    @Override
    public List<ClienteService> buscarTodos() {
        return null;
    }

    @Override
    public ClienteService crear(ClienteService cliente) throws Exception {
        return null;
    }

    @Override
    public ClienteService actualizar(ClienteService cliente) throws Exception {
        return null;
    }

    @Override
    public Cliente actualizar(Cliente cliente) throws Exception {
        if (buscarPorCuit(cliente.getCuit()) != null) {
            return clienteRepository.save(cliente);
        } else {
            throw new Exception( "Cliente no existe" );
        }

    }
}