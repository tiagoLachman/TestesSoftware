/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pos.exer3;

/**
 *
 * @author Tiago André Lachman
 */
public class CalculadoraSalario {

    public double calcula(Funcionario funcionario) {
        double salario = funcionario.getSalarioBase();
        switch (funcionario.getCargo()) {
            case DESENVOLVEDOR:
                return salario >= 3000.0 ? salario * 0.8 : salario * 0.9;

            case DBA:
            case TESTADOR:
                return salario >= 2000.0 ? salario * 0.75 : salario * 0.85;

            case GERENTE:
                return salario >= 5000.0 ? salario * 0.7 : salario * 0.8;

            default:
                throw new IllegalArgumentException("Cargo não suportado: " + funcionario.getCargo());
        }
    }
}
