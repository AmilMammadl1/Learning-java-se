/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.dao.impl;

import com.company.entity.Skill;
import com.company.entity.User;
import com.company.entity.UserSkill;
import com.mycompany.dao.inter.AbstractDao;
import com.mycompany.dao.inter.UserSkillDaoInter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author amila
 */
public class UserSkillDaoImpl extends AbstractDao implements UserSkillDaoInter {

    private UserSkill getUserSkill(ResultSet rs) throws Exception {
        int userSkillId = rs.getInt("UserSkillId");
        int userId = rs.getInt("id");
        int skillId = rs.getInt("skill_id");
        int power = rs.getInt("power");
        String skillName = rs.getString("skill_name");

        return new UserSkill(userSkillId, new User(userId), new Skill(skillId, skillName), power);
    }

    @Override
    public List<UserSkill> getAllSkillByUserId(int userId) {
        List<UserSkill> result = new ArrayList<>();

        try (Connection c = connect()) {
            PreparedStatement stmt = c.prepareStatement("SELECT "
                    + " us.id as UserSkillId "
                    + "	u.*,"
                    + "	us.skill_id,"
                    + "	s.`name` AS skill_name,"
                    + "	us.power "
                    + "FROM"
                    + "	user_skill AS us "
                    + "	LEFT JOIN USER u ON us.user_id = u.id "
                    + "	LEFT JOIN skill s ON us.user_id = s.id "
                    + " WHERE "
                    + "	us.user_id = ? ");
            stmt.setInt(1, userId);
            stmt.execute();
            ResultSet rs = stmt.getResultSet();

            while (rs.next()) {
                UserSkill u = getUserSkill(rs);
                result.add(u);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    @Override
    public boolean removeUser(int id) {
        try (Connection conn = connect()) {
            PreparedStatement stmt = conn.prepareStatement("delete from user_skill WHERE id = ?");
            stmt.setInt(1, id);
            return stmt.execute();

        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean insertUserSkill(UserSkill u) {
        boolean b = true;
        try (Connection conn = connect()) {

            PreparedStatement stmt = conn.prepareStatement("insert into user_skill(skill_id,user_id,power) values(?,?,?);");
            stmt.setInt(1, u.getSkill().getId());
            stmt.setInt(2, u.getUser().getId());
            stmt.setInt(3, u.getPower());

            b = stmt.execute();

        } catch (Exception ex) {
            ex.printStackTrace();
            b = false;
        }
        return b;
    }

    @Override
    public boolean UpdateUserSkill(UserSkill u) {
         boolean b = true;
        try (Connection conn = connect()) {

            PreparedStatement stmt = conn.prepareStatement("update user_skill set skill_id = ?,user_id = ?,,power =? where id = ?;");
            stmt.setInt(1, u.getSkill().getId());
            stmt.setInt(2, u.getUser().getId());
            stmt.setInt(3, u.getPower());

            b = stmt.execute();

        } catch (Exception ex) {
            ex.printStackTrace();
            b = false;
        }
        return b;
    }
}
