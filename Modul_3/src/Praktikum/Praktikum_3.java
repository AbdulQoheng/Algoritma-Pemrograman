/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

import javax.swing.JOptionPane;

/**
 *
 * @author qoheng
 */
public class Praktikum_3 {

    public static void main(String[] args) {
        double hasiljual = 0;
        String dataIn;
        double komisi1 = 0.1;
        double komisi2 = 0.15;
        double komisi3 = 0.20;
        dataIn = JOptionPane.showInputDialog("Masukkan Hasil Jual Anda");
        hasiljual = Double.parseDouble(dataIn);

        if (hasiljual == 2000000) {
            System.out.println("Anda Mendapatkan 100.000 dan komisi "+(hasiljual*komisi1));
        } else if (hasiljual > 2000000 && hasiljual <= 5000000) {
            System.out.println("Anda Mendapatkan 200.000 dan komisi "+ (hasiljual*komisi2));

        } else if (hasiljual > 5000000){
            System.out.println("Anda Mendapakan 300.00 dan komisi "+(hasiljual*komisi3));
        } else{
            System.out.println("Anda Tidak Mendapatkan Bonus");
        }
    }

}
