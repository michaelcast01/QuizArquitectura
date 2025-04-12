package com.example.papeleria.servicios;

import com.example.papeleria.modelos.Venta;
import com.example.papeleria.repositorios.VentaRepositorio;

import java.util.List;

public class VentaServicio {
    private final VentaRepositorio repo;

    public VentaServicio(VentaRepositorio repo) {
        this.repo = repo;
    }

    public List<Venta> listar() {
        return repo.findAll();
    }

    public Venta guardar(Venta venta) {
        return repo.save(venta);
    }
}
