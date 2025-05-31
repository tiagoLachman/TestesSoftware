/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pos.exer5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Tiago André Lachman
 */
public class MyRandomNumberTest {

    @Test
    void testNumeroDentroDoIntervalo() throws IntervaloInvalidoException {
        MyRandomNumber mrn = new MyRandomNumber();
        int result = mrn.nextRandomNumber(1, 10);
        assertTrue(result >= 1 && result <= 10);
    }

    @Test
    void testIntervaloInvalidoBeginMaiorOuIgualEnd() {
        MyRandomNumber mrn = new MyRandomNumber();
        assertThrows(IntervaloInvalidoException.class, () -> {
            mrn.nextRandomNumber(10, 5);
        });
    }

    @Test
    void testIntervaloInvalidoNegativo() {
        MyRandomNumber mrn = new MyRandomNumber();
        assertThrows(IntervaloInvalidoException.class, () -> {
            mrn.nextRandomNumber(-1, 5);
        });
        assertThrows(IntervaloInvalidoException.class, () -> {
            mrn.nextRandomNumber(0, -5);
        });
    }

    @Test
    void testNaoRepetirNumeroAnterior() throws IntervaloInvalidoException {
        MyRandomNumber mrn = new MyRandomNumber();
        int first = mrn.nextRandomNumber(1, 2);
        int second = mrn.nextRandomNumber(1, 2);
        assertNotEquals(first, second);
    }
}
