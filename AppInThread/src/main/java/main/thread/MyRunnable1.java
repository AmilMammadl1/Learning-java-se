/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.thread;

import main.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author amila
 */
public class MyRunnable1 implements Runnable {

    private int index;

    public MyRunnable1() {
    }

    public MyRunnable1(int index) {
        this.index = index;
    }

    @Override
    public void run() {
        System.out.println(index + " .Runnable ise dusdu ve 4 saniye gozleyecek");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("Runnable isi bitirdi");
    }

}
