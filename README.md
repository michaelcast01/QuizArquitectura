"# QuizArquitectura"
1. Ventas realizadas por un empleado con sus respectivos clientes
   GET http://localhost:8080/api/empleados/3/ventas-con-clientes

2. Listar productos que ofrece un proveedor
   GET http://localhost:8080/api/proveedores/4/productos

3. Listar los clientes con el detalle de venta
   GET http://localhost:8080/api/clientes/detalles-venta

4. Listar ventas de un empleado por fecha
   POST http://localhost:8080/api/empleados/3/ventas-por-fecha

JSON Body
{
"fechaInicio": "2024-05-01",
"fechaFin": "2024-06-30"
}

