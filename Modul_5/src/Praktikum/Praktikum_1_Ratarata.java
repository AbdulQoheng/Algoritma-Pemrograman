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
public class Praktikum_1_Ratarata {
    public static void main(String[] args) {
        double[] contoh = new double[30];
        for (int i = 0; i < 30; i++) {
            contoh[i] = 100.0 * Math.random();
        }
        double ratarata = 0.0;
        for (int i = 0; i < 30; i++) {
            ratarata += contoh[i];
        }
        ratarata /= 30;
        System.out.println("Mean 30 bilangan random : "+ratarata);
    }
    
}
