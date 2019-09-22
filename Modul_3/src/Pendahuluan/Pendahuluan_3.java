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
public class Pendahuluan_3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        
        if(a>b){
            System.out.println("True");
        }
        
        if(a==b){
            System.out.println("True");
        }else
            System.out.println("False");
        
        if (a==b){
            System.out.println("True");
        }else if(a>=b){
            System.out.println("True");
        }
        
        if (a==b){
            System.out.println("True");
        }else if (a<=b){
            System.out.println("True");
        }else
            System.out.println("False");
        
        switch (b){
            case 1:
                System.out.println("True");
                break;
            case 2:
                System.out.println("True");
                break;
            case 3:
                System.out.println("True");
                break;
            default :
                System.out.println("Tidak ada");
                break;
        }
    }
    
}
