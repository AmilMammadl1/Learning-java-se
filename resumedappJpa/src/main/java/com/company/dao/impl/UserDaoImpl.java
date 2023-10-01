/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.dao.impl;

import at.favre.lib.crypto.bcrypt.BCrypt;
import com.company.entity.User;
import com.company.dao.inter.AbstractDao;
import com.company.dao.inter.UserDaoInter;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author amila
 */
public class UserDaoImpl extends AbstractDao implements UserDaoInter {

    @Override
    public List<User> getAll(String name, String surname, Integer nationalityId) {
        EntityManager em = em();
        String jpqlq = "select u from User u where 1=1";

//            String sql = "SELECT"
//                    + "	u.*,"
//                    + "	n.nationality as nationality,"
//                    + "	c.name as birthplace"
//                    + "	FROM user u"
//                    + "	LEFT JOIN country n on u.nationality_id = n.id"
//                    + "	LEFT JOIN country c ON u.birthplace_id = c.id where 1=1 ";
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
        EntityManager entitymanager = em();
        User u = entitymanager.find(User.class, userId);
        // closeEmf();
        entitymanager.close();
        return u;

    }

    public boolean updateUser(User u) {
        EntityManager entitymanager = em();
        entitymanager.getTransaction().begin();
        entitymanager.merge(u);
        entitymanager.getTransaction().commit();
        // closeEmf();
        entitymanager.close();

        return true;
    }

    @Override
    public boolean removeUser(int id) {
        EntityManager entitymanager = em();
        User u = entitymanager.find(User.class, id);
        entitymanager.getTransaction().begin();
        entitymanager.remove(u);
        entitymanager.getTransaction().commit();
        // closeEmf();
        entitymanager.close();

        return true;
    }
    private static BCrypt.Hasher crypt = BCrypt.withDefaults();

    @Override
    public boolean addUser(User u) {
        u.setPassword(crypt.hashToString(4, u.getPassword().toCharArray()));
        EntityManager entitymanager = em();
        entitymanager.getTransaction().begin();
        entitymanager.persist(u);
        entitymanager.getTransaction().commit();
        //   closeEmf();
        entitymanager.close();

        return true;

    }

    @Override
    public User findByEmailAndPassword(String email, String password) {
        EntityManager em = em();

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
        EntityManager em = em();
        Query q = em.createNamedQuery("User.findByEmail");
        q.setParameter("email", email);

        List<User> list = q.getResultList();
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }
}
