/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author amila
 */
public class Fanar {

    private String name = null;
    private Mercedes m = null;

    public Fanar(String name, Mercedes m) {

        this.name = name;
    //    this.m = m;
        Mercedes mm = new Mercedes();
        mm.name = m.name;
        this.m = mm;
    }

    public Mercedes getM() {
        Mercedes mm = new Mercedes();
        mm.name = m.name;
        return mm;
    }
//    public Mercedes getM() {
//       return m;
//    }

    public String getName() {
        return name;
    }

    public Fanar() {

    }

    private static Fanar f = null;

    public static Fanar instance() {
        if (f == null) {
            f = new Fanar();
        }
        return f;
    }
}
