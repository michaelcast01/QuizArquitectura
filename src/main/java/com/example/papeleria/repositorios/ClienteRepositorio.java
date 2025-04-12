package com.example.papeleria.repositorios;

import com.example.papeleria.modelos.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ClienteRepositorio extends JpaRepository<Cliente, Integer> {
}