package com.example.papeleria.repositorios;

import com.example.papeleria.modelos.Detalle_venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Detalle_ventaRepositorio extends JpaRepository<Detalle_venta, Integer> {
}