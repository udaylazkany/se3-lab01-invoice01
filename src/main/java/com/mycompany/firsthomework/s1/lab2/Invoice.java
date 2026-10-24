/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firsthomework.s1.lab2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asus
 */
public class Invoice {
    private String number;
    private String customerEmail;
    private List<InvoiceItem> items;

    /*

 *
 * @author asus
 */

    public Invoice(String number, String customerEmail) {
        this.number = number;
        this.customerEmail = customerEmail;
        this.items=new ArrayList<>();
    }

    public void addItem(String name,double price,int qty)
    {
       items.add(new InvoiceItem(name, price, qty));
      
    }
    public String getNumber() {
        return number;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public List<InvoiceItem> getItems() {
        return new ArrayList<>(items) ;
    }
  


}
