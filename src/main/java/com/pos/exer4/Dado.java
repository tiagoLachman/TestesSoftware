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
public class Dado {

    private Random rand = new Random();

    public int rolar() {
        return rand.nextInt(6) + 1;
    }
}
