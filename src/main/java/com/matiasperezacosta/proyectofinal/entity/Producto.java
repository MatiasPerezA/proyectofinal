package com.matiasperezacosta.proyectofinal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="PRODUCTO")
public class Producto {
    @Id //Primary Key
    @Column(name = "ID Producto")
    private Integer idproducto;

    @Column(name = "Descripcion")
    private String descripcion;

    @Column(name = "Stock")
    private Integer stock;

    @Column(name = "Precio")
    private float precio;

    //Constructores
    public Producto() {
    }

    public Producto(Integer idproducto, String descripcion, Integer stock, float precio) {
        this.idproducto = idproducto;
        this.descripcion = descripcion;
        this.stock = stock;
        this.precio = precio;
    }

    public Integer getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Integer idproducto) {
        this.idproducto = idproducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
