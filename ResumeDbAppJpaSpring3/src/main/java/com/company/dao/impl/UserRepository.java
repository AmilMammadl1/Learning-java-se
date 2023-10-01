/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.company.dao.impl;

import com.company.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author amila
 */
public interface UserRepository extends JpaRepository<User, Integer>, UserRepositoryCustom {

    User findByname(String name);

    User findByNameAndSurname(String name, String surname);

    @Query(value = "select u from User u where email =:email ", nativeQuery = false)
    User findByEmail(@Param("email") String email);
}
