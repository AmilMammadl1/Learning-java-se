/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author amila
 */
@Getter
@Setter
public class Teacher {
    @WritingStyle
    private String teacherName;
    private double teacherSalary;
}
