/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firsthomework;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asus
 */
public class badInvoice {
    private String number;
    private String customerEmail;
    private List<InvoiceItem> items;
    private static List<String> DATABASE = new ArrayList<>();
    private static List<String> FILES=new ArrayList<>();

    public static List<String> getDATABASE() {
       return new ArrayList<>(DATABASE); 
    }

    public static List<String> getFILES() {
        return new ArrayList<>(FILES); 
    }
    
    
    public void addItem(String name,double price,int qty)

    {
        InvoiceItem item=new InvoiceItem(name,price,qty);
        items.add(item);
    }
  
    public badInvoice(String number,String customerEmail)
    {this.number=number;
    this.customerEmail=customerEmail;
    items=new ArrayList<>();
    }
    public double calculateTotal()
    {
        double total=0;
        for(InvoiceItem item:items)
        {
            total+=item.getPrice()*item.getQty();
        }
        if(total>1000)
            total-=total*0.05;
            
        total+=total*0.15;
        
        return total;
    }
    public String printInvoice()
    {
        String invoiceText = " INVOICE " + number + "\n";
        
        for(InvoiceItem item:items)
        {
           double itemTotal=item.getPrice()*item.getQty();
           invoiceText+=item.getName()+" x "+ item.getQty()+" = "+itemTotal+"\n";
           
        } 
        invoiceText+=  "TOTAL : "+calculateTotal();
        
            return invoiceText;
           
    }
    public String saveToDatabase(String type)
    {
        String Text=printInvoice();
        if("DATABASE".equals(type))
        {
             DATABASE.add(Text);
             System.out.println("Saving to DATABASE...");
             return "Saved to DataBase";
        }
        else if("FILES".equals(type))
        {
              FILES.add(Text);
              System.out.println("Saving to FILES...");
             return "Saved to File";
        }
        else
        {
            return "Unknown type: " + type;
        }
        
        
    }
public String sendEmail() {
    String invoiceText = printInvoice();
    String body = "To: lina@uni.edu" + "\n"
                + "Subject: Invoice " + number + "\n\n"
                + invoiceText;
    System.out.println(invoiceText);
    System.out.println("Sending email...");
    return body;
}
public String sendWhatsapp() {
    String invoiceText = printInvoice();
    String body = "To:sendwhatsapp " + "\n"
                + "Subject: Invoice " +number + "\n\n"
                + invoiceText;
    System.out.println(invoiceText);
    System.out.println("Sending whatsapp...");
    return body;
}
    
    /*

 *
 * @author asus
 */


}
