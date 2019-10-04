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
public class NewClass2 {
    public static void main(String[] args) {
        int data[]=new int[10];
        for (int i = 0; i < data.length; i++) {
            data[i] =Integer.parseInt(JOptionPane.showInputDialog("Masukkan Element Index ke "+i));
            System.out.println("Index ke "+i+" adalah "+data[i]);
        }
    }
    
}
