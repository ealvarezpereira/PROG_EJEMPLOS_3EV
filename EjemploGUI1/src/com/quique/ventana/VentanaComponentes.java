/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quique.ventana;

import javax.swing.*;

/**
 *
 * @author quique
 */
public class VentanaComponentes {

    JFrame marco;
    JPanel panel;
    JLabel lblUsu, lblCtra;
    JButton btnOk, btnLimpiar;
    JTextField jtUsu;
    JPasswordField jpCtra;

    public VentanaComponentes() {

        marco = new JFrame();
        panel = new JPanel();
        lblUsu = new JLabel("USUARIO");
        lblCtra = new JLabel("CONTRASEÑA");
        btnOk = new JButton("Ok.");
        btnLimpiar = new JButton("Limpiar");
        jtUsu = new JTextField(5);
        jpCtra = new JPasswordField(5);

        marco.setSize(450, 200);


        panel.add(lblUsu);
        panel.add(jtUsu);
        panel.add(lblCtra);
        panel.add(jpCtra);
        panel.add(btnOk);
        panel.add(btnLimpiar);

        marco.add(panel);
        marco.pack();
        marco.setLocationRelativeTo(null);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);

    }
    

}
