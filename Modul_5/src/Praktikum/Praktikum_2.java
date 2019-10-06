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
public class Praktikum_2 {

    public static void main(String[] args) {
        int data[] = new int[5];
        for (int i = 0; i < data.length; i++) {
            data[i] = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Element Index ke " + i));
            System.out.println("Index ke " + i + " adalah " + data[i]);
        }
        System.out.println("");
        System.out.println("========== Mencari Nilai Maksimal dan Minimal ==========");
        System.out.println("");
        int Max = data[0];
        int Min = data[0];
        int indexMax = 0;
        int indexMin = 0;

        System.out.println("========== Mencari Rata-Rata ==========");
        System.out.println("");
        int angka = 0;
        double ratarata = 0;
        for (int i = 0; i < data.length; i++) {
            angka += data[i];
        }
        ratarata = (double)angka / data.length;
        System.out.println("Nilai rata - rata adalah : " + ratarata);

        System.out.println("");
        System.out.println("========== Pencarian index ==========");
        System.out.println("");
        int cari = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai yang akan di cari :"));
        int nilai = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai pengganti : "));
        for (int i = 0; i < data.length; i++) {
            if (cari == data[i]) {                
                data[i] = nilai;
                System.out.println("index ke ["+i+"] di ganti dengan nilai "+nilai);
            }
        }
        System.out.println();
        System.out.println("Data yang telah di rubah :");
        for (int i = 0; i < data.length; i++) {
            System.out.println("["+i+"]"+" ==> "+data[i]);
        }


    }

}
