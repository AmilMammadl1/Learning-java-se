/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.company.dao.impl;

import com.company.entity.User;
import java.util.List;

/**
 *
 * @author amila
 */
public interface UserRepositoryCustom {

    public List<User> getAll(String name, String surname, Integer nationalityId);

    public User findByEmail(String email);

    public User findByEmailAndPassword(String email, String password);

    public User getById(int id);

    public boolean updateUser(User u);

    public boolean removeUser(int id);

    public boolean addUser(User u);

}
