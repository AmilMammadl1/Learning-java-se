/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.genericslesson;

/**
 *
 * @author amila
 */
public class Container2 {
    public <T> T doItAndReturn(T object) {
        System.out.println("i did something");
        return object;
    }
    public <T> T doItAndReturn2(T object) {
        System.out.println("i did something");
        return object;
    }
}
