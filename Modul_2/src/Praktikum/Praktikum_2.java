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
public class Praktikum_2 {
    public static void main(String[] args) {
        
//        Deklarasi
        int gajikotor ;
        double pajak;
        int gajibersih;

//        Input Nilai
        gajikotor = 20000000;
        pajak =  0.1;
        
//        proses
        gajibersih = (int) (gajikotor * pajak);
        
        
        System.out.println("Gaji kotor = "+gajikotor);
        System.out.println("Gaji Bersih = "+gajibersih);
        
    }
    
}
