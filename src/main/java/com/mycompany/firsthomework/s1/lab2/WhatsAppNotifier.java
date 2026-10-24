/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firsthomework.s1.lab2;

import serviceinterface.Notifier;

/**
 *
 * @author asus
 */
public class WhatsAppNotifier implements Notifier{

    @Override
    public String send(String invoiceText, String number) {
        String body = "To:sendwhatsapp" + "\n"
            + "Subject: Invoice " + number + "\n\n"
            + invoiceText;
     System.out.println(invoiceText); 
   System.out.println("Sending whatsapp...");   
    return body;
    }
    
}
