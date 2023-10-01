/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package outer;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author amila
 */
@Component
@Scope("prototype")
public class MyCompanent2 {

    public MyCompanent2() {
        System.out.println("Compenent2 is created");
    }

}
