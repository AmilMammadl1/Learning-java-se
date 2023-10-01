/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author amila
 */
public class Main {

    public static void main(String[] args) {

//        User user = new User();
//        User user2 = new User();
//        User user3 = new User();
//        User user4 = new User();
//
//        user.setUser(user2);
//        user2.setUser(user3);
//        user3.setUser(user4);
//
//        user.getUser().getUser().getUser();
//
//        Collection<String> co = Collections.synchronizedList(new ArrayList<String>());
//        Vector<String> v = new Vector<>();
//        ArrayList<String> l = new ArrayList<>();
//        l.add("Amil");
//        l.add("Ayaz");
//
//        for (int i = 0; i < l.size(); i++) {
//            System.out.println(l.get(i));
//        }
//        MyArrayList list = new MyArrayList();
//        for (int i = 0; i < list.size; i++) {
//            String s = list.get(i);
//
//        }
//        LinkedList<String> list = new LinkedList<>();
//        list.add("salam");
//        list.add("sagol");
////        for (String s : list) {
////            System.out.println(s);
////        }
//        Iterator<String> iter = list.iterator();
//        while (iter.hasNext()) {
//            String s = iter.next();
//            System.out.println(s);
//
//        Comparator<Integer> compar = new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                Integer i1 = (Integer) o1;
//                Integer i2 = (Integer) o2;
//
//                int result = 0;
//                if (i1 == i2) {
//                    result = 0;
//                } else if (i1 > i2) {
//                    result = 1;
//                } else if (i1 < i2) {
//                    result = -1;
//                }
//                return result;
//            }
//        };
//        System.out.println(compar.compare(5, 5));
//        User user = new User();
//        user.age = 15;
//
//        User user2 = new User();
//        user2.age = 15;
//        
//        System.out.println(user.compareTo(user2));
        Comparator<User> compar = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                User u1 = (User) o1;
                User u2 = (User) o2;

                int result = 0;
                if (u1.age == u2.age) {
                    result = 0;
                } else if (u1.age > u2.age) {
                    result = 1;
                } else if (u1.age < u2.age) {
                    result = -1;
                }
                return result;
            }
        };

        List<User> list = Arrays.asList(new User(3), new User(1), new User(2), new User(5));

        for (User u : list) {
            System.out.println(u.age);
        }
        System.out.println("==================================");

        Collections.sort(list, compar);

        for (User u : list) {
            System.out.println(u.age);
        }
    }
}
