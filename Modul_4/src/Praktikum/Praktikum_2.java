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
        int angka1 = 4, bil1 = 4, PangkatBil1 = 3, faktorial1;
        int angka2 = 5, bil2 = 5, PangkatBil2 = 2, faktorial2;
        int angka3 = 0, bil3 = 0;
        int angka4 = 0, bil4, PangkatBil4;

        System.out.println("========== Soal A ==========");

        for (int i = 1; i < PangkatBil1; i++) {
            angka1 *= bil1;
        }
        for (int j = 1; j < PangkatBil2; j++) {
            angka2 *= bil2;
        }
        System.out.println("jumlahnya adalah = " + (angka1 + angka2));
        System.out.println("");

        System.out.println("========== Soal B ==========");
        bil1 = 1;
        faktorial1 = 5;
        bil2 = 1;
        faktorial2 = 4;

        for (int i = faktorial1; i > 0; i--) {
            bil1 *= i;
        }
        for (int i = faktorial2; i > 0; i--) {
            bil2 *= i;
        }

        System.out.println("jumlahnya adalah = " + (bil1 + bil2));
        System.out.println("");

        System.out.println("========== Soal C ==========");
        
        angka1 = 4;
        angka2 = 5;
        angka3 = 5;
        angka4 = 4;
        bil1 = 4;
        bil2 = 5;
        bil3 = 5;
        bil4 = 4;
        PangkatBil1 = 2;
        PangkatBil2 = 1;
        PangkatBil4 = 2;

        for (int i = 1; i < PangkatBil1; i++) {
            angka1 = bil1 *= bil1;
        }
        for (int k = 1; k < PangkatBil2; k++) {
            angka2 = bil2 * bil2;
        }
        for (int j = 1; j < PangkatBil4; j++) {
            angka4 = bil4 * bil4;
        }
        double hasil = (double) (angka1 + angka2) / angka3 + angka4;
        System.out.print("Nilai dari (4^2 + 5^1) / 5 + 4^2 adalah : ");
        System.out.println(hasil);
        

    }
}
