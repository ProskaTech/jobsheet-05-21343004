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
import javax.swing.JOptionPane;
public class GetInputFromKeyboard2 {
    public static void main(String[] argas){
        String name ="", hoby ="";
        name = JOptionPane.showInputDialog("Nama Anda :");
        hoby = JOptionPane.showInputDialog("Hobi Anda :");
        
        String msg = "Jadi Hobi Anda "+hoby+". "
                  + "Hobi yang bagus "+name;
        
        JOptionPane.showMessageDialog(null, msg);
        System.out.println("Jadi Hobi Anda "+hoby+". Hobi yang bagus" +name);
    } 
    }
