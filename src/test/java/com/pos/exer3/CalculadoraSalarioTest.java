/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pos.exer3;

/**
 *
 * @author Tiago André Lachman
 */
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraSalarioTest {

    @Test
    public void deveCalcularSalarioDesenvolvedorComDescontoDe20Porcento() {
        Funcionario dev = new Funcionario("João", "joao@empresa.com", 5000.0, Cargo.DESENVOLVEDOR);
        CalculadoraSalario calculadora = new CalculadoraSalario();

        double salario = calculadora.calcula(dev);
        assertEquals(4000.0, salario, 0.0001);
    }

    @Test
    public void deveCalcularSalarioDesenvolvedorComDescontoDe10Porcento() {
        Funcionario dev = new Funcionario("Maria", "maria@empresa.com", 2500.0, Cargo.DESENVOLVEDOR);
        CalculadoraSalario calculadora = new CalculadoraSalario();

        double salario = calculadora.calcula(dev);
        assertEquals(2250.0, salario, 0.0001);
    }

    @Test
    public void deveCalcularSalarioDbaComDescontoDe25Porcento() {
        Funcionario dba = new Funcionario("Carlos", "carlos@empresa.com", 3000.0, Cargo.DBA);
        CalculadoraSalario calculadora = new CalculadoraSalario();

        double salario = calculadora.calcula(dba);
        assertEquals(2250.0, salario, 0.0001);
    }

    @Test
    public void deveCalcularSalarioTestadorComDescontoDe15Porcento() {
        Funcionario testador = new Funcionario("Ana", "ana@empresa.com", 550.0, Cargo.TESTADOR);
        CalculadoraSalario calculadora = new CalculadoraSalario();

        double salario = calculadora.calcula(testador);
        assertEquals(467.5, salario, 0.0001);
    }

    @Test
    public void deveCalcularSalarioGerenteComDescontoDe30Porcento() {
        Funcionario gerente = new Funcionario("Pedro", "pedro@empresa.com", 6000.0, Cargo.GERENTE);
        CalculadoraSalario calculadora = new CalculadoraSalario();

        double salario = calculadora.calcula(gerente);
        assertEquals(4200.0, salario, 0.0001);
    }

    @Test
    public void deveCalcularSalarioGerenteComDescontoDe20Porcento() {
        Funcionario gerente = new Funcionario("Laura", "laura@empresa.com", 2500.0, Cargo.GERENTE);
        CalculadoraSalario calculadora = new CalculadoraSalario();

        double salario = calculadora.calcula(gerente);
        assertEquals(2000.0, salario, 0.0001);
    }
}
