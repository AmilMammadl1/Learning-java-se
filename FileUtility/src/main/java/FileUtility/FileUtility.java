/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package FileUtility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

/**
 *
 * @author amila
 */
public class FileUtility{

    public static void main(String[] args) throws Exception {
//      writeAsString("salam", "test2.txt", true);
//        String str = readAsString("test2.txt");
//        byte[] b = readAsBytes("test2.txt");
//        for(int i = 0; i< b.length;i++){
//            System.out.println(b[i] + "=" + (char)b[i]);
//        }
//        System.out.println(new String(b));
//        byte[] b = readAsBytes("test.png");
//        writeAsByte("test2.png", b);
//        
//        User u = new User();
//        u.name = "amil";
//        u.password = "123";
//        
//        writeObjectToFile(u, "amil99999");

        User u = (User) readFileDeserializable("amil99999");
        System.out.println(u.name);
    }

    public static void writeAsString(String text, String fileName, boolean append) throws Exception {
        try (
                 FileWriter fw = new FileWriter(fileName, append);  BufferedWriter bf = new BufferedWriter(fw);) {
            bf.write(text);
        }
    }

    public static void writeAsByte(String fileName, byte[] data) throws Exception {
        File file = new File(fileName);
        FileOutputStream fop = new FileOutputStream(file);
        //  byte[] contentInByte = content.getBytes();
        // fop.write(contentInByte);
        fop.write(data);
        fop.flush();
        fop.close();
        System.out.println("Done");
    }

    public static String readAsString(String fileName) throws Exception {
        try ( InputStream in = new FileInputStream(fileName);  InputStreamReader r = new InputStreamReader(in);  BufferedReader reader = new BufferedReader(r);) {
            String line = null;
            String result = "";
            while ((line = reader.readLine()) != null) {
                result += line + "\n";
            }
            return result;

        }
    }

    public static byte[] readAsBytes(String fileName) throws Exception {
        File file = new File(fileName);
        try ( FileInputStream fileInputStream = new FileInputStream(file);) {
            byte[] bytesArray = new byte[(int) file.length()];
            fileInputStream.read(bytesArray);
            return bytesArray;
        }
    }

    public static void writeObjectToFile(Serializable object, String name) throws Exception {
        try ( FileOutputStream fop = new FileOutputStream(name);  ObjectOutputStream oos = new ObjectOutputStream(fop);) {
            oos.writeObject(object);
        }
    }

    public static Object readFileDeserializable(String name) throws Exception {
        Object obj = null;
        try ( FileInputStream fis = new FileInputStream(name);  ObjectInputStream ois = new ObjectInputStream(fis);) {
            obj = ois.readObject();
        } finally {
            return obj;
        }
    }

    private static void method(String fromFile, String toFile) throws Exception {
        URL website = new URL(fromFile);
        ReadableByteChannel bb = Channels.newChannel(website.openStream());

        FileOutputStream fos = new FileOutputStream(toFile);
        fos.getChannel().transferFrom(bb, 0, 0);
        fos.close();
        bb.close();

    }
}
