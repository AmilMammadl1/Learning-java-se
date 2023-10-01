/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.dao.impl;

import com.company.entity.Skill;
import com.mycompany.dao.inter.AbstractDao;
import com.mycompany.dao.inter.SkillDaoInter;
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
public class SkillDaoImpl extends AbstractDao implements SkillDaoInter {

    private Skill getSkill(ResultSet rs) throws Exception {
        int userId = rs.getInt("id");
        String skillName = rs.getString("name");

        return new Skill(userId, skillName);
    }

    @Override
    public List<Skill> getAll() {
        List<Skill> result = new ArrayList<>();

        try (Connection c = connect()) {
            PreparedStatement stmt = c.prepareStatement("SELECT * from skill ");
            stmt.execute();
            ResultSet rs = stmt.getResultSet();

            while (rs.next()) {
                Skill u = getSkill(rs);
                result.add(u);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    public boolean insertSkill2(Skill s) {
        boolean b = true;
        try (Connection conn = connect()) {

            PreparedStatement stmt = conn.prepareStatement("insert skill user_skill(name) values(?);", Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, s.getName());
            b = stmt.execute();
            try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    s.setId(generatedKeys.getInt(1));
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            b = false;
        }
        return b;
    }

     @Override
    public boolean insertSkill(Skill s) {
        boolean b = true;
        try (Connection conn = connect()) {

            PreparedStatement stmt = conn.prepareStatement("insert into skill(skill_id,name) values(?,?);");
            stmt.setString(1, s.getName());

            b = stmt.execute();

        } catch (Exception ex) {
            ex.printStackTrace();
            b = false;
        }
        return b;
    }

}
