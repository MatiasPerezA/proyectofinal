package com.matiasperezacosta.proyectofinal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CLIENTE")
public class Cliente
{
    @Id //Primary Key
    @Column(name="CLIENTEID")
    private Integer clienteid;

    @Column(name="CUIT")
    private Integer cuit;

    @Column(name="NOMBRE")
    private String nombreFantasia;

    @Column(name="Razon social")
    private String razonSocial;

    //Constructores
    public Cliente() {}

    public Cliente(Integer cuit, String nombreFantasia, String razonSocial) {
        this.cuit = cuit;
        this.nombreFantasia = nombreFantasia;
        this.razonSocial = razonSocial;
    }

    //Getters and Setters

    public Integer getCuit() {
        return cuit;
    }

    public void setCuit(Integer cuit) {
        this.cuit = cuit;
    }

    public String getNombre() {
        return nombreFantasia;
    }

    public void setNombre(String nombreFantasia) {
        this.nombreFantasia = nombreFantasia;
    }

    public String getrazonSocial() {
        return razonSocial;
    }

    public void setrazonSocial(String razonSocial) {
        razonSocial = razonSocial;
    }
}
