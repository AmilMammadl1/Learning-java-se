/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.dao.impl;

import at.favre.lib.crypto.bcrypt.BCrypt;
import com.company.entity.Country;
import com.company.entity.User;
import com.mycompany.dao.inter.AbstractDao;
import com.mycompany.dao.inter.UserDaoInter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author amila
 */
public class UserDaoImpl extends AbstractDao implements UserDaoInter {

    private User getUser(ResultSet rs) throws Exception {
        int id = rs.getInt("id");
        String name = rs.getString("name");
        String surname = rs.getString("surname");
        String email = rs.getString("email");
        String phone = rs.getString("phone");
        String profileDesc = rs.getString("profile_description");
        int nationalityId = rs.getInt("nationality_id");
        int birthplaceId = rs.getInt("birthplace_id");
        String nationalityStr = rs.getString("nationality");
        String birthplaceStr = rs.getString("birthplace");
        Date birthDate = rs.getDate("birthdate");

        Country nationality = new Country(nationalityId, null, nationalityStr);
        Country birthplace = new Country(birthplaceId, birthplaceStr, null);
        return new User(id, name, surname, email, phone, profileDesc, birthDate, nationality, birthplace);
    }

    private User getUserSimple(ResultSet rs) throws Exception {
        int id = rs.getInt("id");
        String name = rs.getString("name");
        String surname = rs.getString("surname");
        String email = rs.getString("email");
        String phone = rs.getString("phone");
        String profileDesc = rs.getString("profile_description");
        int nationalityId = rs.getInt("nationality_id");
        int birthplaceId = rs.getInt("birthplace_id");
        Date birthDate = rs.getDate("birthdate");

        User user = new User(id, name, surname, email, phone, profileDesc, birthDate, null, null);
        user.setPassword(rs.getString("password"));
        return user;
    }

    @Override
    public List<User> getAll(String name, String surname, Integer nationalityId) {
        List<User> result = new ArrayList<>();

        try (Connection c = connect()) {

            String sql = "SELECT"
                    + "	u.*,"
                    + "	n.nationality as nationality,"
                    + "	c.name as birthplace"
                    + "	FROM user u"
                    + "	LEFT JOIN country n on u.nationality_id = n.id"
                    + "	LEFT JOIN country c ON u.birthplace_id = c.id where 1=1 ";
            if (name != null && !name.trim().isEmpty()) {
                sql += " and u.name = ? ";
            }
            if (surname != null && !surname.trim().isEmpty()) {
                sql += " and u.surname = ? ";
            }
            if (nationalityId != null) {
                sql += " and u.nationality_id = ? ";
            }
            PreparedStatement stmt = c.prepareStatement(sql);

            int i = 1;
            if (name != null && !name.trim().isEmpty()) {
                stmt.setString(i, name);
                i++;
            }
            if (surname != null && !surname.trim().isEmpty()) {
                stmt.setString(i, surname);
                i++;
            }
            if (nationalityId != null) {
                stmt.setInt(i, nationalityId);
                i++;
            }
            stmt.execute();
            ResultSet rs = stmt.getResultSet();

            while (rs.next()) {
                User u = getUser(rs);
                result.add(u);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    @Override
    public User getById(int userId) {
        User result = null;
        try (Connection c = connect()) {

            Statement stmt = c.createStatement();
            stmt.execute("SELECT "
                    + "	u.*,"
                    + "	n.nationality as nationality,"
                    + "	c.name as birthplace"
                    + "	FROM user u"
                    + "	LEFT JOIN country n on u.nationality_id = n.id "
                    + "	LEFT JOIN country c on u.birthplace_id = c.id "
                    + " where u.id= " + userId);
            ResultSet rs = stmt.getResultSet();

            while (rs.next()) {
                result = getUser(rs);
                //c.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    public boolean updateUser2(User u) {
        try (Connection c = connect()) {
            Statement stmt = c.createStatement();
            return stmt.execute("UPDATE user SET `name`='TEST2' WHERE id = 1;");
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public boolean updateUser(User u) {
        try (Connection c = connect()) {
            //     PreparedStatement stmt = c.prepareStatement("update user set name = ? where id = ?");

            PreparedStatement stmt = c.prepareStatement("update user set name = ?, surname = ?, email = ?, phone = ?, profile_description = ? , birthdate = ?,bitrhplace_id=? where id = ?");
            stmt.setString(1, u.getName());
            stmt.setString(2, u.getSurname());
            stmt.setString(3, u.getEmail());
            stmt.setString(4, u.getPhone());
            stmt.setString(5, u.getProfileDesc());
            stmt.setDate(6, u.getBirthDate());
            stmt.setInt(7, u.getBirthPlace().getId());
            stmt.setInt(8, u.getId());
            return stmt.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean removeUser(int id) {
        try (Connection c = connect()) {
            Statement stmt = c.createStatement();
            return stmt.execute("delete from user WHERE id = " + id);
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
    private static BCrypt.Hasher crypt = BCrypt.withDefaults();

    public static void main(String[] args) {
//        User u = new User(0, "testPassword", "testPasswordov", "testPassword@gmail.com", "123456", "rgedfgdf", null, null, null);
//        u.setPassword("12345");
//        new UserDaoImpl().addUser(u);
    }

    @Override
    public boolean addUser(User u) {
        try (Connection c = connect()) {
            PreparedStatement stmt = c.prepareStatement("insert into user(name,surname,phone,email,password,profile_description) values (?,?,?,?,?,?)");
            stmt.setString(1, u.getName());
            stmt.setString(2, u.getSurname());
            stmt.setString(3, u.getPhone());
            stmt.setString(4, u.getEmail());
            stmt.setString(5, crypt.hashToString(4, u.getPassword().toCharArray()));
            stmt.setString(6, u.getProfileDesc());

            return stmt.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public User findByEmailAndPassword(String email, String password) {
        User result = null;
        try (Connection c = connect()) {
            PreparedStatement stmt = c.prepareCall("select * from user where email = ? and password=?");
            stmt.setString(1, email);
            stmt.setString(2, password);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                result = getUserSimple(rs);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public User findByEmail(String email) {
        User result = null;
        try (Connection c = connect()) {
            PreparedStatement stmt = c.prepareCall("select * from user where email = ?");
            stmt.setString(1, email);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                result = getUserSimple(rs);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
