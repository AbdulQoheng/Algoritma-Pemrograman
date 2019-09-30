/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pendahuluan;

/**
 *
 * @author qoheng
 */
public class Pendahuluan_2 {
    public static void main(String[] args) {
        int i = 1;
        
        System.out.println("========== Perulangan menggunakan while ==========");
        System.out.println("");
        while (i <= 10 ) {
            System.out.print(i+", ");
            i++;
            
        }
        
        System.out.println("");
        System.out.println("");
        System.out.println("========== Perulangan menggunakan do while ==========");
        
        int k = 1;
        
        do {         
            System.out.print(k+", ");
            k++;
        } while (k <= 10);
        
        System.out.println("");
        System.out.println("");
        System.out.println("========== Perulangan menggunakan for ==========");
        
        for (int j = 1; j <= 10; j++) {
            System.out.print(j+", ");
        }
        System.out.println("");
        
        
    }
    
}
