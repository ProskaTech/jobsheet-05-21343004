/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jbs5;

/**
 *
 * @Creater Azzahra21343004
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class KataTerakhirBufferedReader {
     public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader (System.in));
        String word1 = "", word2 = "", word3 = "";
        try {
            System.out.print("Enter word 1: ");
            word1 = dataIn.readLine();
            System.out.print("Enter word 2: ");
            word2 = dataIn.readLine();
            System.out.print("Enter word 3: ");
            word3 = dataIn.readLine();
        }
    
    catch (IOException e ){
        System.out.println("Gagal membaca keyboard");
        }
    
        System.out.println(word1 + " " + word2 + " " + word3);
    }

    
}
