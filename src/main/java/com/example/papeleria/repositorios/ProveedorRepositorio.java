package com.example.papeleria.repositorios;

import com.example.papeleria.modelos.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProveedorRepositorio extends JpaRepository<Proveedor, Integer> {
}