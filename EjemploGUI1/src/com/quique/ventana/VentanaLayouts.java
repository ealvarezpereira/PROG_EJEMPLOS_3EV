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
public class VentanaLayouts {

    JFrame marco;
    JPanel panel;
    JButton bo1, bo2, bo3, bo4, bo5;

    public VentanaLayouts() {

        marco = new JFrame("FlowLayout");

        panel = new JPanel();

        bo1 = new JButton("Boton1");
        bo2 = new JButton("Boton2");
        bo3 = new JButton("Boton3");
        bo4 = new JButton("Boton4");
        bo5 = new JButton("Boton5");
        marco.setSize(600, 300);

        //Le damos las características a todos los componentes.
        bo1.setBackground(Color.yellow);
        bo2.setBackground(Color.blue);
        bo2.setBackground(Color.orange);
        bo3.setBackground(Color.GRAY);
        bo4.setBackground(Color.green);
        bo5.setBackground(Color.magenta);

    }

    public void disFlowLayout() {
        //Aplicamos el layout
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));

        //Añadimos componentes al panel
        panel.add(bo1);
        panel.add(bo2);
        panel.add(bo3);
        panel.add(bo4);
        panel.add(bo5);

        marco.add(panel);

        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        marco.setVisible(true);

    }

    public void disBoxLayout() {
        //Aplicamos el layout
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        //Añadimos componentes al panel
        panel.add(bo1);
        panel.add(bo2);
        panel.add(bo3);
        panel.add(bo4);
        panel.add(bo5);

        marco.add(panel);
        marco.pack();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        marco.setVisible(true);
    }

    public void disBorderLayout() {
        //Aplicamos el layout
        panel.setLayout(new BorderLayout());

        //Añadimos componentes al panel
        panel.add(bo1, BorderLayout.NORTH);
        panel.add(bo2, BorderLayout.SOUTH);
        panel.add(bo3, BorderLayout.EAST);
        panel.add(bo4, BorderLayout.WEST);
        panel.add(bo5, BorderLayout.CENTER);

        marco.add(panel);
        marco.pack();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        marco.setVisible(true);
    }

    public void disGridLayout() {
        //Aplicamos el layout

        panel.setLayout(new GridLayout(3, 2));

        //Añadimos componentes al panel
        panel.add(bo1, BorderLayout.NORTH);
        panel.add(bo2, BorderLayout.SOUTH);
        panel.add(bo3, BorderLayout.EAST);
        panel.add(bo4, BorderLayout.WEST);
        panel.add(bo5, BorderLayout.CENTER);

        marco.add(panel);
        marco.pack();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        marco.setVisible(true);
    }
}
