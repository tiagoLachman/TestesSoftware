/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pos.testessoftware.exer2;

import com.pos.exer2.Identifier;
import com.pos.exer2.InvalidIdentifierException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Tiago André Lachman
 */
public class IdentifierTest {

    @Test
    void testT0_Valido() {
        assertDoesNotThrow(() -> {
            assertTrue(Identifier.isValid("a1"));
        });
    }

    @Test
    void testT0_PrimeiroCaractereInvalido() {
        Exception e = assertThrows(InvalidIdentifierException.class, () -> {
            Identifier.isValid("2B3");
        });
        assertEquals("O primeiro caractere deve ser uma letra.", e.getMessage());
    }

    @Test
    void testT0_CaractereInvalido() {
        Exception e = assertThrows(InvalidIdentifierException.class, () -> {
            Identifier.isValid("Z-12");
        });
        assertEquals("Contém caractere inválido: apenas letras e dígitos são permitidos.", e.getMessage());
    }

    @Test
    void testT0_TamanhoInvalido() {
        Exception e = assertThrows(InvalidIdentifierException.class, () -> {
            Identifier.isValid("A1b2C3d");
        });
        assertEquals("Tamanho inválido: deve ter entre 1 e 6 caracteres.", e.getMessage());
    }
}
