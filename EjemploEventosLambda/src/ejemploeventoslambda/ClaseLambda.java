/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploeventoslambda;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author quique
 */
public class ClaseLambda {

    JFrame marco;
    JPanel panel;
    JButton bverde, brojo, bamarillo;

    public ClaseLambda() {
        this.marco = new JFrame("Ventana eventos");
        this.panel = new JPanel();
        this.bverde = new JButton("Boton Verde");
        this.brojo = new JButton("Boton Rojo");
        this.bamarillo = new JButton("Boton Amarillo");

        this.marco.setSize(300, 100);
        this.panel.add(bverde);
        this.panel.add(bamarillo);
        this.panel.add(brojo);
        this.marco.add(panel);

        //Puedes crear la expresion lambda y añadirsela al boton
        ActionListener al = (ActionEvent ae) -> {
            panel.setBackground(Color.yellow);
        };
        this.bamarillo.addActionListener(al);

        //O añadirsela al boton directamente.
        this.bverde.addActionListener((ActionEvent ae) -> {
            panel.setBackground(Color.green);
        });

        this.brojo.addActionListener((ActionEvent ae) -> {
            panel.setBackground(Color.red);
        });

        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        marco.setVisible(true);
    }

}
