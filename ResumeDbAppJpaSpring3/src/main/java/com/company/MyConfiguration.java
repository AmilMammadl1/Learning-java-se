/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author amila
 */
@Configuration
//@ComponentScan(basePackages = "outer")
//@Component
@Scope("prototype")
public class MyConfiguration {

    public MyConfiguration() {
        System.out.println("configuration!!!!");
    }

    @Bean("alma")
    //@Scope("prototype")
    Object object() {
        System.out.println("object is created in configuration");
        return new Object();
    }
}
