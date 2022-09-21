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
public class Scanner2 {
    public static void main (String args[]) {
        float angka1, angka2, jumlah;
        Scanner dataMasuk = new Scanner (System.in);
        
        System.out.print("MAsukan Angka ke-1:");
        angka1 = dataMasuk.nextFloat();
        System.out.print("MAsukan Angka ke-2:");
        angka2 = dataMasuk.nextFloat();
        
        jumlah = angka1 + angka2;
        System.out.println("Angka ke-1: " + angka1);
        System.out.println("Angka ke-2: " + angka2);
        System.out.println("Jumlah : " + jumlah);        
        
    
   
    }
}
