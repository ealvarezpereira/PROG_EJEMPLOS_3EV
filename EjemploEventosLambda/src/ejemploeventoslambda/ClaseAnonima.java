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
public class ClaseAnonima {

    JFrame marco;
    JPanel panel;
    JButton bverde, brojo, bamarillo;

    public ClaseAnonima() {
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

        //Al boton le añadimos una clase anonima
        this.bverde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                panel.setBackground(Color.green);
            }
        });

        this.bamarillo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                panel.setBackground(Color.yellow);
            }
        });

        this.brojo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                panel.setBackground(Color.red);
            }
        });

        this.brojo.addActionListener((ActionEvent ae) -> {
            panel.setBackground(Color.red);
        });

        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        marco.setVisible(true);
    }

}
