
package com.utec.demo.spring_boot_ProyectoUTEC.Producto;

import org.springframework.web.bind.annotation.PostMapping;

public class ProductoDTO {
    private String nombre;
    private Double precioBase;

    public ProductoDTO(){}

    public  ProductoDTO( String nombre, Double precioBase){
        this.nombre =nombre;
        this.precioBase =precioBase;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getprecioBase() {
        return precioBase;
    }

    public void setprecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }


}