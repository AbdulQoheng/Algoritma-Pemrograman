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
public class Praktikum_4 {
    public static void main(String[] args) {
        
        int a;
        int b;
        int c;
        
//        format asli Math.pow adalah double, jika ingin integer maka sebelum Math.pow diberi (int)
        
        a = (int) Math.pow(2, 8) + (int) Math.pow(4, 4); // untuk mencari nilai pangkat = (int) Math.pow(nilai, pangkat)
        b = (int) Math.pow(2,2) + ((int) Math.pow(4, 1 ) / (int) Math.pow(2, 2));
        
/* untuk soal yang c
        2x + 6/6-4 = 2x - 2/3
        (2x + 6)/3 = (2x-2)/2
        6x + 18 = 4x - 4
        6x - 4x = -4x - 4
        2x = -4 - 18
        2x = -22
        x = -11
        
*/
        c = -22 / 2;
        
                
        System.out.println("a. 2^8 + 4^4 = "+ a);
        System.out.println("b. 2^2 + 4^1 / 2^2 = "+b);
        System.out.println("c. Nilai X dari 2x + 6/6-4 = 2x - 2/3 = "+c);
    }
    
}
