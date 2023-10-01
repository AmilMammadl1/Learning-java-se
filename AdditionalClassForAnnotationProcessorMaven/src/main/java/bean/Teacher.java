/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import lombok.Data;
import lombok.SneakyThrows;
import org.apache.commons.lang3.StringUtils;

@Data
public class Teacher {

    @WritingStyle
    private String teacherName;
    private double teacherSalary;
    private CharSequence sch;

    @SneakyThrows
    public void foo(int a) {
        if (StringUtils.isEmpty(sch)) {
        }
        if(StringUtils.isBlank("        ")){
            
        }
         {
            if (a > 9) {
                throw new Exception();
            }
        }
    }
}
