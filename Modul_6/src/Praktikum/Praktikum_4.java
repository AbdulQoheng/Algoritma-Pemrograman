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
public class Praktikum_4 {
    public static void main(String[] args) {
        int matrix[][] = {{2,9,5,17},{1,5,10,4}};
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (j==1) {
                    System.out.print(matrix[i][j]+"\t");
                }else{
                    System.out.print(matrix[i][j]+" ");
                }
               
            }
            System.out.println();
        }
        
        System.out.println("========== Cari Index ==========");
        int cari = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai yang akan di cari"));
        int baris = 0,kolom = 0;
        int Hasil[][] = new int[2][2];
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == cari) {
                    baris = i;
                    kolom = j;
                }
            }
        }
        System.out.println("Nilai : "+cari+" Berada di Baris "+baris+" dan di kolom "+kolom);
    
        System.out.println("========== Penjumlahan Matrix ==========");
        
        for (int i = 0; i < Hasil.length; i++) {
            for (int j = 0; j < Hasil[i].length; j++) {
                Hasil[i][j] = matrix[i][j]+matrix[i][j+2];
            }
        }
        for (int i = 0; i < Hasil.length; i++) {
            for (int j = 0; j < Hasil[i].length; j++) {
                System.out.print(Hasil[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
