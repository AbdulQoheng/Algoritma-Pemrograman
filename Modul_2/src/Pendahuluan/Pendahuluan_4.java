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
public class Pendahuluan_4 {
    public static void main(String[] args) {
        int a = 30;
        double b = 25.5;
        String x = "35";
        
        String konfersi_a = String.valueOf(a);
        String konfersi_b = String.valueOf(b);
        int konfersi_bstr = Integer.parseInt(x);
        int konfersi_bdbl = (int) b;
        double konfersi_xstr = Double.parseDouble(x);
        
        System.out.println(konfersi_a);
        System.out.println(konfersi_b);
        System.out.println(konfersi_bdbl);
        System.out.println(konfersi_bstr);
        System.out.println(konfersi_xstr);
        
        
        
    }
}
