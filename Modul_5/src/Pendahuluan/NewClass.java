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
public class NewClass {
    public static void main(String[] args) {
        int data[] = {4,6,4,2,8,4,2,11};
        int i=0;
        System.out.println("========== Menggunakan Perulangan While ==========");
        while (i<data.length) {            
            System.out.println(data[i]+ "Index ke : "+i);
            i++;
        }
        
        System.out.println("");
        System.out.println("");
        System.out.println("========== Menggunakan Perulangan do Wile ==========");
        i=0;
        do {            
            System.out.println(data[i]+" Index ke : "+i);
            i++;
        } while (i<data.length);
        
        System.out.println("");
        System.out.println("========== Menggunakan Perulangan For ==========");
        for (i = 0; i < data.length; i++) {
            System.out.println(data[i]+" Index ke : "+i);
            
        }
    }
    
}
