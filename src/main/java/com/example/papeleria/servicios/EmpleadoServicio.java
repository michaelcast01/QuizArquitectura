package com.example.papeleria.servicios;

import com.example.papeleria.modelos.Empleado;
import com.example.papeleria.repositorios.EmpleadoRepositorio;

import java.util.List;

public class EmpleadoServicio{
    private final EmpleadoRepositorio repo;

    public EmpleadoServicio(EmpleadoRepositorio repo) {
        this.repo = repo;
    }

    public List<Empleado> listar() {
        return repo.findAll();
    }

    public Empleado guardar(Empleado empleado) {
        return repo.save(empleado);
    }
}