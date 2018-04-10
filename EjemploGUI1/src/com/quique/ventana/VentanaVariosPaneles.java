/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quique.ventana;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author quique
 */
public class VentanaVariosPaneles {

    JFrame marco;
    JPanel panel, panelU, panelC, panelB;
    JLabel lblUsu, lblCtra;
    JButton btnOk, btnLimpiar, btnCancelar;
    JTextField jtUsu;
    JPasswordField jpCtra;

    public VentanaVariosPaneles() {

        marco = new JFrame();
        panel = new JPanel();
        panelU = new JPanel();
        panelC = new JPanel();
        panelB = new JPanel();
        lblUsu = new JLabel("USUARIO");
        lblCtra = new JLabel("CONTRASEÑA");
        btnOk = new JButton("Ok.");
        btnCancelar = new JButton("Cancelar");
        btnLimpiar = new JButton("Limpiar");
        jtUsu = new JTextField(5);
        jpCtra = new JPasswordField(5);

        marco.setSize(600, 300);
    }

    public void disBox() {

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        
        panelU.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelC.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelB.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        panelU.add(lblUsu);
        panelU.add(jtUsu);
        
        panelC.add(lblCtra);
        panelC.add(jpCtra);
        
        panelB.add(btnOk);
        panelB.add(btnCancelar);
        panelB.add(btnLimpiar);
        
        panel.add(panelU);
        panel.add(panelC);
        panel.add(panelB);
        marco.add(panel);
        marco.pack();
        marco.setLocationRelativeTo(null);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}
