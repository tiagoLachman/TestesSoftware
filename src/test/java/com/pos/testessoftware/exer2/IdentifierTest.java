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
            assertTrue(Identifier.isValid("abc12"));
        });
    }

    @Test
    void testT0_PrimeiroCaractereInvalido() {
        Exception e = assertThrows(InvalidIdentifierException.class, () -> {
            Identifier.isValid("cont*1");
        });
        assertEquals("Contém caractere inválido: apenas letras e dígitos são permitidos.", e.getMessage());
    }

    @Test
    void testT0_CaractereInvalido() {
        Exception e = assertThrows(InvalidIdentifierException.class, () -> {
            Identifier.isValid("1soma");
        });
        assertEquals("O primeiro caractere deve ser uma letra.", e.getMessage());
    }

    @Test
    void testT0_TamanhoInvalido() {
        Exception e = assertThrows(InvalidIdentifierException.class, () -> {
            Identifier.isValid("a123456");
        });
        assertEquals("Tamanho invalido: deve ter entre 1 e 6 caracteres.", e.getMessage());
    }
}
