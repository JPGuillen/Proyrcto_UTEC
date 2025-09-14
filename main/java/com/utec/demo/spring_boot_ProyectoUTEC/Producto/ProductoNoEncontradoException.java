package com.utec.demo.spring_boot_ProyectoUTEC.Producto;

// Lo hace clase de exception x la herencia


public class ProductoNoEncontradoException extends RuntimeException {
    public ProductoNoEncontradoException(Long id) {
        super("Producto con id " + id + " no encontrado");
    }
}