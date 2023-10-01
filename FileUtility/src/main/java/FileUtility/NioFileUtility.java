/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FileUtility;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author amilm
 */
public class NioFileUtility {
    public static void writeBytes(byte[] data, String fileName) throws Exception{
        Path filePath = Paths.get(fileName);
        Files.write(filePath, data);
        
    }
    public static byte[] readBytes(String fileName) throws Exception{
        Path filePath = Paths.get(fileName);
        byte[]byteArray = Files.readAllBytes(filePath);
        return byteArray;
        
    }
    
}