/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.threadd;

import bean.Base;
import bean.MyConsumer;
import bean.MyProducer;

/**
 *
 * @author amilm
 */
public class Threadd {

    public static void main(String[] args) throws Exception {
        //  System.out.println("Thread count" + Thread.activeCount());
//      
//        Thread p2 = new Thread(new MyProducer());
//        Thread m1 = new Thread(new MyConsumer("Ayaz"));
//        Thread m2 = new Thread(new MyConsumer("Amil"));
//     
//        MyProducer p = new MyProducer();
//       
//        MyConsumer m1 = new MyConsumer("Ayaz");
//        MyConsumer m2 = new MyConsumer("Amil");
//     
      
//        p.start();
//        p2.start();
//        m1.start();
//        m2.start();
     

        Thread[] thread = new Thread[100];
        for (int i = 0; i < 100; i++) {
            thread[i] = new Thread(new MyConsumer("Test"));
        }
        for (int i = 0; i < 100; i++) {
            thread[i].start();
        }
//        System.out.println("Thread count" + Thread.activeCount());

        Thread.sleep(300);
        System.out.println(Base.getA());
    }
}