/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.thread;

import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author amila
 */
public class MyRunnableAndCallable implements Runnable, Callable<Object> {

    private int num;

    public MyRunnableAndCallable(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        doIt();
    }

    @Override
    public Object call() throws Exception {
        doIt();
        return this;
    }

    public void doIt() {
        System.out.println(num + " -Runnable ise dusdu ve 3 saniye gozleyecek");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println(num + " -Runnable isi bitirdi");
    }

}
