/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firsthomework.s1.lab2;

/**
 *
 * @author asus
 */

public class InvoiceFormatter {
    
    private final InvoiceCalculator calculator;

    public InvoiceFormatter(InvoiceCalculator calculator) {
        this.calculator = calculator;
    }

    public String format(Invoice invoice) {
        StringBuilder sb = new StringBuilder();
        
        sb.append("INVOICE ").append(invoice.getNumber());
        
        for (InvoiceItem item : invoice.getItems()) {
            sb.append(" ").append(item.getName())
              .append(" x").append(item.getQty())
              .append(" = ").append(String.format("%.2f", item.getPrice() * item.getQty()));
        }
        
        sb.append(" TOTAL: ").append(String.format("%.2f", calculator.calculateTotal(invoice)));
        
        return sb.toString();
    }
}
