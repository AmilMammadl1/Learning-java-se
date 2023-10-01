/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.main;

import at.favre.lib.crypto.bcrypt.BCrypt;
import com.company.entity.User;
import com.company.dao.impl.UserDaoImpl;
import com.company.dao.impl.UserSkillDaoImpl;
import com.mycompany.dao.inter.CountryDaoInter;
import com.mycompany.dao.inter.EmploymentHistoryDaoInter;
import com.mycompany.dao.inter.UserDaoInter;
import com.mycompany.dao.inter.UserSkillDaoInter;
import java.util.List;

/**
 *
 * @author amila
 */
public class Resumedapp31 {

    public static void main(String[] args) throws Exception {
        //UserDaoInter userdao = new UserDaoImpl();
        // CountryDaoInter userdao = Context.instanceCountryDao();
        //        List<User> list = userdao.getAll();
        //        userdao.removeUser(1);
        //        List<User> list2 = userdao.getAll();
        //
        //        System.out.println(list);
        //        System.out.println(list2);

        //        User u = new User();
        //        u.setId(2);
        //        u.setName("Amil'delete from user;select ' ");
        //        userdao.updateUser(u);
        //        User u2 = userdao.getById(2);
        //        u2.setName("Test31");
        //        userdao.updateUser(u2);
        //        User u = new User(0, "Amil", "Mammadli", "amilmmmdli01@gmail.com", "0558122067");
        //        userdao.AddUser(u);
        //System.out.println(userdao.getAll());
        //        System.out.println(userdao.getAllEmploymentHistoryByUserId(5));
        //        System.out.println(userdao.getAllEmploymentHistoryByUserId(5));
        // System.out.println(userdao.getAll());
        //======================================================
        //        BCrypt.Hasher crypt = BCrypt.withDefaults();
        //        System.out.println(crypt.hashToString(4, "12345".toCharArray()));
        // //////////////////////////////////////////////////////////////
        User u = new User(0, "testPassword", "testPasswordov", "testPassword@gmail.com", "123456", "rgedfgdf", null, null, null);
        u.setPassword("12345");
        new UserDaoImpl().addUser(u);

    }

}
