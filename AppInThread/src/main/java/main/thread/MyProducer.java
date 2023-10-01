/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.thread;

/**
 *
 * @author amila
 */
public class MyProducer {

//    public void run() {
//        while (true) {
//
//        }
//    }
    private Object monitor1 = new Object();
    private Object monitor2 = new Object();

    public void doIt1() {
        System.out.println("doIt1 bashladi");
        synchronized (monitor1){
            System.out.println("doIt1");
        }
        System.out.println("doIt1 bitdi");

    }

    public void doIt2() {
        System.out.println("doIt2 bashladi");
        synchronized (monitor1) {
            System.out.println("doIt2");
        }
        System.out.println("doIt2 bitdi");
    }

    public void doIt3() {
        System.out.println("doIt3 bashladi");
        synchronized (monitor2) {
            System.out.println("doIt3");
        }
        System.out.println("doIt4 bitdi");
    }
    
//    public void doIt1() {
//        System.out.println("doIt1 bashladi");
//        System.out.println("doIt1");
//        System.out.println("doIt1 bitdi");
//
//    }
//
//    public void doIt2() {
//        System.out.println("doIt2 bashladi");
//        System.out.println("doIt2");
//        System.out.println("doIt2 bitdi");
//    }
//
//    public void doIt3() {
//        System.out.println("doIt3 bashladi");
//        System.out.println("doIt3");
//        System.out.println("doIt4 bitdi");
//    }

}
