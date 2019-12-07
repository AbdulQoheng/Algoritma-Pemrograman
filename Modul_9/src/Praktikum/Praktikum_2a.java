/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author qoheng
 */
public class Praktikum_2a extends JFrame{
    int total = 0;
    int b = 0;
    int c = 0;
    String operasi = "";
    JFrame f = new JFrame();
    JTextField t = new JTextField();
    Button b1 = new Button("1");
    Button b2 = new Button("2");
    Button b3 = new Button("3");
    Button b4 = new Button("4");
    Button b5 = new Button("5");
    Button b6 = new Button("6");
    Button b7 = new Button("7");
    Button b8 = new Button("8");
    Button b9 = new Button("9");
    Button b0 = new Button("0");
    Button clear = new Button("C");
    Button samadengan = new Button("=");
    Button tambah = new Button("+");
    Button kurang = new Button("-");
    Button kali = new Button("*");
    Button bagi = new Button("/");
    
    public Praktikum_2a() {
        setTitle("Design Preview");
        setLocation(200, 300);
        setSize(350, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void objek() {
        getContentPane().setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        getContentPane().add(t);
        getContentPane().add(b1);
        getContentPane().add(b2);
        getContentPane().add(b3);
        getContentPane().add(b4);
        getContentPane().add(b5);
        getContentPane().add(b6);
        getContentPane().add(b7);
        getContentPane().add(b8);
        getContentPane().add(b9);
        getContentPane().add(b0);
        getContentPane().add(clear);
        getContentPane().add(samadengan);
        getContentPane().add(bagi);
        getContentPane().add(tambah);
        getContentPane().add(kurang);
        getContentPane().add(kali);
        t.setBounds(30, 40, 280, 30);
        b1.setBounds(40, 100, 50, 40);
        b1.setBackground(Color.ORANGE);
        b2.setBounds(110, 100, 50, 40);
        b2.setBackground(Color.ORANGE);
        b3.setBounds(180, 100, 50, 40);
        b3.setBackground(Color.ORANGE);
        tambah.setBounds(250, 100, 50, 40);
        tambah.setBackground(Color.ORANGE);
        b4.setBounds(40, 170, 50, 40);
        b4.setBackground(Color.ORANGE);
        b5.setBounds(110, 170, 50, 40);
        b5.setBackground(Color.ORANGE);
        b6.setBounds(180, 170, 50, 40);
        b6.setBackground(Color.ORANGE);
        kurang.setBounds(250, 170, 50, 40);
        kurang.setBackground(Color.ORANGE);
        b7.setBounds(40, 240, 50, 40);
        b7.setBackground(Color.ORANGE);
        b8.setBounds(110, 240, 50, 40);
        b8.setBackground(Color.ORANGE);
        b9.setBounds(180, 240, 50, 40);
        b9.setBackground(Color.ORANGE);
        kali.setBounds(250, 240, 50, 40);
        kali.setBackground(Color.ORANGE);
        b0.setBounds(40, 310, 50, 40);
        b0.setBackground(Color.ORANGE);
        clear.setBounds(110, 310, 50, 40);
        clear.setBackground(Color.ORANGE);
        samadengan.setBounds(180, 310, 50, 40);
        samadengan.setBackground(Color.ORANGE);
        bagi.setBounds(250, 310, 50, 40);
        bagi.setBackground(Color.ORANGE);
        setVisible(true);
    }

    void reaksi() {
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t.setText(t.getText() + "1");
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t.setText(t.getText() + "2");
            }
        });
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t.setText(t.getText() + "3");
            }
        });
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t.setText(t.getText() + "4");
            }
        });
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t.setText(t.getText() + "5");
            }
        });
        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t.setText(t.getText() + "6");
            }
        });
        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t.setText(t.getText() + "7");
            }
        });
        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t.setText(t.getText() + "8");
            }
        });
        b9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t.setText(t.getText() + "9");
            }
        });
        b0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t.setText(t.getText() + "0");
            }
        });
        tambah.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b = Integer.parseInt(t.getText());
                t.setText(null);
                operasi = "+";
            }
        });
        kurang.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b = Integer.parseInt(t.getText());
                t.setText(null);
                operasi = "-";
            }
        });
        bagi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b = Integer.parseInt(t.getText());
                t.setText(null);
                operasi = "/";
            }
        });
        kali.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b = Integer.parseInt(t.getText());
                t.setText(null);
                operasi = "*";
            }
        });
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b = 0;
                c = 0;
                t.setText(null);
            }
        });
        samadengan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                c = Integer.parseInt(t.getText());
                try {
                    if (operasi.equals("+")) {
                        total = b + c;
                    } else if (operasi.equals("-")) {
                        total = b - c;
                    } else if (operasi.equals("*")) {
                        total = b * c;
                    } else if (operasi.equals("/")) {
                        total = b / c;
                    }
                    t.setText(Integer.toString(total));
                } catch (ArithmeticException z) {
                    t.setText("Error");
                }
            }
        });
    }

    public static void main(String[] args) {
        Praktikum_2a ZZ = new Praktikum_2a();
        ZZ.objek();
        ZZ.reaksi();
    }
    
}
