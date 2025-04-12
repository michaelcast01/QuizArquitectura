package com.example.papeleria.controladores;

import com.example.papeleria.modelos.Venta;
import com.example.papeleria.repositorios.VentaRepositorio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ventas")
public class VentaControlador {

    private final VentaRepositorio repo;

    public VentaControlador(VentaRepositorio repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Venta> listar() {
        return repo.findAll();
    }

    @PostMapping
    public Venta guardar(@RequestBody Venta venta) {
        return repo.save(venta);
    }
}
