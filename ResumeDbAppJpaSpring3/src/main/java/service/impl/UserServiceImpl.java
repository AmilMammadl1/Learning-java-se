/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import at.favre.lib.crypto.bcrypt.BCrypt;
import com.company.entity.User;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.inter.UserServiceInter;

/**
 *
 * @author amila
 */
@Service
@Transactional
public class UserServiceImpl implements UserServiceInter {

    @Autowired
    private UserServiceInter userdao;

    @Override
    public List<User> getAll(String name, String surname, Integer nationalityId) {
        return userdao.getAll(name, surname, nationalityId);
    }

    @Override
    public User getById(int userId) {
        return userdao.getById(userId);
    }

    @Transactional
    public boolean updateUser(User u) {
        return userdao.updateUser(u);
    }

    @Override
    public boolean removeUser(int id) {
        return userdao.removeUser(id);
    }
    private static BCrypt.Hasher crypt = BCrypt.withDefaults();

    @Override
    public boolean addUser(User u) {
        return userdao.addUser(u);
    }

    @Override
    public User findByEmailAndPassword(String email, String password) {
        return userdao.findByEmailAndPassword(email, password);
    }

    @Override
    public User findByEmail(String email) {
        return userdao.findByEmail(email);
    }
}
