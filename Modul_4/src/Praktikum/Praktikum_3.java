/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author qoheng
 */
public class Praktikum_3 {

    public static void main(String[] args) throws IOException {
        BufferedReader inData = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("========== Soal A ==========");
        System.out.print("Masukkan Nilai : ");
        int Data = Integer.parseInt(inData.readLine());
        
        if (Data >= 1 && Data <= 10) {
            System.out.println("Valid Number");
        } else {
            System.out.println("Invalid Number");
        }

        System.out.println("========== Soal B ==========");
        System.out.print("Masukkan Nilai : ");
        Data = Integer.parseInt(inData.readLine());
        
        switch (Data) {
            case 1:
                System.out.println("Valid Number");
                break;
            case 2:
                System.out.println("Valid Number");
                break;
            case 3:
                System.out.println("Valid Number");
                break;
            case 4:
                System.out.println("Valid Number");
                break;
            case 5:
                System.out.println("Valid Number");
                break;
            case 6:
                System.out.println("Valid Number");
                break;
            case 7:
                System.out.println("Valid Number");
                break;
            case 8:
                System.out.println("Valid Number");
                break;
            case 9:
                System.out.println("Valid Number");
                break;
            case 10:
                System.out.println("Valid Number");
                break;
            default:
                System.out.println("Invalid Number");
                break;
        }
    }

}
