/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author amila
 */
public class MyConsumer implements Runnable {

    private String name;

    public MyConsumer(String name) {
        this.name = name;
    }

    @Override
    public void run() {
//        for (int i = 0; i < 30; i++) {
//            System.out.println(name + " is processed");
//        }
        while (true) {
            //            int lastElement = Base.list.size() - 1;
            //            System.out.println("last element = "+lastElement);
            //            if (lastElement > -1) {
            //                String s = Base.list.remove(lastElement);
            //                System.out.println(s);
            //            }
            Base.a++;

        }
    }
}
