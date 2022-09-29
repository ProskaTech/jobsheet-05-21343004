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

import java.util.Scanner;
public class Scanner1 {  
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.print("Masukan nama lengkap: ");
        String nama = in.nextLine();
        
        System.out.print("Masukan NIM: ");
        int NIM = in.nextInt();
        System.out.print("Masukan Nilai: ");
        float nilai =in.nextFloat();
        
        System.out.print("\nNama : " + nama +
                         "\nNIM  : " + NIM +
                         "\nNilai : " + nilai);
        
    }
    
}
