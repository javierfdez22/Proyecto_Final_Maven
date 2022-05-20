/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.proyecto_final_maven;

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
public class ClienteTest {
    
    public ClienteTest() {
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
     * Test of diferenciaAnnos method, of class Cliente.
     */
    @Test
    public void testDiferenciaAnnos_1() {
        System.out.println("Test diferenciaAnnos correcto");
        int annos = 2018;
        String nombre = "Ana";
        CuentaBancaria cuenta = new CuentaBancaria("Ana", 6230, 2019);
        Cliente cliente = new Cliente(nombre, annos, cuenta);
        int expResult = 1;
        int result = cliente.diferenciaAnnos(cliente.getAnnoAfiliacion(), nombre);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of diferenciaAnnos method, of class Cliente.
     */
    @Test
    public void testDiferenciaAnnos_2() {
        System.out.println("Test diferenciaAnnos erroneo");
        int annos = 2018;
        String nombre = "Ana";
        CuentaBancaria cuenta = new CuentaBancaria("Cuenta de Ana", 6230, 2019);
        Cliente cliente = new Cliente(nombre, annos, cuenta);
        int expResult = 2018;
        int result = cliente.diferenciaAnnos(cliente.getAnnoAfiliacion(), nombre);
        assertEquals(expResult, result);
    }
    
}
