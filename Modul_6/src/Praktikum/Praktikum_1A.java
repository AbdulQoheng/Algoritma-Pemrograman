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
public class Praktikum_1A {
    public static void main(String[] args) {
        int[][] tabel = {{1,2,3,4},{5,6,7,8}};
        System.out.println("Jumlah baris = "+tabel.length);
        System.out.println("Jumlah kolom = "+tabel[0].length);
        System.out.println();
        for (int i = 0; i < tabel.length; i++) {
            for (int j = 0; j < tabel[0].length; j++) {
                System.out.print(tabel[i][j]+" ");
                
            }
            System.out.println();
            
        }
    }
}
