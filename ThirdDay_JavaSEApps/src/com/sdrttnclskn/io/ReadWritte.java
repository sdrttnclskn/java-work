package com.sdrttnclskn.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
public class ReadWritte {
    
    public static void main(String[] args) {
        BufferedInputStream bfstream = null ;
        try {
            long result1 = System.currentTimeMillis();
            FileInputStream finput = new FileInputStream("C:/Users/kgb20/Desktop/big.txt");
            bfstream = new BufferedInputStream(finput);
            int result = bfstream.read();
            while(result != -1) {
                result = bfstream.read();
            }
            long result2 = System.currentTimeMillis();
            
            System.out.println("Okuma SÜresi : " + ((result2-result1)/100) + " ms.");
            finput.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
        
        
    }
}