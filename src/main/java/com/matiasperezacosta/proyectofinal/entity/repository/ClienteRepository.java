package com.matiasperezacosta.proyectofinal.entity.repository;

import com.matiasperezacosta.proyectofinal.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository <Cliente,Integer>
{
}
//JpaRepository metodo listar, ordenar y eliminar. Revisar metodos con CTRL + Click sobre JpaRepository