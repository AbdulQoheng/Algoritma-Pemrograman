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
        int data[]=new int[10];
        for (int i = 0; i < data.length; i++) {
            data[i] =Integer.parseInt(JOptionPane.showInputDialog("Masukkan Element Index ke "+i));
            System.out.println("Index ke "+i+" adalah "+data[i]);
        }
        System.out.println("");
        System.out.println("========== Mencari Nilai Maksimal dan Minimal ==========");
        System.out.println("");
        for (int i = 0; i < data.length; i++) {
            if (data[i]%2 == 1) {
                System.out.println("Nilai : "+data[i]+" Indek ke ; "+i+" Merupakan bilangan Ganjil");
            }else{
                System.out.println("Nilai : "+data[i]+" Indek ke ; "+i+" Merupakan bilangan Genap");
            }
            
        }
        
        System.out.println("");
        System.out.println("========== Mencari Rata-Rata ==========");
        System.out.println("");
        int angka = 0;
        int ratarata = 0;
        for (int i = 0; i < data.length; i++) {
            angka += data[i];
        }
        ratarata = angka/data.length;
        System.out.println("Nilai rata - rata adalah : "+ ratarata);
    
        System.out.println("");
        System.out.println("========== Pencarian index ==========");
        System.out.println("");
        int cari = Integer.parseInt(JOptionPane.showInputDialog("Masukkan index yang di cari :"));
        
        if (cari < 0 && cari > data.length) {
            System.out.println("Maaf Index yang anda cari tidakada !!!");
        }else{
            int rubah = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai pengganti : "));
            data[cari]=rubah;
            System.out.println("Nilai yang sudah di ganti : ");
            for (int i = 0; i < data.length; i++) {
                if(i != cari){
                    System.out.println(data[i]);
                }else{
                    System.out.println(data[i]+" <== data yang telah di rubah");
                }
            }
            
            
        }
        
    
    }
    
}
