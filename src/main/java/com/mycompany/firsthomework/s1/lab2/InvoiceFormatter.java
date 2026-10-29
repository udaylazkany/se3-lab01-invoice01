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
        
        sb.append("INVOICE ").append(invoice.getNumber()).append("\n");
        
        for (InvoiceItem item : invoice.getItems()) {
            sb.append(item.getName())
              .append(" x ").append(item.getQty())
              .append(" = ").append(String.format("%.1f", item.getPrice() * item.getQty()))
              .append("\n");
        }
        
      
        sb.append("TOTAL : ").append(String.format("%.1f", calculator.calculateTotal(invoice)));
        
        return sb.toString();
    }
}