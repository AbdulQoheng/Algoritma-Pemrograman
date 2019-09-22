/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pendahuluan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author qoheng
 */
public class Pendahuluan_4 {
    public static void main(String[] args) throws IOException {
        String a;
        String b;
        int Penjumlahan;
        
        System.out.println("=========Menggunakan BufferredReader==========");
        
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
       
        System.out.println("");
        System.out.print("Masukkan data Pertama :");
        a = dataIn.readLine();
        System.out.print("Masukkan data Kedua :");
        b = dataIn.readLine();
        Penjumlahan = Integer.valueOf(a) + Integer.valueOf(b);
        System.out.println("Hasil dari "+a+" + "+b+" = "+Penjumlahan);
        
        
        System.out.println("==========Menggunakan JOptionPane==========");
        
        a = JOptionPane.showInputDialog("Masukkan nilai yang pertama");
        b = JOptionPane.showInputDialog("Masukkan nilai kedua");
        JOptionPane.showMessageDialog(null, "Hasil dari "+a+" + "+b+" = "+Penjumlahan);
    }
    
}
