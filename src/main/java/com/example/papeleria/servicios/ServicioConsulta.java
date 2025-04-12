package com.example.papeleria.servicios;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ServicioConsulta{

    private final JdbcTemplate jdbcTemplate;

    public ServicioConsulta(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // 1. Ventas por empleado con su cliente
    public List<Map<String, Object>> ventasPorEmpleado(Integer idEmpleado) {
        String sql = """
            SELECT v.id_venta, v.fecha, e.nombre AS empleado, c.nombre AS cliente
            FROM venta v
            JOIN empleado e ON v.id_empleado = e.id_empleado
            JOIN cliente c ON v.id_cliente = c.id_cliente
            WHERE e.id_empleado = ?
            ORDER BY v.fecha
        """;
        return jdbcTemplate.queryForList(sql, idEmpleado);
    }

    // 2. Productos por proveedor
    public List<Map<String, Object>> productosPorProveedor(Integer idProveedor) {
        String sql = """
            SELECT p.id_producto, p.nombre AS producto, p.descripcion, p.precio, pr.nombre AS proveedor
            FROM producto p
            JOIN proveedor pr ON p.id_proveedor = pr.id_proveedor
            WHERE pr.id_proveedor = ?
        """;
        return jdbcTemplate.queryForList(sql, idProveedor);
    }

    // 3. Clientes con detalle de venta
    public List<Map<String, Object>> clientesConDetalleVenta() {
        String sql = """
            SELECT c.nombre AS cliente, v.id_venta, p.nombre AS producto, d.cantidad, d.precio_unitario
            FROM cliente c
            JOIN venta v ON v.id_cliente = c.id_cliente
            JOIN detalle_venta d ON d.id_venta = v.id_venta
            JOIN producto p ON d.id_producto = p.id_producto
        """;
        return jdbcTemplate.queryForList(sql);
    }

    // 4. Ventas de un empleado por fecha
    public List<Map<String, Object>> ventasEmpleadoPorFechas(Integer idEmpleado, String desde, String hasta) {
        String sql = """
            SELECT v.id_venta, v.fecha, e.nombre AS empleado, c.nombre AS cliente
            FROM venta v
            JOIN empleado e ON v.id_empleado = e.id_empleado
            JOIN cliente c ON v.id_cliente = c.id_cliente
            WHERE e.id_empleado = ? AND v.fecha BETWEEN ? AND ?
            ORDER BY v.fecha
        """;
        return jdbcTemplate.queryForList(sql, idEmpleado, desde, hasta);
    }
}
