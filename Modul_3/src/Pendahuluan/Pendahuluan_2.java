/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pendahuluan;

import javax.swing.JOptionPane;

/**
 *
 * @author qoheng
 */
public class Pendahuluan_2 {
    public static void main(String[] args) {
        String nama;
        String nim;
        int umur;
        double BeratBadan;
       
        nama = JOptionPane.showInputDialog("Masukkan nama anda");
        nim = JOptionPane.showInputDialog("Masukkan nim anda");
        umur = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Umur Anda"));
        BeratBadan = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Berat Badan Anda(kg)"));
        
        System.out.println("Nama = "+nama);
        System.out.println("NIM  = "+nim);
        System.out.println("Umur = "+umur);
        System.out.println("Berat Badan = "+BeratBadan+" kg");
    
    }

}
