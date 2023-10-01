/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.collections;

import bean.Student;
import bean.Teacher;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import static javax.management.Query.value;

/**
 *
 * @author amila
 */
public class MyMap {

    public static void main(String[] args) {
//        HashMap<Teacher, Student> map = new HashMap<>();
//
//        Teacher teacher = new Teacher(1, "Ayaz", "Huseynov");
//        Teacher teacher2 = new Teacher(2, "Ayaz2", "Huseynov2");
//
//        map.put(teacher, new Student(1, "amil", "mammadli"));
//        map.put(teacher2, new Student(2, "amil2", "mammadli2"));
//        
//        System.out.println("get is called");
//        map.get(teacher2);        
//        map.put(1, "Amil");
//        map.put(1, "Ayaz");
//
//        String value = map.get(1);
//
//        System.out.println("key = 1, value = " + value);
        // TreeMap<Integer, String> t = new TreeMap<>();
        // t.put(Integer.SIZE, "");

        Map<Teacher, Student> map = new TreeMap<>();
//

        Teacher teacher2 = new Teacher(2, "Ayaz2", "Huseynov2");
        Teacher teacher3 = new Teacher(3, "Ayaz3", "Huseynov3");
        Teacher teacher1 = new Teacher(1, "Ayaz1", "Huseynov1");

        map.put(teacher1, new Student(1, "amil1", "mammadli1"));
        map.put(teacher3, new Student(3, "amil3", "mammadli3"));
        map.put(teacher2, new Student(2, "amil2", "mammadli2"));

        System.out.println(map.keySet());
      //  System.out.println(map.values());

    }
}
