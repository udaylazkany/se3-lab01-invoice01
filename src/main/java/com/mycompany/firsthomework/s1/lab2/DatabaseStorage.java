/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firsthomework.s1.lab2;

import serviceinterface.Storage;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asus
 */
public class DatabaseStorage implements Storage{
    private  static final List<String> DAtABASE =new ArrayList<>();
  

    @Override
    public void save(String invoiceText) {
    DAtABASE.add(invoiceText);
        System.out.println("Saving to DATABASE...");
    }
    public static List<String> getDatabase()
    {
        return new ArrayList<>(DAtABASE);
    }
}
