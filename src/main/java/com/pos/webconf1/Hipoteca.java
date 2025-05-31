/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pos.webconf1;

/**
 *
 * @author Tiago André Lachman
 */
public class Hipoteca {

    public static int calcular(boolean generoFeminino, int idade, int salario) {
        int fator = 0;

        if (generoFeminino) {
            if (idade >= 18 && idade <= 30) {
                fator = 70;
            } else if (idade >= 31 && idade <= 40) {
                fator = 50;
            } else if (idade >= 41 && idade <= 50) {
                fator = 35;
            }
        } else {
            if (idade >= 18 && idade <= 35) {
                fator = 75;
            } else if (idade >= 36 && idade <= 45) {
                fator = 55;
            } else if (idade >= 46 && idade <= 55) {
                fator = 30;
            }
        }

        return salario * fator;
    }
}
