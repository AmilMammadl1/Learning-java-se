/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProxyPattern;

/**
 *
 * @author amila
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
      Image image = new ProxyImage("test_10mb.jpg");
        //Image image = ObjectCreator.objectCreator(RealImage.class);

        image.display();
        System.out.println("");

        //image will not be loaded from disk
        image.display();
    }
}
