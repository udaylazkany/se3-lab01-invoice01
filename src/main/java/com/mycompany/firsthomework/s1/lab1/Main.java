/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firsthomework.s1.lab1;

import com.mycompany.firsthomework.badInvoice;
import static com.mycompany.firsthomework.s1.lab2.FileStorage.getFILES;

/**
 *
 * @author asus
 */
public class Main {
    public static void main(String[] args) {
               badInvoice inv=new badInvoice("INV-1", "lina@uni.edu");
          inv.addItem("Book", 100, 2);
           System.out.println("--- Invoice 1 ---");
            System.out.println(inv.printInvoice());
          System.out.println(inv.saveToDatabase("DATABASE"));
               System.out.println(inv.sendEmail());
      
     
         
           System.out.println("--- Invoice 2 ---");
            badInvoice inv0=new badInvoice("INV-2", "uday@uni.edu");
            inv0.addItem("pines", 100, 2);
            System.out.println(inv0.printInvoice());  
            System.out.println(inv0.saveToDatabase("FILES"));
                    System.out.print(inv0.sendWhatsapp());
              
                    
                    System.out.println("/////////////////");
                 System.out.println(getFILES());
                 System.out.println("********************");
            
      
    }
}
