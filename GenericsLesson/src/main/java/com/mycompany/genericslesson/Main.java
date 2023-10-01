/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.genericslesson;

/**
 *
 * @author amila
 */
public class Main {

    public static void main(String[] args) {
        //Container<Integer, Double> container = new Container<Integer, Double>(new Integer(5));
//        User u = (User) container.doItAndReturn();
        //Integer u = container.doItAndReturn();
//        Container2 container2 = new Container2();
//        Double d = container2.<Double>doItAndReturn(3.4);
//        Integer i = container2.<Integer>doItAndReturn(3);

//        doSomething(container2);
        Container<User3> container = new Container<>(new User3());
        method2(container);
    }

//    public static void doSomething(Container<User> container2) {
//        User u = container.doItAndReturn();
//        System.out.println("u = " + u);
//
//    }
    public static void method1(Container<? extends User1> container) {

    }

    public static void method2(Container<? extends User3> container) {

    }
}
