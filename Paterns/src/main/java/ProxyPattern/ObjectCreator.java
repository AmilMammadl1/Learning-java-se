/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProxyPattern;

/**
 *
 * @author amila
 */
public class ObjectCreator {
    public static Image objectCreator(Class clazz){
        if(clazz == RealImage.class){
            return new ProxyImage();
        }
        return null;
    }
}
