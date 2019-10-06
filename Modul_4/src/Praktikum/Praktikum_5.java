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
            for (int j = 0; j <= n; j++) {
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

        System.out.println();
        System.out.println("========== Segitiga sama kaki ==========");
        angka = JOptionPane.showInputDialog("Masukkan angka yang di inginkan : ");
        n = Integer.parseInt(angka);

        for (int i = 0; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        System.out.println();
        System.out.println("========== Segitiga Lubang ==========");
        int a, b = 0, c, d, e;

        n = Integer.parseInt(
                JOptionPane.showInputDialog("Masukkan Tinggi Segitiga = "));

        a = n;
        e = n - 1;

        for (c = 1; c <= n; c++) {
            b = 1;
            for (d = 1; d <= a; d++) {
                if (b <= e) {
                    System.out.print(" ");
                    b++;
                } else {
                    if (d == b || d == a || e == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            e--;
            a++;
            System.out.print("\n");
        }
        
        System.out.println("");
        System.out.println("========== Jajar Genjang ==========");
        for (int i = 1; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            
            }
            for (int j = 0; j < 5 ; j++) {
                System.out.print("*");
                
            }
            System.out.println();
            
            
        }
    }

}
