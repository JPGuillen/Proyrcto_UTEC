package com.utec.demo.spring_boot_ProyectoUTEC.controllers;

import com.utec.demo.spring_boot_ProyectoUTEC.Producto.ProductoBD;
import com.utec.demo.spring_boot_ProyectoUTEC.Producto.ProductoDTO;
import com.utec.demo.spring_boot_ProyectoUTEC.Producto.ProductoServiceBD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/productos")  // EMPOIN  ----porsiacasooo revisar el texto
public class ProductoController {

    private final ProductoServiceBD productoService;

    @Autowired
    public ProductoController (ProductoServiceBD productoService){
        this.productoService = productoService;
    }

    @GetMapping

    public List<ProductoBD> listaProductos()
    {
        return productoService.listarTodos();

   }

    @GetMapping("/{id}")
    public ResponseEntity<ProductoBD> obtener(@PathVariable Long id) {
        return productoService.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ProductoBD crear(@RequestBody ProductoBD producto) {
        return productoService.guardar(producto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductoBD> actualizar(@PathVariable Long id, @RequestBody ProductoBD producto) {
        return productoService.obtenerPorId(id)
                .map(p -> {
                    producto.setId(id);
                    return ResponseEntity.ok(productoService.guardar(producto));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // Actualiza una parte de las columnas
    @PatchMapping("/{id}")
    public ResponseEntity<ProductoBD> actualizarParcial(@PathVariable Long id, @RequestBody Map<String, Object> updates) {
        return productoService.obtenerPorId(id)
                .map(producto -> {
                    updates.forEach((key, value) -> {
                        switch (key) {
                            case "nombre":
                                producto.setNombre((String)value);
                                break;
                            case "precio":
                                producto.setPrecio(Double.valueOf(value.toString()));
                                break;
                            case "stock":
                                producto.setStock(Integer.valueOf(value.toString()));
                                break;
                            // Agrega más campos si es necesario
                        }
                    });
                    return ResponseEntity.ok(productoService.guardar(producto));
                })
                .orElse(ResponseEntity.notFound().build());
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        if (productoService.obtenerPorId(id).isPresent()) {
            productoService.eliminar(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
