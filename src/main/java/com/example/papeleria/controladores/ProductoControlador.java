package com.example.papeleria.controladores;

import com.example.papeleria.modelos.Producto;
import com.example.papeleria.repositorios.ProductoRepositorio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoControlador {

    private final ProductoRepositorio repo;

    public ProductoControlador(ProductoRepositorio repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Producto> listar() {
        return repo.findAll();
    }

    @PostMapping
    public Producto guardar(@RequestBody Producto producto) {
        return repo.save(producto);
    }
}
