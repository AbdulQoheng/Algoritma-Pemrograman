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
public class Praktikum_3 {
    public static void main(String[] args) {
        String data[][] = {{"ABDUL","085646668999","Kediri"},{"KUSNO","085646668992","Trenggalek"},{"PONIRAN","085646668999","Bojonegoro"}};
        
        System.out.println("+---------------+-----------------------+---------------+");
        System.out.println("|Nama           |Alamat                 |Alamat         |");
        System.out.println("+---------------+-----------------------+---------------+");
        for (int i = 0; i < data.length; i++) {
            System.out.println("|"+data[i][0]+"     \t|"+data[i][2]+"    \t\t|"+data[i][1]+"\t|");
            System.out.println("+---------------+-----------------------+---------------+");
        }
        
    }
    
}
