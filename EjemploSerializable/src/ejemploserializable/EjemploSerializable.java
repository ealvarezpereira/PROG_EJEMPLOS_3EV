/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploserializable;

/**
 *
 * @author quique
 */
public class EjemploSerializable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos obxfich = null;
        obxfich = new Metodos();
        obxfich.escribeFichero("persoas.txt");
        obxfich.leerFichero("persoas.txt");
        obxfich.añadeFichero("persoas.txt");
        obxfich.leerFichero("persoas.txt");
    }

}
