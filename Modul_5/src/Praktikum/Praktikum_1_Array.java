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
public class Praktikum_1_Array {
    public static void main(String[] args) {
        int[] data = {20,10,50,30,10};
        int jumlah = 0;
        System.out.print("Isi data anda adalah : ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");
        }
        
        System.out.println();
        
        for (int i = 0; i < data.length; i++) {
        jumlah += data[i];
            
        }
        
        System.out.println("Jumlah isi dari Array adalah = "+jumlah);
    
    
    }
    
}
