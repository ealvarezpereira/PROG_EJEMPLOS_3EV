/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofechas;

import javax.swing.JOptionPane;

/**
 *
 * @author quique
 */
public class EjemploFechas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Metodos met = new Metodos();

        int op = Integer.parseInt(JOptionPane.showInputDialog("***MENU***"
                + "\n1.- Fecha de alta"
                + "\n2.- Fecha de baja"
                + "\n3.- Tiempo entre fechas"
                + "\n4.- Años de antiguedad"
                + "\n5.- LocalDate fecha alta"
                + "\n6.- LocalDate fecha baja"
                + "\n7.- LocalDate tiempo entre fechas"));

        while (op != 0) {

            switch (op) {

                case 0:
                    System.exit(0);
                    break;
                    
                case 1:
                    met.establecerFechaAlta();
                    break;
                    
                case 2:
                    met.establecerFechaBaja();
                    break;

                case 3:
                    met.tiempoEntreFechas();
                    break;

                case 4:
                    met.tiempoHastaHoy();
                    break;

                case 5:
                    met.fechaAltaTime();
                    break;

                case 6:
                    met.fechaBajaTime();
                    break;

                default:
                    System.out.println("Error");
            }

            op = Integer.parseInt(JOptionPane.showInputDialog("***MENU***"
                    + "\n1.- Fecha de alta"
                    + "\n2.- Fecha de baja"
                    + "\n3.- Tiempo entre fechas"
                    + "\n4.- Años de antiguedad"
                    + "\n5.- LocalDate fecha alta"
                    + "\n6.- LocalDate fecha baja"
                    + "\n7.- LocalDate tiempo entre fechas"));
        }
    }

}
