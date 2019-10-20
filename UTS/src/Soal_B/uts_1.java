/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal_B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author qoheng
 */
public class uts_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String nama;
        int gaji_pokok;
        int golongan;
        int gaji_total;
        System.out.print("Masukkan Nama : ");
        nama = input.readLine();
        System.out.print("Masukkan Gaji Pokok : ");
        gaji_pokok = Integer.parseInt(input.readLine());
        System.out.print("Masukkan Golongan 1/2/3 : ");
        golongan = Integer.parseInt(input.readLine());
        System.out.println();
        
        if(golongan == 1){
            gaji_total = gaji_pokok + 500000 + 250000;
            System.out.println("Nama : "+nama);
            System.out.println("Gaji total : "+gaji_total);
        }else if (golongan == 2){
            gaji_total = gaji_pokok + 300000 + 200000;
            System.out.println("Nama : "+nama);
            System.out.println("Gaji total : "+gaji_total);
        }else if (golongan == 3){
            gaji_total = gaji_pokok + 100000 + 100000;
            System.out.println("Nama : "+nama);
            System.out.println("Gaji total : "+gaji_total);
        }else{
            System.out.println("Anda salah memasukkan golongan");
        }
        
    }
    
}
