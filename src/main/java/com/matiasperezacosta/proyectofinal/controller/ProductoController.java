package com.matiasperezacosta.proyectofinal.controller;

import com.matiasperezacosta.proyectofinal.entity.Cliente;

import com.matiasperezacosta.proyectofinal.entity.Producto;
import com.matiasperezacosta.proyectofinal.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("proyectofinal/producto")
public class ProductoController
{
    @Autowired
    private ProductoService productoService;

    @GetMapping("/")
    public List<Producto> mostarTabla()
    {
        return productoService.mostrarProducto();
    }

    @GetMapping("/all")
    public List<ProductoService> obtenerClientes() {
        return productoService.buscarTodos();
    }

    @GetMapping("/{idproducto}")
    public ProductoService buscarProductoporID(@PathVariable int idproducto) {
        return productoService.buscarPorID(idproducto);
    }

    @PostMapping("/actualizar")
    public ProductoService actualizarCliente(@RequestBody ProductoService idproducto) throws Exception {
        return productoService.actualizar(idproducto);
    }

    @PostMapping("/crear")
    public ProductoService crearCliente(@RequestBody ProductoService idproducto) throws Exception {
        return productoService.crear(idproducto);
    }
}