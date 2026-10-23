/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.firsthomework;

import static com.mycompany.firsthomework.badInvoice.getDATABASE;
import static com.mycompany.firsthomework.badInvoice.getFILES;

/**
 *
 * @author asus
 */
public class FirstHomework {

    public static void main(String[] args) {
        badInvoice inv1=new badInvoice("INV-1", "lina@uni.edu");
          inv1.addItem("Book", 100, 2);
           System.out.println("--- Invoice 1 ---");
            System.out.println(inv1.printInvoice());
          System.out.println(inv1.saveToDatabase("DATABASE"));
               System.out.println(inv1.sendEmail());
      
     
         
           System.out.println("--- Invoice 2 ---");
            badInvoice inv2=new badInvoice("INV-2", "uday@uni.edu");
            inv2.addItem("pines", 100, 2);
            System.out.println(inv2.printInvoice());  
            System.out.println(inv2.saveToDatabase("FILES"));
                    System.out.println(inv1.sendWhatsapp());
                System.out.println("/////////////////");
                 System.out.println(getFILES());
                 System.out.println("********************");
            
      
        
    }
}
