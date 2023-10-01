/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enums;

/**
 *
 * @author amilm
 */
public enum Enums {
    topla('+'), chix('-'), vur('/'), bol('*'), UNKNOWN;
    private char c;

    Enums(char c) {
        this.c = c;
    }

    Enums() {

    }

    public char getOperationSymbol() {
        return this.c;

    }

    public double hesabla(double a, double b) {
        if (c == '+') {
            return a + b;
        }
        return -1;
    }

    public static Enums parse(char c) {
        if (c == '+') {
            return topla;
        }
        return UNKNOWN;
    }
}
