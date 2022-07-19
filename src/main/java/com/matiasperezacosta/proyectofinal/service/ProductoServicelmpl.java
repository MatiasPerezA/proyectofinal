package com.matiasperezacosta.proyectofinal.service;

import com.matiasperezacosta.proyectofinal.entity.Producto;
import com.matiasperezacosta.proyectofinal.entity.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductoServicelmpl implements ProductoService
{
    //JpaRepository metodo listar, ordenar y eliminar. Revisar metodos con CTRL + Click sobre JpaRepository
    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<Producto> mostrarProducto() {return productoRepository.findAll();}

    @Override
    public ProductoService buscarPorID(int idproducto) {
        return null;
    }

    @Override
    public List<ProductoService> buscarTodos() {
        return null;
    }

    @Override
    public ProductoService crear(ProductoService Producto) throws Exception {
        return null;
    }

    @Override
    public ProductoService actualizar(ProductoService Producto) throws Exception {
        return null;
    }

    @Override
    public Producto actualizar(Producto producto) throws Exception {
        if (buscarPorID(producto.getIdproducto()) != null) {
            return productoRepository.save(producto);
        } else {
            throw new Exception( "Producto no existe" );
        }

    }
}