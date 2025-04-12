package com.example.papeleria.controladores;

import com.example.papeleria.modelos.Proveedor;
import com.example.papeleria.repositorios.ProveedorRepositorio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/proveedores")
public class ProveedorControlador {

    private final ProveedorRepositorio repo;

    public ProveedorControlador(ProveedorRepositorio repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Proveedor> listar() {
        return repo.findAll();
    }

    @PostMapping
    public Proveedor guardar(@RequestBody Proveedor proveedor) {
        return repo.save(proveedor);
    }
}
