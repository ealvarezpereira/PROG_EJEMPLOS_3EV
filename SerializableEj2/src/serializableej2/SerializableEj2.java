/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializableej2;

import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author quique
 */
public class SerializableEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos objfich = null;
        File fich = new File("ordenadores.dat");
        objfich = new Metodos();

        int op = Integer.parseInt(JOptionPane.showInputDialog("MENU\n0.- Salir\n1.- Escribir Fichero\n2.- Añadir Personas\n3.- Leer Fichero"));

        while (op != 0) {

            switch (op) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    objfich.escribirFichero(fich);
                    break;
                case 2:
                    objfich.añadirPersonas(fich);
                    break;
                case 3:
                    objfich.leerFichero(fich);
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
            
            op = Integer.parseInt(JOptionPane.showInputDialog("MENU\n0.- Salir\n1.- Escribir Fichero\n2.- Añadir Personas\n3.- Leer Fichero"));
        }
    }
}
