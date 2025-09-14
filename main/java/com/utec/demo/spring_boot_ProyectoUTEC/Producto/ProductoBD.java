package com.utec.demo.spring_boot_ProyectoUTEC.Producto;

import jakarta.persistence.*;  //Importatodo

@Entity
@Table(name = "productos")

public class ProductoBD {

    @Id //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Serial
    private Long id;

    // Otros campos de la Entidad
    private String nombre;
    private String descripcion;
    private Double precioBase;
    private Integer stock;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
