/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author amila
 */
public class Fanar2 {

    private String name;
    private String surname;
    private String fathername;
    private int age;

    private Fanar2(String name, String surname, String fathername, int age) {
        this.name = name;
        this.surname = surname;
        this.fathername = fathername;
        this.age = age;
    }

    private Fanar2() {

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFathername() {
        return fathername;
    }

    public int getAge() {
        return age;
    }

    public static FanarBuilder builder() {
        return new FanarBuilder();
    }

    public static class FanarBuilder {

        private Fanar2 f = null;

        public FanarBuilder() {
            f = new Fanar2();
        }

        public Fanar2 build() {
            return new Fanar2(f.name, f.surname, f.fathername, f.age);

        }

        public FanarBuilder setName(String name) {
            this.f.name = name;
            return this;
        }

        public FanarBuilder setfathername(String fathername) {
            this.f.fathername = fathername;
            return this;
        }

        public FanarBuilder setAge(int age) {
            this.f.age = age;
            return this;
        }

    }
}
