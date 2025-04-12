
package com.example.papeleria.controladores;

import com.example.papeleria.modelos.Cliente;
import com.example.papeleria.repositorios.ClienteRepositorio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteControlador {

    private final ClienteRepositorio repo;

    public ClienteControlador(ClienteRepositorio repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Cliente> listar() {
        return repo.findAll();
    }

    @PostMapping
    public Cliente guardar(@RequestBody Cliente cliente) {
        return repo.save(cliente);
    }
}
