/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializableej2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author quique
 */
public class Metodos {
    
    
    public void escribirFichero(File fichero) {
        
       ObjectOutputStream fich = null;

        try {

            fich = new ObjectOutputStream(new FileOutputStream(fichero,true));

                Ordenador ord = new Ordenador(new Cpu(numero("Velocidad"), numero("Memoria")), new Pantalla(cadena("Marca"), floatt("Pulgadas")), new Raton(cadena("Tipo")));
                fich.writeObject(ord);
            

        } catch (IOException e) {
            System.out.println("Error " + e);
        } finally {
                try {
                    fich.close();
                    System.out.println("Fichero escrito correctamente");
                } catch (IOException ex) {
                    System.out.println("Error de cierre. " + ex);
                }
        }
    }
    

    public void añadirPersonas(File fichero) {
        
        MiObjectOutputStream fich = null;

        try {

            fich = new MiObjectOutputStream(new FileOutputStream(fichero,true));

                Ordenador ord = new Ordenador(new Cpu(numero("Velocidad"), numero("Memoria")), new Pantalla(cadena("Marca"), floatt("Pulgadas")), new Raton(cadena("Tipo")));
                fich.writeObject(ord);
            

        } catch (IOException e) {
            System.out.println("Error " + e);
        } finally {
                try {
                    fich.close();
                    System.out.println("Fichero escrito correctamente");
                } catch (IOException ex) {
                    System.out.println("Error de cierre. " + ex);
                }
        }
    }

    public String cadena(String s) {
        return JOptionPane.showInputDialog(s);
    }

    public int numero(String s) {
        return Integer.parseInt(JOptionPane.showInputDialog(s));
    }

    public float floatt(String s) {
        return Float.parseFloat(JOptionPane.showInputDialog(s));
    }

    public void leerFichero(File fichero) {
        ObjectInputStream leer = null;
        Ordenador aux = null;
        try {
            leer = new ObjectInputStream(new FileInputStream(fichero));

//            while ((aux = (Ordenador) leer.readObject()) != null) {
//                if (aux instanceof Ordenador) {
//                    System.out.println(aux.toString());
//                } else {
//                    System.out.println("Ya no hay objetos.");
//                    break;
//                }
//            }
            aux = (Ordenador) leer.readObject();
            while (aux != null) {
//                if (leer.readObject() != null) {
                    System.out.println(aux.toString());
                    aux = (Ordenador) leer.readObject();
                    
//                } else {
//                    System.out.println("Ya no hay objetos.");
//                    break;
//                }
            }

        } catch (ClassNotFoundException ex) {
            System.out.println("Error 1" + ex.getMessage());

        } catch (IOException ex) {
            System.out.println("Error 2. IOException.  " + ex.getMessage());
        } finally {
            if (leer != null) {
                try {
                    leer.close();
                    System.out.println("Cerrado correctamente.");
                } catch (IOException ex) {
                    System.out.println("Error de cierre " + ex.getMessage());
                }
            }
        }
    }
    
    
    
    
    
}
