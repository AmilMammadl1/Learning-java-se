/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import bean.Fanar2;
import bean.Fanar2.FanarBuilder;

/**
 *
 * @author amila
 */
public class Main {

    public static void main(String[] args) {
        FanarBuilder f = Fanar2.builder();
        f.setName("amil");
        f.setAge(19);
        Fanar2 ff = f.build();

    }
}
