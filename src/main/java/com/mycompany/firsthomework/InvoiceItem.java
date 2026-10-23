/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firsthomework;

/**
 *
 * @author asus
 */
class InvoiceItem {
    private String name;
    private double price;
    private int qty;
 

    @Override
    public String toString() {
        return "InvoiceItem{" + "name=" + name + ", price=" + price + ", qty=" + qty + '}';
    }
  public InvoiceItem(String name,double price,int qty)
    {
        this.name=name;
        this.price=price;
        this.qty=qty;
      
        
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public String getName() {
        return name;
    }
  
}
