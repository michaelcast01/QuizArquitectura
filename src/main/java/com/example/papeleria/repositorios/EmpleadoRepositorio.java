package com.example.papeleria.repositorios;

import com.example.papeleria.modelos.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepositorio extends JpaRepository<Empleado, Integer> {
}