/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.collectionapipart2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

/**
 *
 * @author amila
 */
public class Main {

    public static void main(String[] args) {
        Student s = new Student(25, "Amil", "Mammadli");
        Student s1 = new Student(25, "Amil", "Mammadli");
        Map<Student, Integer> map = new HashMap<>();
        map.put(s, 1);
        map.put(s1, 2);
        System.out.println(map);

        //       Teacher t = new Teacher(25, "Amil", "Mammadli");
//        Map<Person, Integer> map = new HashMap<>();
//        map.put(s, 1);
//        map.put(t, 2);
//        Deque<String> deque = new Deque<String>() {
        //            @Override
        //            public void addFirst(String e) {
        //                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        //            }
        //
        //            @Override
        //            public void addLast(String e) {
        //                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        //            }
        //
        //            @Override
        //            public boolean offerFirst(String e) {
        //                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        //            }
        //
        //            @Override
        //            public boolean offerLast(String e) {
        //                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        //            }
        //
        //            @Override
        //            public String removeFirst() {
        //                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        //            }
        //
        //            @Override
        //            public String removeLast() {
        //                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        //            }
        //
        //            @Override
        //            public String pollFirst() {
        //                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        //            }
        //
        //            @Override
        //            public String pollLast() {
        //                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        //            }
        //
        //            @Override
        //            public String getFirst() {
        //                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        //            }
        //
        //            @Override
        //            public String getLast() {
        //                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        //            }
        //
        //            @Override
        //            public String peekFirst() {
        //                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        //            }
        //
        //            @Override
        //            public String peekLast() {
        //                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        //            }
        //
        //            @Override
        //            public boolean removeFirstOccurrence(Object o) {
        //                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        //            }
        //
        //            @Override
        //            public boolean removeLastOccurrence(Object o) {
        //                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        //            }
        //
        //            @Override
        //            public boolean add(String e) {
        //                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        //            }
        //
        //            @Override
        //            public boolean offer(String e) {
        //                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        //            }
        //
        //            @Override
        //            public String remove() {
        //                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        //            }
        //
        //            @Override
        //            public String poll() {
        //                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        //            }
        //
        //            @Override
        //            public String element() {
        //                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        //            }
        //
        //            @Override
        //            public String peek() {
        //                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        //            }
        //
        //            @Override
        //            public boolean addAll(Collection<? extends String> c) {
        //                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        //            }
        //
        //            @Override
        //            public void push(String e) {
        //                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        //            }
        //
        //            @Override
        //            public String pop() {
        //                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        //            }
        //
        //            @Override
        //            public boolean remove(Object o) {
        //                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        //            }
        //
        //            @Override
        //            public boolean contains(Object o) {
        //                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        //            }
        //
        //            @Override
        //            public int size() {
        //                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        //            }
        //
        //            @Override
        //            public Iterator<String> iterator() {
        //                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        //            }
        //
        //            @Override
        //            public Iterator<String> descendingIterator() {
        //                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        //            }
        //
        //            @Override
        //            public boolean isEmpty() {
        //                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        //            }
        //
        //            @Override
        //            public Object[] toArray() {
        //                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        //            }
        //
        //            @Override
        //            public <T> T[] toArray(T[] a) {
        //                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        //            }
        //
        //            @Override
        //            public boolean containsAll(Collection<?> c) {
        //                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        //            }
        //
        //            @Override
        //            public boolean removeAll(Collection<?> c) {
        //                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        //            }
        //
        //            @Override
        //            public boolean retainAll(Collection<?> c) {
        //                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        //            }
        //
        //            @Override
        //            public void clear() {
        //                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        //            }
        //        };
        //        PriorityQueue<String> queue = new PriorityQueue<>();
        //        queue.add("amil");
        //        List<String> list = new ArrayList<>();
        //
        //        list.add("Amil");
        //        list.add("Amil");
        //        list.add("Amil");
        //        list.add("Ayaz");
        //        list.add("Ayaz");
        //        list.add("Ayaz");
        //        for (String s : list) {
        //            System.out.println(s);
        //        }
        //       Set<String> set = new HashSet<>(list);
        //        set.add("Amil");
        //        set.add("Amil");
        //        set.add("Amil");
        //        set.add("Amil");
        //        set.add("Amil");
        //        set.add("Amil");
        //        set.add("Amil");
        //   for (String s : set) {
        //    System.out.println(s);
    }
//    }
}
