/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploeventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author quique
 */
public class Eventos implements ActionListener {

    JFrame marco;
    JPanel panel;
    JButton bverde, brojo, bamarillo;

    public Eventos() {
        this.marco = new JFrame("Ventana eventos");
        this.panel = new JPanel();
        this.bverde = new JButton("Boton Azul");
        this.brojo = new JButton("Boton Rojo");
        this.bamarillo = new JButton("Boton Amarillo");

        this.marco.setSize(300, 100);
        this.panel.add(bverde);
        this.panel.add(bamarillo);
        this.panel.add(brojo);
        this.marco.add(panel);
        this.bverde.addActionListener(this); //Al boton le añadimos un ActionListener
        this.bamarillo.addActionListener(this);
        this.brojo.addActionListener(this);

        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        marco.setVisible(true);
    }

    //Escuchador
    @Override
    public void actionPerformed(ActionEvent e) {
        Object boton = e.getSource();

        if (boton.equals(bverde)) {
        panel.setBackground(Color.GREEN);

        } else if (boton.equals(bamarillo)) {
            
            panel.setBackground(Color.ORANGE);
        } else {
            
            panel.setBackground(Color.red);
        }
    }

}
