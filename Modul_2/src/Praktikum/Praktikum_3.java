/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author qoheng
 */
public class Praktikum_3 {
    public static void main(String[] args) {
        
//        Deklarasi dan inisialisasi
        int cicilan;
        int ONH = 50000000;
        int tabungan_awal = 10000000;
        int target = 23; // Bulan
        
        
//        proses dan ouput

        cicilan = (ONH - tabungan_awal)/target;
        System.out.println("Biaya Haji ONH = "+ONH);
        System.out.println("Tabungan Awal ="+tabungan_awal);
        System.out.println("Target yang di capai = "+target+" Bulan");
        System.out.println("Cicilan yang harus di bayar per Bulan = "+cicilan);
        
    }
    
}
