/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.dao.inter;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author amila
 */
public abstract class AbstractDao {

    public Connection connect() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/resume";
        String username = "root";
        String password = "amil2003";
        Connection c = DriverManager.getConnection(url, username, password);
        return c;
    }
    private static EntityManagerFactory emf = null;

    public static EntityManager em() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory("resumeappPU");
        }
        EntityManager entitymanager = emf.createEntityManager();
        return entitymanager;
    }

    public static void closeEmf() {
        emf.close();
    }

}
