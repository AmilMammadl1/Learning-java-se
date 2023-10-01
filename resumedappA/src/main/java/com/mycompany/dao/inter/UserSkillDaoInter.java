/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.dao.inter;

import com.company.entity.UserSkill;
import java.util.List;

/**
 *
 * @author amila
 */
public interface UserSkillDaoInter {

    public List<UserSkill> getAllSkillByUserId(int userId);

    public boolean removeUser(int id);

    public boolean insertUserSkill(UserSkill u);

    public boolean UpdateUserSkill(UserSkill u);

}
