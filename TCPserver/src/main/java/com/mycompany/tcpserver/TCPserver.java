/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.tcpserver;

import FileUtility.FileUtility;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import lombok.SneakyThrows;

/**
 *
 * @author amilm
 */
public class TCPserver {

    public static void main(String[] args) throws Exception {
        readAsByte();
    }

    @SneakyThrows
    public static void readAsByte() {
        ServerSocket OurFirstSocketServer = new ServerSocket(9);
        while (true) {
            System.out.println("yeni musteri ucun gozleyirem");
            Socket connection = OurFirstSocketServer.accept();
            System.out.println("Mushteri qosuldu");

            DataInputStream dataStream = new DataInputStream(connection.getInputStream());

            byte[] arr = readMessage(dataStream);
            System.out.println("message length2 " + arr.length);
            FileUtility.writeAsByte("C:\\Users\\amila\\Desktop\\a.jpg", arr);
        }
    }

    @SneakyThrows
    public static byte[] readMessage(DataInputStream din) {
        int msglen = din.readInt();
        System.out.println("message length1 " + msglen);
        byte[] msg = new byte[msglen];
        din.readFully(msg);
        return msg;
    }

    @SneakyThrows
    public static void readAsString() {
        ServerSocket OurFirstSocketServer = new ServerSocket(1);
        while (true) {
            System.out.println("yeni musteri ucun gozleyirem");
            Socket connection = OurFirstSocketServer.accept();
            System.out.println("Mushteri qosuldu");
            InputStream is = connection.getInputStream();
            InputStreamReader reader = new InputStreamReader(is);
            BufferedReader bReader = new BufferedReader(reader);
            String getMessageFromClient = bReader.readLine();
            System.out.println("message from client:" + getMessageFromClient);
            //bReader.close();
        }
    }

}
