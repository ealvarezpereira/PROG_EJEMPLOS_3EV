/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclaseinterna;

/**
 *
 * @author quique
 */
public class InternaMetodo {

    public void ver() {

        class Interna {

            public void mostrar() {
                System.out.println("Clase dentro de un metodo");               
            }
        }

        Interna ob = new Interna();
        ob.mostrar();
    }

}
