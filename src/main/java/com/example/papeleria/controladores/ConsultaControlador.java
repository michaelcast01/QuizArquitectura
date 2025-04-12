package com.example.papeleria.controladores;

import com.example.papeleria.servicios.ServicioConsulta;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ConsultaControlador {

    private final ServicioConsulta ServicioConsulta;

    public ConsultaControlador(ServicioConsulta servicioConsulta) {
        this.ServicioConsulta = servicioConsulta;
    }

    // 1️⃣ GET /api/empleados/{id}/ventas-con-clientes
    @GetMapping("/empleados/{id}/ventas-con-clientes")
    public List<Map<String, Object>> ventasConClientes(@PathVariable Integer id) {
        return ServicioConsulta.ventasPorEmpleado(id);
    }

    @GetMapping("/proveedores/{id}/productos")
    public List<Map<String, Object>> productosDeProveedor(@PathVariable Integer id) {
        return ServicioConsulta.productosPorProveedor(id);
    }

    @GetMapping("/clientes/detalles-venta")
    public List<Map<String, Object>> clientesDetalleVenta() {
        return ServicioConsulta.clientesConDetalleVenta();
    }

    @PostMapping("/empleados/{id}/ventas-por-fecha")
    public List<Map<String, Object>> ventasEmpleadoPorFechas(
            @PathVariable Integer id,
            @RequestBody Map<String, String> fechas
    ) {
        String desde = fechas.get("fechaInicio");
        String hasta = fechas.get("fechaFin");
        return ServicioConsulta.ventasEmpleadoPorFechas(id, desde, hasta);
    }
}

