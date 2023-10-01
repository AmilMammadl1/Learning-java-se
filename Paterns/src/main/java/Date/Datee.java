/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author amila
 */
public class Datee {

    public static void main(String[] args) throws Exception {
        //  Date d = new Date();
        // System.out.println(d);
//       Long millisecond =  d.getTime();
//        System.out.println(millisecond);

//        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS");
//        String s = sdf.format(d);
//        System.out.println(s);
//        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
//        String ss = "11-07-2003";
//        Date dd = sdf.parse(ss);
//        System.out.println(dd);
        Scanner sc = new Scanner(System.in);
        System.out.println("type your birthday");
        String DateStr = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        //System.out.println(sdf.parse(DateStr));
        Date dClient = sdf.parse(DateStr);
        Date dMe = sdf.parse("11-07-2003");

        long client = dClient.getTime();
        long me = dMe.getTime();
        long difference = client - me;
        if (client > me) {
            long ferq = client - me;
            System.out.println(ferq);
            Date diffD = new Date(ferq);
            System.out.println(diffD);
            System.out.println(ferq / (24 * 60 * 60 * 1000));
        } else if (me > client) {
            long ferq2 = me - client;
            System.out.println(ferq2);
            Date diffD = new Date(ferq2);
            System.out.println(diffD);

        } else {
            long ferq3 = 0;
            System.out.println(ferq3);
            Date diffD = new Date(ferq3);
            System.out.println(diffD);

        }
    }
}
