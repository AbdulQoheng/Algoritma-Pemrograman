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
        
        nama = JOptionPane.showInputDialog("Masukkan nama anda");
        nim = JOptionPane.showInputDialog("Masukkan nim anda");
        
        System.out.println("Nama = "+nama);
        System.out.println("NIM  = "+nim);
    }
    
}
