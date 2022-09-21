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

public class GetInputFromKeyboard1 {
    public static void main(String[] argas) {
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        
        String name ="", hoby ="";
        
        try{
            System.out.print("Nama Anda :");
            name =dataIn.readLine();
            System.out.print("Hoby Anda :");
            hoby =dataIn.readLine();
                 
        }
        catch (IOException e){
            System.out.print("gagal membaca keyboard");
        }
        System.out.println("Jadi Hobi Anda "+hoby+". Hobi yang bagus"  +  name);
    }
}
