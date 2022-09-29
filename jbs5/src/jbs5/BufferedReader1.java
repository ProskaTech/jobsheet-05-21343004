/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jbs5;

/**
 *
 * @Creater AzzahraPutri21343004
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class BufferedReader1 {
    public static void main(String[] argas) {
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        String a, b;
        float angka1, angka2, jumlah;
        System.out.println("Program Penjumlan dua buah bilangan");
        
        try{
            System.out.print("Masukan angka pertama :");
            a = dataIn.readLine();
            angka1 = Float.parseFloat(a);
            System.out.print("Masukan angka kedua8 :");
            b = dataIn.readLine();
            angka2 = Float.parseFloat(b);
            
            jumlah = angka1 + angka2;
            System.out.println("Jumlah : " + jumlah);
        }
       catch (IOException e){
           System.out.println("gagal membaca keyboard");

       }
    }
}
