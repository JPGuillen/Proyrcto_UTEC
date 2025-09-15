package com.utec.demo.spring_boot_ProyectoUTEC.Categorias;

import com.utec.demo.spring_boot_ProyectoUTEC.usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoriaRepository  extends  JpaRepository <Categoria, Long>{
}


