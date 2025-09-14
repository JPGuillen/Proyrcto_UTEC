package com.utec.demo.spring_boot_ProyectoUTEC.Producto;

import jakarta.persistence.*;  //Importatodo

@Entity
@Table(name = "productos")

public class ProductoBD {

    @Id //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Serial
    private Long id;

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

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    private String nombre;
    private Double precio;
    private Integer stock;

}
