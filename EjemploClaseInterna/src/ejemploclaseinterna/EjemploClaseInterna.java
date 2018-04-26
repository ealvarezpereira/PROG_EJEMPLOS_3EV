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
public class EjemploClaseInterna {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ExternaInterna objExterna = new ExternaInterna();
        //ExternaInterna.Interna objInterna = objExterna.new Interna(); //Objeto clase interna
        //objExterna.ver();
        //objInterna.mostrar(); //Solo lo utilizamos cuando la clase no es private
        //Cuando la clase es privada accedemos a traves de un objeto de la clase externa
        
        InternaMetodo im = new InternaMetodo();
        
        im.ver();
        ClaseAnonima cls = new ClaseAnonima();
        
        cls.operacion();
    }
    
}
