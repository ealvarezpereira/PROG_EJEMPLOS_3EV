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
public class ExternaInterna {

    private int a = 8;

    public void ver() {
        Interna in = new Interna();
        in.mostrar();
    }

    private class Interna {

        public void mostrar() {
            System.out.println("Desde la clase  interna " + a);
        }
    }
}
