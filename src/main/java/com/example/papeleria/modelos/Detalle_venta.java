package com.example.papeleria.modelos;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Detalle_venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_detalle;

    @ManyToOne
    @JoinColumn(name = "id_venta")
    private Venta venta;

    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;

    private Integer cantidad;
    private Double precio_unitario;

    private LocalDate fecha;
    private LocalTime hora;

    public Detalle_venta() {
    }

    public Detalle_venta(Integer id_detalle, Venta venta, Producto producto, Integer cantidad, Double precio_unitario, LocalDate fecha, LocalTime hora) {
        this.id_detalle = id_detalle;
        this.venta = venta;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio_unitario = precio_unitario;
        this.fecha = fecha;
        this.hora = hora;
    }

    public Integer getId_detalle() {
        return id_detalle;
    }

    public void setId_detalle(Integer id_detalle) {
        this.id_detalle = id_detalle;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(Double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
}
