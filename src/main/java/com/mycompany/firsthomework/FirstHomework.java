/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.firsthomework;

import com.mycompany.firsthomework.s1.lab2.DatabaseStorage;
import com.mycompany.firsthomework.s1.lab2.EmailNotifier;
import com.mycompany.firsthomework.s1.lab2.FileStorage;
import static com.mycompany.firsthomework.s1.lab2.FileStorage.getFILES;
import com.mycompany.firsthomework.s1.lab2.Invoice;
import com.mycompany.firsthomework.s1.lab2.InvoiceCalculator;
import com.mycompany.firsthomework.s1.lab2.InvoiceFormatter;
import serviceinterface.InvoiceService;
import serviceinterface.Notifier;
import serviceinterface.Storage;
import com.mycompany.firsthomework.s1.lab2.WhatsAppNotifier;
import java.util.List;


/**
 *
 * @author asus
 */
public class FirstHomework {
  
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
            
      
       
        InvoiceCalculator calculator = new InvoiceCalculator();
        InvoiceFormatter formatter = new InvoiceFormatter(calculator);
        
        Storage dbStorage = new DatabaseStorage();
        Storage fileStorage = new FileStorage();
        
        Notifier emailNotifier = new EmailNotifier();
        Notifier whatsappNotifier = new WhatsAppNotifier();

        
        InvoiceService service = new InvoiceService(
            formatter, 
            dbStorage, 
            fileStorage, 
            emailNotifier, 
            whatsappNotifier
        );

    
        Invoice inv1 = new Invoice("INV-1", "lina@uni.edu");
        inv1.addItem("Book", 100, 2);
        
        System.out.println("--- Invoice 1 ---");
        System.out.println(service.format(inv1));
        service.saveToDatabase(inv1);
        
        
     
        System.out.println("--- DATABASE Content ---");
        List<String> dbContent = DatabaseStorage.getDatabase();
        for (String s : dbContent) {
            System.out.println(s);
        }
        System.out.println("--- FILES Content ---");
        List<String> fileContent = FileStorage.getFILES();
        for (String s : fileContent) {
            System.out.println(s);
        }

        System.out.println(service.sendEmail(inv1));
        System.out.println(service.sendWhatsapp(inv1));

       
        Invoice inv2 = new Invoice("INV-2", "lina@uni.edu");
        inv2.addItem("Laptop", 1200, 1);
        
        System.out.println("--- Invoice 2 ---");
        System.out.println(service.format(inv2));
       
        service.saveToFiles(inv2);
        System.out.println(service.sendEmail(inv2));
        System.out.println(service.sendWhatsapp(inv2));

    
        Invoice inv3 = new Invoice("INV-3", "lina@uni.edu");
        inv3.addItem("Item", 500, 2);
        
        System.out.println("--- Invoice 3 ---");
        System.out.println(service.format(inv3));
       
        service.saveToFiles(inv3);
        System.out.println(service.sendEmail(inv3));
        System.out.println(service.sendWhatsapp(inv3));

    
        double grandTotal = calculator.calculateTotal(inv1) 
                          + calculator.calculateTotal(inv2) 
                          + calculator.calculateTotal(inv3);
        System.out.println("GRAND TOTAL: " + String.format("%.2f", grandTotal));
    }
}


