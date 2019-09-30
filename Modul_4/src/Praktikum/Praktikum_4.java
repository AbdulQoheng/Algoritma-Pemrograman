/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author qoheng
 */
public class Praktikum_4 {

    public static void main(String[] args) throws IOException {
        BufferedReader inGenap = new BufferedReader(new InputStreamReader(System.in));
        int total = 0;

        System.out.println("========== NIM Genap ==========");
        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan Nilai : ");
            int Genap = Integer.parseInt(inGenap.readLine());
            if (Genap % 2 == 1) {
                System.out.println("Angka yang di masukkan Ganjil");
            } else {
                System.out.println("Angka yang anda masukkan Genap");
            }
            total += Genap;
            System.out.println("Hasil jumlah dengan nilai sebelumnya adalah : " + total + "\n");
        }

        System.out.println("========== NIM Ganjil ==========");
        for (int i = 0; i < 5; i++) {
            int Ganjil = Integer.parseInt(JOptionPane.showInputDialog("Masukan nilai ganjil :"));
            if (Ganjil % 2 == 1) {
                JOptionPane.showMessageDialog(null, "Angka yang anda masukkan Ganjil");
            } else {
                JOptionPane.showMessageDialog(null, "Angka yang anda masukkan Genap");
            }
            total += Ganjil;
            System.out.println("Hasil jumlah dengan nilai sebelumnya adalah : " + total + "\n");
        }
    }

}
