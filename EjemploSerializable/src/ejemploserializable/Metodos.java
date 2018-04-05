/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploserializable;

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

    public void escribeFichero(String fichero) {
        //  MeuObjectOutputStream esc = null;
        ObjectOutputStream fich = null;
        try {
            //  esc = new MeuObjectOutputStream(          
            //         new FileOutputStream(ficheiro));

            fich = new ObjectOutputStream(new FileOutputStream(fichero));
            for (int i = 0; i < 3; i++) // como exemplo gardamos 3 obxectos
            {
                // ollo ! instanciamos os obxectos tipo persoa dentro do bucle

                Persona p = new Persona(cadena("nombre :"), cadena("apellido :"), entero("edad :"), cadena("nombre mascota :"), entero(" numero patas :"));
                // esc.writeObject(p);
                fich.writeObject(p);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fich != null) {
                try {
                    fich.close();
                } catch (IOException ex) {
                    System.out.println("Error " + ex);
                }
            }
        }
    }

    public void añadeFichero(String fichero) {
        MiObjectOutputStream esc = null;
        try {
            esc = new MiObjectOutputStream(
                    new FileOutputStream(fichero, true));

            for (int i = 0; i < 2; i++) // engadimos por exemplo 2 obxectos
            {
                // ollo ! instanciamos os obxectos tipo persoa dentro do bucle

                Persona p = new Persona(cadena("nome :"), cadena("apelido :"), entero("edade :"), cadena("nome mascota :"), entero(" numero patas :"));
                esc.writeObject(p);

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (esc != null) {
                try {
                    esc.close();
                } catch (IOException ex) {
                    System.out.println("Error " + ex);
                }
            }
        }
    }

    public String cadena(String s) {
        return JOptionPane.showInputDialog(s);
    }

    public int entero(String s) {
        return Integer.parseInt(JOptionPane.showInputDialog(s));
    }

    public void leerFichero(String fichero) {
        ObjectInputStream leer = null;
        Persona aux = null;
        try {
            leer = new ObjectInputStream(new FileInputStream(fichero));

            aux = (Persona) leer.readObject();
            while (aux != null) {
                System.out.println(aux.toString());
                aux = (Persona) leer.readObject();
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("erro 1" + ex.getMessage());

        } catch (IOException ex) {
            System.out.println("erro 2" + ex.getMessage());
        } finally {
            if (leer != null) {
                try {
                    leer.close();
                } catch (IOException ex) {
                    System.out.println("erro de peche " + ex.getMessage());
                }
            }
        }
    }

}
