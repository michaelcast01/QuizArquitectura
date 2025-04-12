package com.example.papeleria.controladores;

import com.example.papeleria.modelos.Detalle_venta;
import com.example.papeleria.repositorios.Detalle_ventaRepositorio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/detalles")
public class Detalle_ventaControlador {

    private final Detalle_ventaRepositorio repo;

    public Detalle_ventaControlador(Detalle_ventaRepositorio repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Detalle_venta> listar() {
        return repo.findAll();
    }

    @PostMapping
    public Detalle_venta guardar(@RequestBody Detalle_venta detalle) {
        return repo.save(detalle);
    }
}
