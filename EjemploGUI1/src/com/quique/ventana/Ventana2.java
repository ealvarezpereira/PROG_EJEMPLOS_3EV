/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quique.ventana;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author quique
 * 
 * En esta ventana extendemos de JFrame y toda la clase es la ventana.
 */
public class Ventana2 extends JFrame{
    
        JFrame marco;
    JPanel panel;
    JLabel lblUsu, lblCtra;
    JButton btnOk, btnLimpiar;
    JTextField jtUsu;
    JPasswordField jpCtra;
    
    public Ventana2(){
    
        marco = new JFrame();
        panel = new JPanel();
        lblUsu = new JLabel("USUARIO");
        lblCtra = new JLabel("CONTRASEÑA");
        btnOk = new JButton("Ok.");
        btnLimpiar = new JButton("Limpiar");
        jtUsu = new JTextField(10);
        jpCtra = new JPasswordField(4);

        marco.setSize(400, 250);

        panel.add(lblUsu);
        panel.add(jtUsu);
        panel.add(lblCtra);
        panel.add(jpCtra);
        panel.add(btnOk);
        panel.add(btnLimpiar);
        
        panel.setLayout(null);
        
        lblUsu.setBounds(60, 60, 65, 25);
        jtUsu.setBounds(200, 60, 100, 25);
        lblCtra.setBounds(60, 100, 100, 25);
        jpCtra.setBounds(200, 100, 100, 25);
        
        btnOk.setBounds(60, 150, 100, 25);
        btnLimpiar.setBounds(200, 150, 100, 25);

        marco.add(panel);
        marco.setLocationRelativeTo(null);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}
