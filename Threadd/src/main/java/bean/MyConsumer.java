/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import bean.Base;

/**
 *
 * @author amilm
 */
public class MyConsumer implements Runnable {

    private final String name;

    public MyConsumer(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        //        for (int i = 0; i < 30; i++) {
//            System.out.println(name + " is processed");
//
//        }
        while (true) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException ex) {
//            }
//            int lastIndex = Base.list.size() - 1;
//
//            if (lastIndex > -1) {
//                System.out.println("last intex = " + lastIndex);
//                String s = Base.list.remove(lastIndex);
//                System.out.println("name " + s);
//            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {

            }
//            Base.a++;
//        int a = Base.getA();
//        a++;
//        Base.setA();
        Base.incA();

//            System.out.println("Amil: "+Base.a);
//       }
        }
    }
}
