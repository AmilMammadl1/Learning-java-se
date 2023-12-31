/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.dao.impl;

import com.company.entity.EmploymentHistory;
import com.company.entity.Skill;
import com.company.entity.User;
import com.company.entity.UserSkill;
import com.company.dao.inter.AbstractDao;
import com.company.dao.inter.EmploymentHistoryDaoInter;
import com.company.dao.inter.UserSkillDaoInter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author amila
 */
public class EmploymentHistoryDaoImpl extends AbstractDao implements EmploymentHistoryDaoInter {

    private EmploymentHistory getEmploymentHistory(ResultSet rs) throws Exception {
        String header = rs.getString("header");
        String jobDescription = rs.getString("job_description");
        Date beginDate = rs.getDate("begin_date");
        Date endDate = rs.getDate("end_date");
        int userId = rs.getInt("user_id");
        return new EmploymentHistory(null, header, beginDate, endDate, jobDescription, new User(userId));

    }

    @Override
    public List<EmploymentHistory> getAllEmploymentHistoryByUserId(int userId) {
        List<EmploymentHistory> result = new ArrayList<>();

        try (Connection c = connect()) {
            PreparedStatement stmt = c.prepareStatement("SELECT * from employment_history where user_id = ?");
            stmt.setInt(1, userId);
            stmt.execute();
            ResultSet rs = stmt.getResultSet();

            while (rs.next()) {
                EmploymentHistory u = getEmploymentHistory(rs);
                result.add(u);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }
}
