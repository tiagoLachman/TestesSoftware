/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pos.exer5;

import java.util.Random;

/**
 *
 * @author Tiago André Lachman
 */
public class MyRandomNumber {

    Random random = new Random();
    int lastNumber = Integer.MIN_VALUE;

    /**
     *
     * @param begin inicio do intervalo
     * @param end fim do intervalo
     * @return retornar um numero aleatorio entre [begin, end] o numero
     * aleatorio retornado nao pode ser igual ao anterior
     * @throws IntervaloInvalidoException essa excecao eh lancada quando begin
     * >= end ou (begin<0 || end<0)
     *
     */
    public int nextRandomNumber(int begin, int end) throws IntervaloInvalidoException {
        if (begin < 0 || end < 0) {
            throw new IntervaloInvalidoException("Intervalo negativo");
        }
        if (begin >= end) {
            throw new IntervaloInvalidoException("Begin maior ou igual ao end");
        }

        int result;
        do {
            result = random.nextInt(end - begin + 1) + begin;
        } while (result == lastNumber && (end - begin) > 0);

        lastNumber = result;
        return result;
    }
}
