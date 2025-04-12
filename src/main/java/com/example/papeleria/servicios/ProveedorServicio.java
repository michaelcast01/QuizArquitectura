package com.example.papeleria.servicios;

import com.example.papeleria.modelos.Proveedor;
import com.example.papeleria.repositorios.ProveedorRepositorio;

import java.util.List;

public class ProveedorServicio {
    private final ProveedorRepositorio repo;

    public ProveedorServicio(ProveedorRepositorio repo) {
        this.repo = repo;
    }

    public List<Proveedor> listar() {
        return repo.findAll();
    }

    public Proveedor guardar(Proveedor proveedor) {
        return repo.save(proveedor);
    }
}
