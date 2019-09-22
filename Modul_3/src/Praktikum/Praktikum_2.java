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
public class Praktikum_2 {
    public static void main(String[] args) throws IOException {
        String a;
        String b;
        String c;
        
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Masukkan data Pertama :");
        a = dataIn.readLine();
        System.out.print("Masukkan data Kedua :");
        b = dataIn.readLine();
        System.out.print("Masukkan data ketiga :");
        c = dataIn.readLine();
        System.out.println("Data yang di masukkan adalah = "+a+", "+b+", "+c);
        
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);
        int z = Integer.parseInt(c);
        int Max = 0;
        int Min = 0;
        
        System.out.println("");
        System.out.println("==========Mencari Nilai Terbesar dan Terkecil==========");
        
//      Mencari nilai Max  
        if(x>y){
            if(x>z){
                Max = x;
            }else{
                Max = z;
            }
            
        }else if (x<y){
            if(y>z){
                Max = y;
            }else{
                Max = z;
            }
        }
        
//        Mencari nilai Min

        if(x<y){
            if(x<z){
                Min = x;
            }else{
                Min = z;
            }
            
        }else if (x>y){
            if(y<z){
                Min = y;
            }else{
                Min = z;
            }
        }
        System.out.println("");
        System.out.println("Nilai Max adalah = "+Max);
        System.out.println("Nilai Min adalah = "+Min);
    }
    
}
