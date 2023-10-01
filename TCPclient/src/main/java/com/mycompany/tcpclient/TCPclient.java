/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.tcpclient;

//import java.io.DataOutputStream;
import FileUtility.FileUtility;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author amilm
 */
public class TCPclient {

    public static void main(String[] args) throws Exception {
    
        Socket socket = new Socket( "192.168.0.107", 9);
        OutputStream outputstream = socket.getOutputStream();
        DataOutputStream dataoutputstream = new DataOutputStream(outputstream);
//        dataoutputstream.write("salam necesen".getBytes());
        byte[] bytes = FileUtility.readAsBytes("C:\\Users\\amila\\Pictures\\aa.jpg");
        dataoutputstream.writeInt(bytes.length);
        dataoutputstream.write(bytes);
        socket.close();

    }
}