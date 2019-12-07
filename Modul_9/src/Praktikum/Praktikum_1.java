/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author qoheng
 */
public class Praktikum_1 extends JFrame{
    JTextArea nama = new JTextArea(10,10);
    JButton bt = new JButton ("Copy");
    JTextArea txnama = new JTextArea(10,10);
    Praktikum_1 (){
    super ("Coba Event Handling");
        setLocation(200, 300);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);}
    void tampilan(){
    getContentPane().add(nama);
    nama.append("Nama kamu siapa?");
    getContentPane().add(bt);
    getContentPane().add(txnama);
    txnama.setBackground(Color.LIGHT_GRAY);
    getContentPane().setLayout(new FlowLayout());
    setVisible(true);}
    void aksi_reaksi(){
        bt.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
          txnama.append(nama.getSelectedText());}  
        });}
    public static void main(String[] args) {
        Praktikum_1 f = new Praktikum_1();
        f.tampilan();
        f.aksi_reaksi();
    }
    
}
