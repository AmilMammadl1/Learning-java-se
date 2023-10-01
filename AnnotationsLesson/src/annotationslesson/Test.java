/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package annotationslesson;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 *
 * @author amila
 */
public class Test {

    public static void main(String[] args) throws Exception {
        Elave e = new Elave();
//        Student[] ss = {};
//        e.foo4(ss);
//        method(e);

    }

    private static void method(Object obj) throws Exception {
        Method[] method = obj.getClass().getDeclaredMethods();
        for (int i = 0; i < method.length; i++) {
            Method m = method[i];
            System.out.println(method[i].getName());
            
            
            Annotation[] anns = m.getAnnotations();
            for (int j = 0; j < anns.length; j++) {
                Annotation ann = anns[j];
                if (ann.annotationType() == BoshOlmasin.class) {
                    Object result = m.invoke(obj);
                    if (result == null) {
                        throw new IllegalArgumentException("bosh olmasin");
                    }
                    if (result instanceof Object[]) {
                        Object[] arr = (Object[]) result;
                        if (arr.length == 0) {
                            throw new IllegalArgumentException("bosh olmasin arr");

                        }
                    }
                }
                System.out.println(ann.annotationType());
            }
            System.out.println("==================================");
        }
    }
}
