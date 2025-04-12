package com.example.papeleria.repositorios;

import com.example.papeleria.modelos.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaRepositorio extends JpaRepository<Venta, Integer> {
}