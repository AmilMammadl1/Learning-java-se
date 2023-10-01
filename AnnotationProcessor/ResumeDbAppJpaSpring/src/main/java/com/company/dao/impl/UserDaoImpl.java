/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.dao.impl;

import at.favre.lib.crypto.bcrypt.BCrypt;
import com.company.entity.User;
import com.company.dao.inter.UserDaoInter;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author amila
 */
@Repository("userDaoImpl1")
public class UserDaoImpl implements UserDaoInter {

    @PersistenceContext
    EntityManager em;

    @Override
    public List<User> getAll(String name, String surname, Integer nationalityId) {
        String jpqlq = "select u from User u where 1=1";
        if (name != null && !name.trim().isEmpty()) {
            jpqlq += " and u.name = : namee ";
        }
        if (surname != null && !surname.trim().isEmpty()) {
            jpqlq += " and u.surname = :surnamee ";
        }
        if (nationalityId != null) {
            jpqlq += " and u.nationality.id = :nid ";
        }
        Query q = em.createQuery(jpqlq);

        if (name != null && !name.trim().isEmpty()) {
            q.setParameter("namee", name);
        }

        if (surname != null && !surname.trim().isEmpty()) {
            q.setParameter("surnamee", surname);
        }
        if (nationalityId != null) {
            q.setParameter("nid", nationalityId);
        }

        return q.getResultList();
    }

    @Override
    public User getById(int userId) {
        User u = em.find(User.class, userId);
        return u;

    }

    public boolean updateUser(User u) {
        em.merge(u);
        return true;
    }

    @Override
    public boolean removeUser(int id) {
        User u = em.find(User.class, id);
        em.remove(u);
        return true;
    }
    private static BCrypt.Hasher crypt = BCrypt.withDefaults();

    @Override
    public boolean addUser(User u) {
        u.setPassword(crypt.hashToString(4, u.getPassword().toCharArray()));
        em.persist(u);
        return true;
    }

    @Override
    public User findByEmailAndPassword(String email, String password) {
        Query q = em.createQuery("select u from User u where u.email=:e and u.password = :p");
        q.setParameter("e", email);
        q.setParameter("p", password);

        List<User> list = q.getResultList();
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

//    @Override
//    public User findByEmail(String email) {
//        EntityManager em = em();
//        Query q = em.createQuery("select u from User u where u.email=:e");
//        q.setParameter("e", email);
//
//        List<User> list = q.getResultList();
//        if (list.size() == 1) {
//            return list.get(0);
//        }
//        return null;
//    }
    @Override
    public User findByEmail(String email) {
        Query q = em.createNamedQuery("User.findByEmail");
        q.setParameter("email", email);

        List<User> list = q.getResultList();
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }
}
