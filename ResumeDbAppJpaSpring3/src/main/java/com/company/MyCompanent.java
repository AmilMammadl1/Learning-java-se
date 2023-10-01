/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author amila
 */
@Component
@Scope("prototype")
public class MyCompanent {

    public MyCompanent() {
        System.out.println("Compenent is created");
    }

//    @Bean("obj")
//    Object object() {
//        System.out.println("configuration");
//        return new Object();
//    }

}
