package com.example.papeleria.servicios;

import com.example.papeleria.modelos.Detalle_venta;
import com.example.papeleria.repositorios.Detalle_ventaRepositorio;

import java.util.List;

public class Detalle_ventaServicio {
    private final Detalle_ventaRepositorio repo;

    public Detalle_ventaServicio(Detalle_ventaRepositorio repo) {
        this.repo = repo;
    }

    public List<Detalle_venta> listar() {
        return repo.findAll();
    }

    public Detalle_venta guardar(Detalle_venta detalle) {
        return repo.save(detalle);
    }
}
