/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pos.exer4;

import java.util.Random;

/**
 *
 * @author Tiago André Lachman
 */
public class Craps {

    private int soma, ponto, vencedor;
    private boolean primeiraRodada = true;
    private Dado dado = new Dado();

    public boolean isFimDeJogo() {
        return vencedor == 1 || vencedor == 2;
    }

    public int getVencedor() {
        return vencedor;
    }

    void setDado(Dado novoDado) {
        this.dado = novoDado;
    }

    public int rolarDados() {
        soma = dado.rolar() + dado.rolar();
        if (primeiraRodada) {
            if (soma == 7 || soma == 11) {
                vencedor = 1;
            } else if (soma == 2 || soma == 3 || soma == 12) {
                vencedor = 2;
            } else {
                ponto = soma;
            }
            primeiraRodada = false;
        } else {
            if (soma == ponto) {
                vencedor = 1;
            } else if (soma == 7) {
                vencedor = 2;
            }
        }
        return soma;
    }
}
