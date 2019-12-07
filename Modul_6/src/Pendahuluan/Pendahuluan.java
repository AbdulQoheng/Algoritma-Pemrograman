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
public class Pendahuluan {
    public static void main(String[] args) {
        int data2[][] = {{4,6,4,7,8,3,2,10},{4,6,4,2,8,8,2,10}};
        
        System.out.println("========== Menggunakan While ==========");
        for (int i = 0; i < data2.length; i++) {
            for (int j = 0; j < data2[0].length; j++) {
                System.out.println("["+i+"]"+"["+j+"] ==>"+data2[i][j]);
            }
            System.out.println();
            
        }
        
        System.out.println("========== Menggunakan While ==========");
        int i = 0;
        int j = 0;
        while (i < data2.length) {            
            while(j < data2[0].length){
                System.out.println("["+i+"]"+"["+j+"] ==>"+data2[i][j]);
                ++j;
            }
            ++i;
            j=0;
            System.out.println();
            
        }
        
        i = 0;
        j = 0;
        
        System.out.println();
        System.out.println("========== Menggunakan Do While ==========");
        do {            
            do {                
                System.out.println("["+i+"]"+"["+j+"] ==>"+data2[i][j]);
                j++;
            } while (j < data2[0].length);
            i++;
            j=0;
            System.out.println();
        } while (i < data2.length);
        
        System.out.println("========== Menggunakan Nilai Rata - Rata ==========");
        int jml = 0;
        double rata = 0;
        for ( i = 0; i < data2.length; i++) {
            for (j = 0; j < data2[0].length; j++) {
                jml += data2[i][j];
            }
        }
        rata = jml/(data2.length * data2[0].length);
        System.out.println("Nilai rata rata = "+rata);
    }
    
}
