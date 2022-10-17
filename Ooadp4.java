/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ooadpractical4;

import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Ooadp4 implements ActionListener {
    String id1;
    Frame f;
    
    Ooadp4() {
        f = new Frame();
        Button b1 = new Button("read file");
    Button b2 = new Button("save file");
    Button b3 = new Button("copy file");
    Button b4 = new Button("delete file");
b1.addActionListener(this);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.setVisible(true);
        b1.setVisible(true);
        b2.setVisible(true);
        b3.setVisible(true);
        b4.setVisible(true);
     
        f.setBounds(500, 500, 200, 200);
        b1.setBounds(50, 50, 80, 70);
        b2.setBounds(200, 50, 80, 70);
        b3.setBounds(400, 50, 80, 70);
        b4.setBounds(600, 50, 80, 70);
        f.setLayout(null);
        f.setSize(800, 800);
        b1.setBackground(Color.pink);
        b2.setBackground(Color.yellow);
        b3.setBackground(Color.pink);
        b4.setBackground(Color.yellow);
        
      //  b1.setActionCommand("b1");
        id1=b1.getActionCommand();
    }

    public static void main(String[] args) {
        new Ooadp4();
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("hhhhhhhhhhhhh");
        System.out.println(e.getActionCommand());
       /* if (e.getActionCommand().equals(id1)) {
            Frame f1 = new Frame();
            TextField tf = new TextField("Add path");
            tf.setBounds(50, 100, 200, 30);
            Button b5 = new Button("load");
            b5.setBounds(50, 50, 80, 70);
            f1.add(b5);
            f1.add(tf);
            f1.setSize(800, 800);
            f1.setLayout(null);
            f1.setVisible(true);
            f1.setBounds(500, 500, 200, 200);
        }
*/
    }

}
