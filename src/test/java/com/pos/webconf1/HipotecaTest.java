/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pos.webconf1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Tiago André Lachman
 */
public class HipotecaTest {

    @Test
    void testHomemJovem() {
        assertEquals(7500, Hipoteca.calcular(false, 25, 100));
    }

    @Test
    void testMulherJovem() {
        assertEquals(7000, Hipoteca.calcular(true, 28, 100));
    }

    @Test
    void testHomemMedio() {
        assertEquals(5500, Hipoteca.calcular(false, 40, 100));
    }

    @Test
    void testMulherIdosa() {
        assertEquals(3500, Hipoteca.calcular(true, 45, 100));
    }

}
