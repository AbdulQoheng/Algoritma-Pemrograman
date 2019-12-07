/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

import java.awt.Button;
import java.awt.Color;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

/**
 *
 * @author qoheng
 */
public class Praktikum_2b extends JFrame{
    /*
    inisialisasi textInput1 dan button
    */
    double number, answer;
    int calculation;
    
    Label text1 = new Label("Calculator Rizki");
    TextField textInput1 = new TextField();
    Button bt1 = new Button("1");
    Button bt2 = new Button("2");
    Button bt3 = new Button("3");
    Button btTambah = new Button("+");
    Button bt4 = new Button("4");
    Button bt5 = new Button("5");
    Button bt6 = new Button("6");
    Button btKurang = new Button("-");
    Button bt7 = new Button("7");
    Button bt8 = new Button("8");
    Button bt9 = new Button("9");
    Button btKali = new Button("x");
    Button bt0 = new Button("0");
    
    Button btDelete = new Button("C");
    Button btSamaDengan = new Button("=");
    Button btBagi = new Button("/");
    
    /*
     * memanggil frame to main program
     */
    public static void main(String[] args) {
        Praktikum_2b gui = new Praktikum_2b();
        gui.addComponent();
        gui.addActionEvent();
    }
    
    /*
    set configuration of class
    */
    Praktikum_2b() {
        setTitle("Calculator Sederhana");
        setLocation(200, 100);
        setSize(300, 370);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    /*
    set layout, text1, and button to frame
    */
    void addComponent() {
        getContentPane().setLayout(null);
        
        getContentPane().setBackground(Color.LIGHT_GRAY);
        getContentPane().add(text1);
        getContentPane().add(textInput1);
        getContentPane().add(bt1);
        getContentPane().add(bt2);
        getContentPane().add(bt3);
        getContentPane().add(btTambah);
        getContentPane().add(bt4);
        getContentPane().add(bt5);
        getContentPane().add(bt6);
        getContentPane().add(btKurang);
        getContentPane().add(bt7);
        getContentPane().add(bt8);
        getContentPane().add(bt9);
        getContentPane().add(btKali);
        getContentPane().add(bt0);
        getContentPane().add(btDelete);
        getContentPane().add(btSamaDengan);
        getContentPane().add(btBagi);
        
        text1.setBounds(100, 15, 140, 10);
        textInput1.setBounds(50, 40, 190, 30);
        
        textInput1.setEditable(false);
        
        
        bt1.setBounds(50, 140, 40, 30);
        bt2.setBounds(100, 140, 40, 30);
        bt3.setBounds(150, 140, 40, 30);
        btTambah.setBounds(200, 90, 40, 30);
        
        bt4.setBounds(50, 190, 40, 30);
        bt5.setBounds(100, 190, 40, 30);
        bt6.setBounds(150,190, 40, 30);
        btKurang.setBounds(200, 140, 40, 30);
        
        bt7.setBounds(50, 240, 40, 30);
        bt8.setBounds(100, 240, 40, 30);
        bt9.setBounds(150, 240, 40, 30);
        btKali.setBounds(200, 190, 40, 30);
        bt0.setBounds(50, 290, 40, 30);
        btDelete.setBounds(50, 90, 140, 30);
        btSamaDengan.setBounds(100, 290, 140, 30);
        btBagi.setBounds(200, 240, 40, 30);
        
        
        textInput1.setBackground(Color.WHITE);
//        bt0.setBounds(100, 240, 40, 30);
//        btDelete.setBounds(50, 240, 40, 30);
//        btSamaDengan.setBounds(150, 240, 40, 30);
//        btBagi.setBounds(200, 240, 40, 30);
        
        setVisible(true);
    }
    
    public void addActionEvent() {
            bt1.addMouseListener((MouseListener) this);
            bt2.addMouseListener((MouseListener) this);
            bt3.addMouseListener((MouseListener) this);
            btTambah.addMouseListener((MouseListener) this);
            bt4.addMouseListener((MouseListener) this);
            bt5.addMouseListener((MouseListener) this);
            bt6.addMouseListener((MouseListener) this);
            btKurang.addMouseListener((MouseListener)this);
            bt7.addMouseListener((MouseListener)this);
            bt8.addMouseListener((MouseListener)this);
            bt9.addMouseListener((MouseListener)this);
            btKali.addMouseListener((MouseListener)this);
            bt0.addMouseListener((MouseListener)this);
            btDelete.addMouseListener((MouseListener)this);
            btSamaDengan.addMouseListener((MouseListener)this);
            btBagi.addMouseListener((MouseListener)this);
    }

    
    public void mouseClicked(MouseEvent e) {
        Object yangdiklik = e.getSource();
       if (yangdiklik == btDelete) {
            //Clearing texts of text1 and text field
            textInput1.setText("");
        } else if (yangdiklik == bt0) {
                textInput1.setText(textInput1.getText() + "0");
            
        } else if (yangdiklik == bt1) {
            textInput1.setText(textInput1.getText() + "1");
        } else if (yangdiklik == bt2) {
            textInput1.setText(textInput1.getText() + "2");
        } else if (yangdiklik == bt3) {
            textInput1.setText(textInput1.getText() + "3");
        } else if (yangdiklik == bt4) {
            textInput1.setText(textInput1.getText() + "4");
        } else if (yangdiklik == bt5) {
            textInput1.setText(textInput1.getText() + "5");
        } else if (yangdiklik == bt6) {
            textInput1.setText(textInput1.getText() + "6");
        } else if (yangdiklik == bt7) {
            textInput1.setText(textInput1.getText() + "7");
        } else if (yangdiklik == bt8) {
            textInput1.setText(textInput1.getText() + "8");
        } else if (yangdiklik == bt9) {
            textInput1.setText(textInput1.getText() + "9");
        } 
        else if (yangdiklik == btTambah) {
            number = Double.parseDouble(textInput1.getText());
            textInput1.setText("");
            calculation = 1;
        } else if (yangdiklik == btKurang) {
            number = Double.parseDouble(textInput1.getText());
            textInput1.setText("");
            
            calculation = 2;
        } else if (yangdiklik == btKali) {
            number = Double.parseDouble(textInput1.getText());
            textInput1.setText("");
            calculation = 3;
        } else if (yangdiklik == btBagi) {
            number = Double.parseDouble(textInput1.getText());
            textInput1.setText("");
            calculation = 4;
        } else if (yangdiklik == btSamaDengan) {
           //Setting functionality for equal(=) button
            if (calculation == 1) {
               
                    answer = number + Double.parseDouble(textInput1.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textInput1.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textInput1.setText(Double.toString(answer));
                    }
            }
            else if (calculation == 2) {
                    answer = number - Double.parseDouble(textInput1.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textInput1.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textInput1.setText(Double.toString(answer));
                    }}
            else if (calculation == 3) {
                    answer = number * Double.parseDouble(textInput1.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textInput1.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textInput1.setText(Double.toString(answer));
                    }}
            else if (calculation == 4) {
                    answer = number / Double.parseDouble(textInput1.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textInput1.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textInput1.setText(Double.toString(answer));
                    }
               
            }
        }
    }

  
    public void mousePressed(MouseEvent e) {
      
    }

   
    public void mouseReleased(MouseEvent e) {
      
    }

   
    public void mouseEntered(MouseEvent e) {
      
    }

   
    public void mouseExited(MouseEvent e) {
      
    }
    
}
