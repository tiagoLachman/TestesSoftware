/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pos.exer2;

/**
 *
 * @author Tiago André Lachman
 */
public class Identifier {

    public static boolean isValid(String identifier) throws InvalidIdentifierException {
        int length = identifier.length();

        if (length < 1 || length > 6) {
            throw new InvalidIdentifierException("Tamanho invalido: deve ter entre 1 e 6 caracteres.");
        }

        char firstChar = identifier.charAt(0);
        if (!Character.isLetter(firstChar)) {
            throw new InvalidIdentifierException("O primeiro caractere deve ser uma letra.");
        }

        for (char c : identifier.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                throw new InvalidIdentifierException("Contém caractere inválido: apenas letras e dígitos são permitidos.");
            }
        }

        return true;
    }
}
