/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_final_maven;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author Javier
 */
public class CuentaBancaria {
    
    private String nombre;
    private double cantidad;
    private LocalDate fechaCreacion;

    public CuentaBancaria(String nombre, double cantidad, LocalDate fechaCreacion) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.fechaCreacion = fechaCreacion;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCantidad() {
        return cantidad;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
    public double sacarDinero(String nombre, double dineroRetirado) {
        double dineroRestante = 0;
        
        if (nombre.equals(getNombre())) {
            dineroRestante = getCantidad() - dineroRetirado;
            setCantidad(dineroRestante);
        }
        
        return dineroRestante;
    }
    
    public double meterDinero(String nombre, double dineroIntroducido) {
        double dineroActualizado = 0;
        
        if (nombre.equals(getNombre())) {
            dineroActualizado = getCantidad() + dineroIntroducido;
            setCantidad(dineroActualizado);
        }
        
        return dineroActualizado;
    }
    
    public int devolverAnnosCuenta(String nombre, int fechaActual) {
        int annos = 0;
        
        if (nombre.equals(getNombre())) {
            annos =  fechaActual - getFechaCreacion().getYear();
        }
        
        return annos;
    }
    
}
