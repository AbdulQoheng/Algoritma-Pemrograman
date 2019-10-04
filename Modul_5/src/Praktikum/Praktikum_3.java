/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author qoheng
 */
public class Praktikum_3 {
    public static void main(String[] args) throws IOException {
        System.out.println("========== NIM Genap ==========");
        System.out.println("");
        int index = Integer.parseInt(JOptionPane.showInputDialog("Masukkan panjang Data :"));
        int data[] = new int[index];
        for (int i = 0; i < data.length; i++) {
            data[i]=Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai : "));           
        }
        System.out.println("Nilai yang di inputkan : ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+"  ");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Mencari Nilai Terbesar dan Terkeci beserta indexnya : ");
        int Max=data[0], Min=data[0];
        int indexMax = 0, indexMin = 0;
        for (int i = 0; i < data.length; i++) {
            if(data[i]>Max){
                Max = data[i];
                indexMax = i;
            }
            
            if(data[i]<Min){
                Min = data[i];
                indexMin = i;
            }
        }
        System.out.println("Nilai terbesar ["+indexMax+"] ==> "+Max);
        System.out.println("Nilai terkecil ["+indexMin+"] ==> "+Min);
        
        System.out.println("");
        System.out.println("Mencari Nilai rata - rata : ");
        int penjumlahan = 0;
        double ratarata;
        for (int i = 0; i < data.length; i++) {
            penjumlahan += data[i];
        }
        ratarata =(double)penjumlahan / data.length;
        System.out.println("nilai rata - rata adalah : "+ratarata);
        
        System.out.println("");
        System.out.println("Penjumlahan index genap dan ganjil : ");
        int nimgenap = 0;
        int nimganjil = 0;
        
        for (int i = 0; i < data.length; i++) {
            if(i%2 == 1){
                nimgenap += data[i];
            }else{
                nimganjil += data[i];
            }
        }
        System.out.println("penjumlahan index genap dari Nim ganjil : "+nimganjil);
        System.out.println("penjumlahan index ganjil dari Nim genap : "+nimgenap);
        
        System.out.println("");
        System.out.println("Mencari ganjil dan genap dari penjumlahan index : ");
        if(nimgenap%2 == 0){
            System.out.println(nimgenap+" adalah bilaingan genap");
        }else{
            System.out.println(nimgenap+" adalah bilangan ganjil");
        }
        
        if(nimganjil%2 == 0){
            System.out.println(nimganjil+" adalah bilangan genap");
        }else{
            System.out.println(nimganjil+" adalah bilangan ganjil");
        }
        
        System.out.println("");
        System.out.println("Mengurutkan data :");
        Arrays.sort(data);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println();
        
        System.out.println("");
        System.out.println("========== NIM Ganjil ==========");
        System.out.println("");
        BufferedReader indata = new BufferedReader(new InputStreamReader(System.in));
        String input;
        System.out.print("Masukkan panjang data : ");
        input =indata.readLine();
        int index1 = Integer.parseInt(input);
        int data1[] = new int[index1];
        for (int i = 0; i < data1.length; i++) {
            System.out.print("Masukkan Nilai : ");
            input =indata.readLine();
            data1[i]=Integer.parseInt(input);
        }
        System.out.println("Nilai yang di inputkan : ");
        for (int i = 0; i < data1.length; i++) {
            System.out.print(data1[i]+"  ");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Mencari Nilai Terbesar dan Terkeci beserta indexnya : ");
        int Max1=data1[0], Min1=data1[0];
        int indexMax1 = 0, indexMin1 = 0;
        for (int i = 0; i < data1.length; i++) {
            if(data1[i]>Max1){
                Max1 = data1[i];
                indexMax1 = i;
            }
            
            if(data1[i]<Min1){
                Min1 = data1[i];
                indexMin1 = i;
            }
        }
        System.out.println("Nilai terbesar ["+indexMax1+"] ==> "+Max1);
        System.out.println("Nilai terkecil ["+indexMin1+"] ==> "+Min1);
        
        System.out.println("");
        System.out.println("Mencari Nilai rata - rata : ");
        int penjumlahan1 = 0;
        double ratarata1;
        for (int i = 0; i < data1.length; i++) {
            penjumlahan1 += data1[i];
        }
        ratarata1 =(double)penjumlahan1 / data1.length;
        System.out.println("nilai rata - rata adalah : "+ratarata1);
        
        System.out.println("");
        System.out.println("Penjumlahan index genap dan ganjil : ");
        int nimgenap1 = 0;
        int nimganjil1 = 0;
        
        for (int i = 0; i < data1.length; i++) {
            if(i%2 == 1){
                nimgenap1 += data1[i];
            }else{
                nimganjil1 += data1[i];
            }
        }
        System.out.println("penjumlahan index genap dari Nim ganjil : "+nimganjil1);
        System.out.println("penjumlahan index ganjil dari Nim genap : "+nimgenap1);
        
        System.out.println("");
        System.out.println("Mencari ganjil dan genap dari penjumlahan index : ");
        if(nimgenap1%2 == 0){
            System.out.println(nimgenap1+" adalah bilaingan genap");
        }else{
            System.out.println(nimgenap1+" adalah bilangan ganjil");
        }
        
        if(nimganjil1%2 == 0){
            System.out.println(nimganjil1+" adalah bilangan genap");
        }else{
            System.out.println(nimganjil1+" adalah bilangan ganjil");
        }
        
        System.out.println("");
        System.out.println("Mengurutkan data :");
        Arrays.sort(data1);
        for (int i = 0; i < data1.length; i++) {
            System.out.print(data1[i]+" ");
        }
        System.out.println();
    }
}
