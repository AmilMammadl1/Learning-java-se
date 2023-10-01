/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thread;

//import Main.thread.Base;
import bean.Base;
import bean.MyConsumer;

//import Main.thread.MyConsumer;
//import Main.thread.MyProducer;
//import java.util.function.Consumer;
/**
 *
 * @author amilm
 */
public class Threadd {

    public static void main(String[] args) throws InterruptedException {
        //  System.out.println("Threadd count" + Threadd.activeCount());     
        Thread[] thread = new Thread[100];
        for (int i = 0; i < 100; i++) {
            thread[i] = new Thread(new MyConsumer("Test"));
        }
        for (int i = 0; i < 100; i++) {
            thread[i].start();
        }
        System.out.println(Base.a);
//        System.out.println("Threadd count" + Threadd.activeCount());
//
//        Threadd.sleep(5000);
//        System.out.println(Base.getA());


//        MyProducer p = new MyProducer();
//        MyConsumer m1 = new MyConsumer("Amil");
//        MyConsumer m2 = new MyConsumer("Ayaz");
//
//        Thread t = new Thread(new MyProducer());
//        Thread m1 = new Thread(new MyConsumer("Ayaz"));
//        Thread m2 = new Thread(new MyConsumer("Amil"));
//        
//        
//        t.start();
//        m1.start();
//        m2.start();
    }
}
