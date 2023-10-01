/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enums;

/**
 *
 * @author amila
 */
public class Main {
    public static void main(String[] args) {
        Enums top = Enums.topla;
//        double net = top.hesabla(1, 2);
//        System.out.println(net);
//        
//        System.out.println(top.getOperationSymbol());

        System.out.println(top.getClass().getName());
        System.out.println(top.getClass().getSuperclass().getName());
    }
    public static void hesabla(Enums emeliyyat){
        if(emeliyyat == Enums.topla){
            
        }
        else if(emeliyyat == Enums.chix){
            
        }
    }
}
