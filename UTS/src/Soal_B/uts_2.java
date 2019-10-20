/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal_B;

/**
 *
 * @author qoheng
 */
public class uts_2 {
     public static void main(String[] args) {
        System.out.println("========== Menampilkan Nilai 1 - 20 ==========");
        for (int i = 1; i <= 20; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        
        System.out.println("========== Menampilkan Ganjil Genap ==========");
        System.out.println("Bilangan Genap : ");
        for (int i = 1; i < 20; i++) {
            if(i%2 == 0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("Bilangan Ganjil :");
        for (int i = 1; i < 20; i++) {
            if(i%2 == 1){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        
        
    }
    
}
