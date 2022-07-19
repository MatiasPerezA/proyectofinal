package com.matiasperezacosta.proyectofinal.controller;

import com.matiasperezacosta.proyectofinal.entity.Cliente;
import com.matiasperezacosta.proyectofinal.entity.Producto;
import com.matiasperezacosta.proyectofinal.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("proyectofinal/cliente")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping("/")
    public List<Cliente> mostarTabla()
    {
        return clienteService.mostrarClientes();
    };

    @GetMapping("/all")
    public List<ClienteService> obtenerClientes() {
        return clienteService.buscarTodos();
    }

    @GetMapping("/{cuit}")
    public ClienteService buscarClientePorCuit(@PathVariable int cuit) {
        return clienteService.buscarPorCuit(cuit);
    }

    @PostMapping("/actualizar")
    public ClienteService actualizarCliente(@RequestBody ClienteService cliente) throws Exception {
        return clienteService.actualizar(cliente);
    }

    @PostMapping("/crear")
    public ClienteService crearCliente(@RequestBody ClienteService cliente) throws Exception {
        return clienteService.crear(cliente);
    }
}
