/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.genericslesson;

/**
 *
 * @author amila
 */
public class Container<T> {

    private T object;
    // private E object2;

    public T doItAndReturn() {
        System.out.println("i did something");
        return this.object;
    }
//    public E doItAndReturn2() {
//        System.out.println("i did something");
//        return this.object2;
//    }

    public Container(T object) {
        this.object = object;
    }
}
