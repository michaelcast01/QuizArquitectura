package com.example.papeleria.servicios;

import com.example.papeleria.modelos.Cliente;
import com.example.papeleria.repositorios.ClienteRepositorio;

import java.util.List;

public class ClienteServicio {
    private final ClienteRepositorio repo;

    public ClienteServicio(ClienteRepositorio repo) {
        this.repo = repo;
    }

    public List<Cliente> listar() {
        return repo.findAll();
    }

    public Cliente guardar(Cliente cliente) {
        return repo.save(cliente);
    }
}