/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enums;

/**
 *
 * @author amila
 */
public class Enums2 {

    public static final Enums2 topla = new Enums2('+');
    public static final Enums2 chix = new Enums2('-');
    public static final Enums2 vur = new Enums2('*');
    public static final Enums2 bol = new Enums2('/');

    
    private char c;

    Enums2() {

    }

    Enums2(char c) {
        this.c = c;
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
}
