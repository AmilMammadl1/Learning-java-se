/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.collections;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 *
 * @author amila
 */
public class User implements Comparable<User> {

    public User(int age) {
        this.age = age;
    }
    private User user;
    public int age;

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return this.user;
    }

    @Override
    public int compareTo(User o) {
        int result = 0;
        if (o.age == this.age) {
            result = 0;
        } else if (o.age > this.age) {
            result = 1;
        } else if (o.age < this.age) {
            result = -1;
        }
        return result;
    }
}
