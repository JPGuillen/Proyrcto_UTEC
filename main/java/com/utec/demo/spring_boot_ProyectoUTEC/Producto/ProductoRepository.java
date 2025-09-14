package com.utec.demo.spring_boot_ProyectoUTEC.Producto;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductoRepository extends JpaRepository<ProductoBD, Long> {
}

