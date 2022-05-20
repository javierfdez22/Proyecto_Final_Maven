/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.proyecto_final_maven;

import java.time.LocalDate;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Javier
 */
public class CuentaBancariaTest {
    
    public CuentaBancariaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of sacarDinero method, of class CuentaBancaria.
     */
    @Test
    public void testSacarDinero_1() {
        System.out.println("Test sacarDinero correcto");
        String nombre = "Cuenta de Paco";
        double dineroRetirado = 500.50;
        CuentaBancaria cuenta = new CuentaBancaria("Cuenta de Paco", 2000, 2010);
        double expResult = 1499.50;
        double result = cuenta.sacarDinero(nombre, dineroRetirado);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of sacarDinero method, of class CuentaBancaria.
     */
    @Test
    public void testSacarDinero_2() {
        System.out.println("Test sacarDinero erroneo");
        String nombre = "Paco";
        double dineroRetirado = 500.50;
        CuentaBancaria cuenta = new CuentaBancaria("Cuenta de Paco", 2000, 2010);
        double expResult = 2000;
        double result = cuenta.sacarDinero(nombre, dineroRetirado);
        assertEquals(expResult, result);
    }

    /**
     * Test of meterDinero method, of class CuentaBancaria.
     */
    @Test
    public void testMeterDinero_1() {
        System.out.println("Test meterDinero correcto");
        String nombre = "Cuenta de Alvaro";
        double dineroIntroducido = 639.57;
        CuentaBancaria cuenta = new CuentaBancaria("Cuenta de Alvaro", 4500, 2003);
        double expResult = 5139.57;
        double result = cuenta.meterDinero(nombre, dineroIntroducido);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of meterDinero method, of class CuentaBancaria.
     */
    @Test
    public void testMeterDinero_2() {
        System.out.println("Test meterDinero erroneo");
        String nombre = "Alvaro";
        double dineroIntroducido = 639.57;
        CuentaBancaria cuenta = new CuentaBancaria("Cuenta de", 4500, 2003);
        double expResult = 4500;
        double result = cuenta.meterDinero(nombre, dineroIntroducido);
        assertEquals(expResult, result);
    }

    /**
     * Test of devolverAnnosCuenta method, of class CuentaBancaria.
     */
    @Test
    public void testDevolverAnnosCuenta_1() {
        System.out.println("Test devolverAnnosCuenta correcto");
        String nombre = "Cuenta de Maria";
        int fechaActual = 2022;
        CuentaBancaria cuenta = new CuentaBancaria("Cuenta de Maria", 6000, 2010);
        int expResult = 12;
        int result = cuenta.devolverAnnosCuenta(nombre, fechaActual);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of devolverAnnosCuenta method, of class CuentaBancaria.
     */
    @Test
    public void testDevolverAnnosCuenta_2() {
        System.out.println("Test devolverAnnosCuenta correcto");
        String nombre = "Maria";
        int fechaActual = 2022;
        CuentaBancaria cuenta = new CuentaBancaria("Cuenta de María", 6000, 2010);
        int expResult = 2010;
        int result = cuenta.devolverAnnosCuenta(nombre, fechaActual);
        assertEquals(expResult, result);
    }
    
}
