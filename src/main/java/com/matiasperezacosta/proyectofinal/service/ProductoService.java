package com.matiasperezacosta.proyectofinal.service;

import com.matiasperezacosta.proyectofinal.entity.Cliente;
import com.matiasperezacosta.proyectofinal.entity.Producto;

import java.util.List;

public interface ProductoService
{
    List<Producto> mostrarProducto();
   ProductoService buscarPorID(int idproducto);
    List<ProductoService> buscarTodos();
    ProductoService crear(ProductoService Producto) throws Exception;
    ProductoService actualizar(ProductoService Producto) throws Exception;

    Producto actualizar(Producto producto) throws Exception;
}

