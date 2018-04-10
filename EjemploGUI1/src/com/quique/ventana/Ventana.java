/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quique.ventana;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author quique
 *
 * En esta ventana creamos un JFrame
 */
public class Ventana {

    JFrame marco;
    JPanel panel1, panel2;

    public Ventana() {

        marco = new JFrame("GUI Quique");
        marco.setSize(800, 600);

        panel1 = new JPanel();
        panel2 = new JPanel();

        panel1.setBounds(0, 0, 800, 250);
        panel2.setBounds(0, 350
                , 800, 250);

        panel1.setBackground(Color.yellow);
        panel2.setBackground(Color.cyan);

        marco.setLayout(null);
        marco.add(panel1);
        marco.add(panel2);

        marco.setLocationRelativeTo(null);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}
