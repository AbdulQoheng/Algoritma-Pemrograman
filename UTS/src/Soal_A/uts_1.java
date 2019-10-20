/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal_A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author qoheng
 */
public class uts_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String pilihan;
        int jmlfotokopi;
        for (int i = 0; i < 2; i++) {
            System.out.print("Masukkan jumlah fotokopi : ");
            jmlfotokopi = Integer.parseInt(input.readLine());

            System.out.print("Pelanggan lama atau baru : ");
            pilihan = input.readLine();

            if (pilihan.equals("lama")) {
                System.out.println("Jumlah fotokopi = " + jmlfotokopi);
                System.out.println("Biaya Foto kopi = Rp." + (jmlfotokopi * 75) + ",-");

            } else if (pilihan.equals("baru")) {
                if (jmlfotokopi < 100) {
                    System.out.println("Jumlah fotokopi = " + jmlfotokopi);
                    System.out.println("Biaya Foto kopi = Rp." + (jmlfotokopi * 150) + ",-");
                } else if (jmlfotokopi >= 100 && jmlfotokopi <= 200) {
                    System.out.println("Jumlah fotokopi = " + jmlfotokopi);
                    System.out.println("Biaya Foto kopi = Rp." + (jmlfotokopi * 100) + ",-");
                } else if (jmlfotokopi > 200) {
                    System.out.println("Jumlah fotokopi = " + jmlfotokopi);
                    System.out.println("Biaya Foto kopi = Rp." + (jmlfotokopi * 80) + ",-");
                }
            }else{
                System.out.println("Inputan Anda Salah!");
            }

            System.out.println();

        }

    }

}
