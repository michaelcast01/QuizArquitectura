
package com.example.papeleria.controladores;

import com.example.papeleria.modelos.Empleado;
import com.example.papeleria.repositorios.EmpleadoRepositorio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empleados")
public class EmpleadoControlador {

    private final EmpleadoRepositorio repo;

    public EmpleadoControlador(EmpleadoRepositorio repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Empleado> listar() {
        return repo.findAll();
    }

    @PostMapping
    public Empleado guardar(@RequestBody Empleado empleado) {
        return repo.save(empleado);
    }
}
