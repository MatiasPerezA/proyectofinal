package com.matiasperezacosta.proyectofinal.entity.repository;

import com.matiasperezacosta.proyectofinal.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository <Producto,Integer>
{
}
//JpaRepository metodo listar, ordenar y eliminar. Revisar metodos con CTRL + Click sobre JpaRepository