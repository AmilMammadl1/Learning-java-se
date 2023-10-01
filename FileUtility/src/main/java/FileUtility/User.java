/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FileUtility;

import java.io.Serializable;

/**
 *
 * @author amilm
 */
public class User implements Serializable {

    public String name;
    public transient String password;
    private static final long serialVersionId = 1L;

}