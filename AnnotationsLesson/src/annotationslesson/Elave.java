/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package annotationslesson;

/**
 *
 * @author amila
 */
public class Elave {

    public Student[] s;

    @BoshOlmasin
    public static void foo() {
        System.out.println("foo");
    }

    @BoshOlmasin
    public static void foo2() {
        System.out.println("foo2");
    }

    @BoshOlmasin
    public static void foo3() {
        System.out.println("foo3");
    }

    @BoshOlmasin
    public void foo4(Student[] s) {
        this.s = s;

    }

}
