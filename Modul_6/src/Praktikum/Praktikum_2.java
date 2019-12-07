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
        int loop1;
        int loop2;
        int data2[][] = {{4, 6, 4, 2, 8, 4, 2, 10}, {4, 6, 4, 2, 8, 4, 2, 10}};
        for (int i = 0; i < data2.length; i++) {
            for (int j = 0; j < data2[0].length; j++) {
                System.out.print(data2[i][j] + " ");
            }
            System.out.print("\n");

        }

        System.out.println("========== Soal A While ==========");
        loop1 = 0;
        loop2 = 0;
        while (loop1 < data2.length) {
            while (loop2 < data2[0].length) {
                System.out.print(data2[loop1][loop2] + " ");
                ++loop2;
            }
            ++loop1;
            loop2 = 0;
            System.out.println();
        }

        System.out.println("========== Soal A Do While ==========");
        loop1 = 0;
        loop2 = 0;

        do {
            do {
                System.out.print(data2[loop1][loop2] + " ");
                loop2++;
            } while (loop2 < data2[0].length);
            loop1++;
            loop2 = 0;
            System.out.println();
        } while (loop1 < data2.length);

        System.out.println("========== Soal B Rata - Rata ========== ");
        int jml = 0;
        for (int i = 0; i < data2.length; i++) {
            for (int j = 0; j < data2[0].length; j++) {
                jml += data2[i][j];
            }

        }
        int rata = jml / (data2.length * data2[0].length);
        System.out.println("Nilai Rata - Rata = " + rata);

        System.out.println("========== Soal C ==========");
        int cari = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai : "));
        int nilaibaru = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Baru : "));
        for (int i = 0; i < data2.length; i++) {
            for (int j = 0; j < data2[0].length; j++) {
                if (cari == data2[i][j]) {
                    data2[i][j] = nilaibaru;
                    System.out.println("baris ke [" + i + "][" + j + "] di ganti dengan nilai " + nilaibaru);
                } else {
                    System.out.println("baris ke [" + i + "][" + j + "] ==> " + data2[i][j]);
                }
            }
            System.out.println();

        }
        System.out.println("Nilai yang telah di rubah :");
        for (int i = 0; i < data2.length; i++) {
            for (int j = 0; j < data2[0].length; j++) {
                System.out.print(data2[i][j] + " ");
            }
            System.out.print("\n");

        }

        System.out.println("========== Soal D ==========");
        int genap = 0;
        int ganjil = 0;

        for (int i = 0; i < data2.length; i++) {
            for (int j = 0; j < data2[0].length; j++) {
                if (j % 2 == 0) {
                    genap += data2[i][j];
                } else {
                    ganjil += data2[i][j];
                }
            }
        }
        System.out.println("Penjumlahan dari index kolom Genap = " + genap);
        System.out.println("Penjumlahan dari index kolom Ganjil = " + ganjil);
    }

}
