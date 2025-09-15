package com.utec.demo.spring_boot_ProyectoUTEC.Categorias;

import jakarta.persistence.*;
@Entity
@Table(name = "categorias")
public class Categoria {

    @Id //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Serial
    private Long id;

    private String nombre;

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
}
