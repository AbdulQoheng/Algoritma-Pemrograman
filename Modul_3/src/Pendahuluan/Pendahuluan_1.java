/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pendahuluan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author qoheng
 */
public class Pendahuluan_1 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String nama;
        String nim;
        
        System.out.println("==========Menggunakan BufferedReader==========");
        System.out.println("");
        
        try {
            System.out.print("Masukkan nama = " );
            nama = dataIn.readLine();
            
            System.out.print("Masukkan nim = " );
            nim = dataIn.readLine();
            
            System.out.println("Nama = "+ nama);
            System.out.println("NIM  = "+ nim);
            
        } catch (Exception e) {
            System.out.println("Error!!");
        }
    }
    
}
