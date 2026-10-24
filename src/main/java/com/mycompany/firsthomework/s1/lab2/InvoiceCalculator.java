/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firsthomework.s1.lab2;

/**
 *
 * @author asus
 */
public class InvoiceCalculator {
    public double calculateTotal(Invoice invoice)
    {double total=0;
        for(InvoiceItem item:invoice.getItems())
        {
            total+=item.getPrice()*item.getQty();
        }
        if(total>1000)
            total-=total*0.05;
        total+=total*0.15;
       return total;
    }

  
    
}
