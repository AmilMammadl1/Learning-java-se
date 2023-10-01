/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author amilm
 */
public class Base implements Runnable{

//    public static List<String> list = new ArrayList<String>();
  //  public static volatile int a = 0;
    public static int a;
//
    public  static int getA() {
        return a;
    }
    public static synchronized void incA() {
        a++;
    }

    @Override
    public void run() {
       
    }
}