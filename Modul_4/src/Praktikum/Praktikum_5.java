/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

import javax.swing.JOptionPane;

/**
 *
 * @author qoheng
 */
public class Praktikum_5 {
    public static void main(String[] args) {
        String angka = JOptionPane.showInputDialog("Masukkan angka yang anda inginkan : ");
        int n = Integer.parseInt(angka);
        
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println("");
            
        }
        
        System.out.println();
        System.out.println("========== Segitiga Pertama ==========");
        angka = JOptionPane.showInputDialog("masukkan angka yang anda inginkan :");
        n = Integer.parseInt(angka);
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
                
            }
            System.out.print("\t\t");
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println("");
            
        }
        
        System.out.println();
        System.out.println("========== Segitiga Kedua ==========");
        angka = JOptionPane.showInputDialog("masukkan angka yang anda inginkan :");
        n = Integer.parseInt(angka);
        for (int i = 0; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
                
            }
            System.out.print("\t\t");
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println("");
            
        }
    }
    
}
