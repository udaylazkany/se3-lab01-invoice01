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
public class FileStorage implements Storage{
private static final List<String> FILES=new ArrayList<>();
    @Override
    public void save(String invoiceText) {
    FILES.add(invoiceText);
        System.out.println("Saving to FILES...");
    }

    public static List<String> getFILES() {
        return new ArrayList<>(FILES) ;
    }
    
    
}
