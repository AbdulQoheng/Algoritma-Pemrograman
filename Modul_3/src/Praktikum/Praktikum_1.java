/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author qoheng
 */
public class Praktikum_1 {
    public static void main(String[] args) throws IOException {
        String a;
        String b;
        String c;
        
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Masukkan data Pertama :");
        a = dataIn.readLine();
        System.out.print("Masukkan data Kedua :");
        b = dataIn.readLine();
        System.out.print("Masukkan data ketiga :");
        c = dataIn.readLine();
        System.out.println("Data yang di masukkan adalah = "+a+", "+b+", "+c);
        
        
    }
    
}
