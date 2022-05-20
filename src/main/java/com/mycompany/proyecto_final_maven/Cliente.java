/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_final_maven;

/**
 *
 * @author Javier
 */
public class Cliente {

    private String nombre;
    private int annoAfiliacion;
    private CuentaBancaria cuenta;
    
    public Cliente(String nombre, int annoAfliacion, CuentaBancaria cuenta) {
        this.nombre = nombre;
        this.annoAfiliacion = annoAfliacion;
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAnnoAfiliacion() {
        return annoAfiliacion;
    }

    public CuentaBancaria getCuenta() {
        return cuenta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAnnoAfiliacion(int annoAfiliacion) {
        this.annoAfiliacion = annoAfiliacion;
    }

    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }
    
    public int diferenciaAnnos(int annos, String nombre) {
        int diferenciaAnnos = 0;
        
        if (nombre.equals(getCuenta().getNombre())) {
            diferenciaAnnos = getCuenta().getAnnoCreacion() - annos;
        } else {
            diferenciaAnnos = annos;
        }
                
        return diferenciaAnnos;
    }
    
}
